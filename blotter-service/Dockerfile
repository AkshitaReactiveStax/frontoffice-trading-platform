# Step 1: Build the app
FROM gradle:8.8-jdk17 AS build
WORKDIR /app
COPY . .
RUN ./gradlew :blotter-service:bootJar

# Step 2: Run the app with a smaller JDK base image
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/blotter-service/build/libs/*.jar app.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "app.jar"]