FROM --platform=linux/amd64 openjdk:17-jdk-slim

EXPOSE 8000

RUN apt update && apt install -y curl openjdk-17-jre

WORKDIR /app

COPY ./usercrud/ /app

RUN chmod +x ./gradlew
RUN ./gradlew build
RUN chmod 777 -R ./


CMD ["java", "-jar", "build/libs/usercrud-0.0.1-SNAPSHOT.jar"]

