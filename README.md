# orchidae-docker
This will start up all required 3rd party services to run orchidae against. I.e.

* redis
* mongodb

To compile custom java applications and start all containers run:

`mvn package && HOST_IP=<YOUR_LOCAL_IP> docker-compose up -d --force-recreate`
