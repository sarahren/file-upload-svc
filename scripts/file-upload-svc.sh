#!/bin/bash

DIR=$(pwd)
JAVA_OPT=-Xmx1024m
JARFILE=`ls -1r target/*.jar 2>/dev/null | head -n 1`
PID_FILE=$DIR/pid.file
LOG_DIR=$DIR/logs
LOG_FILE=$DIR/logs/file-upload-svc-log.log
RUNNING=N

######### DO NOT MODIFY ########

if [ -f $PID_FILE ]; then
        PID=`cat $PID_FILE`
        if [ ! -z "$PID" ] && kill -0 $PID 2>/dev/null; then
                RUNNING=Y
        fi
fi

start()
{
        if [ $RUNNING == "Y" ]; then
                echo "Application already started"
        else
                rmdir $LOG_DIR
                mkdir $LOG_DIR
                if [ -z "$JARFILE" ]
                then
                        echo "ERROR: jar file not found"
                else
                        nohup java  $JAVA_OPT -jar $JARFILE > $LOG_FILE 2>&1 &
  						echo $! > $PID_FILE
                        echo "Application $JARFILE starting..."
                        tail -f $LOG_FILE
                fi
        fi
}

stop()
{
        if [ $RUNNING == "Y" ]; then
                kill -9 $PID
                rm -f $PID_FILE
                RUNNING="N"
                echo "Application stopped"
        else
                echo "Application not running"
        fi
}

restart()
{
        stop
        start
}

case "$1" in

        'start')
                start
                ;;

        'stop')
                stop
                ;;

        'restart')
                restart
                ;;

        *)
                echo "Usage: $0 {  start | stop | restart  }"
                exit 1
                ;;
esac
exit 0