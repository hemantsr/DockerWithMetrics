# How to build jar 
./mvnw package 

# How to install docker 
https://docs.docker.com/engine/install/

# How to build docker image
docker build -f Dockerfile -t dockerwithmetrics .

# How to check existing docker images 
docker images

# How to run docker image
docker run -p 8080:8080 dockerwithmetrics

# How to run with docker compose 
docker-compose up

# How to check running docker container 
docker ps 

# Prometheus end point 
http://localhost:9090/targets

# Grafana end point 
http://localhost:3000
1. username : admin 
1. password: admin

