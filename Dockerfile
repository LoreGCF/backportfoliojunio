FROM amazoncorretto:20-alpine-jdk

COPY target/portfolio-backend-0.0.1-SNAPSHOT.jar.original app.jar

ENTRYPOINT ["java", "-jar","/app.jar"]