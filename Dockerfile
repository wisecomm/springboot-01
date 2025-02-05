# Build stage

FROM openjdk:17-jdk-alpine AS builder
WORKDIR /home/myspringapp

COPY . .
RUN ./gradlew clean build -x test

# Run stage
FROM openjdk:17-jdk-alpine
WORKDIR /home/myspringapp

COPY --from=builder /home/myspringapp/build/libs/*.jar myspringapp.jar
COPY ./DockerFIle-Include/start.sh start.sh

