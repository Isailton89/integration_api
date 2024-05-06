FROM openjdk:17-jdk-slim AS build

RUN apt-get update && apt-get install maven -y

WORKDIR /app
COPY . .
RUN mvn clean install

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /target/api-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]
