FROM openjdk:8
ADD target/App.jar App.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "App.jar"]
