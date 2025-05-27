# Use OpenJDK 17 as base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built JAR file into the container
COPY target/*.jar app.jar

# Expose the port Spring Boot runs on (default is 8080)
EXPOSE 8089

# Command to run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
