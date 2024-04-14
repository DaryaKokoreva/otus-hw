FROM golang:alpine3.19

EXPOSE 8000

WORKDIR /app

COPY ./* /app

RUN apk update && apk add curl
RUN go build

RUN ls -l

CMD ./health

