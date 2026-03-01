FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY target/calci_devops-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
