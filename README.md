# spring-boot dockerized request mapping demo application

* No need download dependencies/build spring-boot app on local machine.
* No need install maven or java on local machine.
* Dockerfile installs Java, Maven and builds the **app.jar** 

# Setup
```$xslt
docker-compose up
```

# Service Usage
```$xslt
http://localhost:8080/
http://localhost:8080/user/
http://localhost:8080/user/hello
http://localhost:8080/user/1
http://localhost:8080/user/hello/makrand
http://localhost:8080/user/city?city=san francisco
```

# Useful Commands
```$xslt
docker-compose up --force-recreate
docker-compose stop
docker-compose rm
docker-compose down --rmi all
```