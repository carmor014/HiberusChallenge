# Build Stage
FROM maven:3.6.1-jdk-8 AS builder
WORKDIR /logistic
COPY pom.xml .
COPY ./src ./src
RUN mvn clean package

# Run Stage
FROM openjdk:8u201-jdk-alpine3.9
WORKDIR WORKSPACE /logistic
COPY --from=builder /logistic/target/logistic-0.0.1-SNAPSHOT.jar .
ENTRYPOINT java -Djava.net.preferIPv4Stack=true -jar logistic-0.0.1-SNAPSHOT.jar