# Build stage

FROM openjdk:17-jdk-alpine AS builder
WORKDIR /app

COPY . .
RUN ./gradlew clean build -x test

# Run stage
FROM openjdk:17-jdk-alpine
WORKDIR /app

COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]

