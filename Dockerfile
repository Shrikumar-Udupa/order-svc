FROM eclipse-temurin:17
COPY build/libs/order-service-0.0.1-SNAPSHOT.jar /opt/app/
WORKDIR /opt/app
EXPOSE 8091
CMD ["java", "-jar", "order-service-0.0.1-SNAPSHOT.jar"]

#updated git