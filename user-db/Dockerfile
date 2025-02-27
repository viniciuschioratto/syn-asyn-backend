# Stage 1: Build the project
FROM gradle:8.11.1-jdk21 AS builder
WORKDIR /app
COPY . .
RUN gradle clean build -x test

# Stage 2: Run the project
FROM amazoncorretto:21.0.4-alpine
WORKDIR /app
COPY --from=builder /app/build/libs/user-db.jar user-db.jar
CMD ["java", "-jar", "user-db.jar"]
EXPOSE 8080
