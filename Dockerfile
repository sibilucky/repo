# Use the official OpenJDK image as the base image
FROM openjdk:17-jdk-slim AS build

# Set the working directory in the container
WORKDIR /app

# Copy the jar file from the target folder of your project into the container
COPY target/javamaven-0.0.1-SNAPSHOT.jar /app/javamaven.jar

# Expose the port that your application will run on
EXPOSE 8082

# Define the command to run the application
CMD ["java", "-cp", "/app/javamaven.jar"]



