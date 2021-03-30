FROM ghcr.io/graalvm/graalvm-ce:java11-21.0.0.2 as builder
RUN gu install native-image

WORKDIR /app
COPY pom.xml .
COPY .mvn /app/.mvn
COPY mvnw .

RUN ./mvnw dependency:go-offline

COPY src /app/src
RUN ./mvnw package -P native-image

FROM registry.access.redhat.com/ubi8/ubi-minimal
WORKDIR /app
COPY --from=builder /app/target/*.gcpcloudrunbackendapplication /app/application
RUN chmod 775 /app
CMD ["./application"]
