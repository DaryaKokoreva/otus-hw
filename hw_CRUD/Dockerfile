FROM openjdk:17-jdk-slim

EXPOSE 8000

RUN apt update && apt install -y curl

WORKDIR /app

COPY ./usercrud/ /app

RUN chmod 777 -R ./
RUN pwd
RUN ls -l
RUN ./gradlew build


CMD java -jar build/libs/usercrud-0.0.1-SNAPSHOT.jar

