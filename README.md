## Build

```shell
go build
```

Listen port 8000



### Build in docker
```shell
daryakokoreva/project_otus
docker build -t health --progress=plain .
```

### Запуск контейнера с пробросом порта 8000 на хост машине на 8000 порт в контейнере
```shell
docker run -i -t -p 8000:8000 health:latest
```

### Запуск контейнера с volume

```shell
docker run -i -t -p 8000:8000 -v ./:/tmp/vol health:latest
```

### Просмотреть все контейнеры
```shell
docker container list
```

Зайти в контейнер
```shell
docker exec -it <containerName> sh
```