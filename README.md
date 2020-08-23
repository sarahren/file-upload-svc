# File Upload Backend Service
This is the backend service for file upload service. It uses H2 database as in memory db.

NOTE: the service is using port 10086, please make sure the port is available.

## Project setup
mvn install

## Start the service
./scripts/file-upload-svc.sh start

##  Stop the service
./scripts/file-upload-svc.sh stop

## Restart the service
./scripts/file-upload-svc.sh restart