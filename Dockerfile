FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/*.jar app.jar
# Expose the port your application runs on
EXPOSE 8080
# Set the Spring profile to production
ENV SPRING_PROFILES_ACTIVE=prod
ENTRYPOINT ["java", "-jar", "app.jar"]