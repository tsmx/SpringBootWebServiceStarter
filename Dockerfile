# Dockerfile for SpringBootWebServiceStarter
FROM openjdk:11-jre-slim
WORKDIR /usr/app
COPY ./target/*-spring-boot.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "/usr/app/app.jar"]