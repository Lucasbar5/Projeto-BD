FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /projetobd
COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src
RUN mvn clean package -DskipTests


FROM eclipse-temurin:21-jdk-alpine
WORKDIR /projetobd
COPY --from=build /projetobd/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]