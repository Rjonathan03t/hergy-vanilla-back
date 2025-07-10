# Utilise une image Java officielle
FROM eclipse-temurin:21-jdk

# Crée un dossier dans le conteneur
WORKDIR /app

# Copie le fichier jar généré (remplace par ton vrai jar)
COPY target/hergy-vanilla-0.0.1-SNAPSHOT.jar app.jar

# Expose le port 8080 (ou ce que ton app utilise)
EXPOSE 8080

# Démarre l'app
CMD ["java", "-jar", "app.jar"]
