FROM eclipse-temurin:17
COPY order-service-0.0.1-SNAPSHOT.jar /opt/app/
WORKDIR /opt/app
CMD ["java", "-jar", "order-service-0.0.1-SNAPSHOT.jar"]