# Build Stage
FROM maven:3.6.1-jdk-8 AS builder
WORKDIR /checkout
COPY pom.xml .
COPY ./src ./src
RUN mvn clean package

# Run Stage
FROM openjdk:8u201-jdk-alpine3.9
WORKDIR WORKSPACE /checkout
COPY --from=builder /checkout/target/checkout-0.0.1-SNAPSHOT.jar .
ENTRYPOINT java -Djava.net.preferIPv4Stack=true -jar checkout-0.0.1-SNAPSHOT.jar