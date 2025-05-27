# Use OpenJDK as base image
FROM openjdk:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/portfolio-0.0.1-SNAPSHOT.jar app.jar

# Expose port 
EXPOSE 8089

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
