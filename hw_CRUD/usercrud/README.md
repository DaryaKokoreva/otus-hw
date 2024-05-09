## Сборка приложения

Минимальная версия `Java 17.0.4.1`

находясь в корне проекта
```shell
./gradlew build
```
приложение будет находится в папке `build/libs`

## Настройка
Приложение запускается с переменными окружения которые можно будет настроить:

```shell
SERVER_PORT - порт проекта на котором будет работать приложение
DATABASE_URL - настраиваемый путь к БД https://howtodoinjava.com/spring-boot2/datasource-configuration/
DATABASE_USERNAME - имя пользователя БД
DATABASE_PASSWORD - пароль БД
```
значения по умолчанию прописаны в файле `resources/application.properties`

## Тест кейсы

создание 
```shell
curl -v -X POST -H 'Content-Type: application/json' -d '{
  "username": "johndoe589",
  "firstName": "John",
  "lastName": "Doe",
  "email": "bestjohn@doe.com",
  "phone": "+71002003040"
}' http://localhost:8080/user
```

Получение
```shell
curl -v http://localhost:8080/user
```

Изменение
```shell
curl -v -X PUT -H 'Content-Type: application/json' -d '{
  "username": "johndoe589",
  "firstName": "John",
  "lastName": "Doe",
  "email": "bestjohn@doe.com",
  "phone": "+71002003040"
}' http://localhost:8080/user/1
```

Удаление
```shell
curl -v -X DELETE http://localhost:8080/user/1
```