# Step 1: Build the app
FROM gradle:8.8-jdk17 AS build
WORKDIR /app
COPY . .
RUN ./gradlew :order-service:bootJar

# Step 2: Run the app with a smaller JDK base image
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/order-service/build/libs/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]