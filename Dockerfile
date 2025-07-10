# Étape 1 : Build Maven
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Étape 2 : Image finale minimaliste
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target/hergy-vanilla-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
