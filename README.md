# File Upload Backend Service
This is the backend service for file upload service. It uses H2 database as in memory db.

NOTE: the service is using port 10086, please make sure the port is available.

## Project setup
'mvn install'

### Modify the script file permission
'chmod +x ./scripts/file-upload-svc.sh'

## Start the service
'./file-upload-svc.sh start'

##  Stop the service
'./file-upload-svc.sh start'

## Restart the service
'./file-upload-svc.sh restart'