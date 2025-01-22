# Use an official OpenJDK runtime as a base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/myapp.jar /app/myapp.jar

# Expose the port the app will run on
EXPOSE 8082

# Run the application when the container starts
ENTRYPOINT ["java", "-jar", "myapp.jar"]

