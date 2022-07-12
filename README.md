# Altice Labs Exercise

### Name:  Flavio Barbosa

## Requirements
- Java 8

## How to execute

- Clone the repository

```sh
> git clone <repository>
```

- Run commands  

```sh
> cd alticci-backend

> ./mvnw clean package

> java -jar target/Alticci-0.0.1-SNAPSHOT.jar
```

## API Reference

```http
  GET /alticci/${index}
```
| Parameter | Type      | Description                         |
|:----------|:----------|:------------------------------------|
| `index`   | `integer` | **Required**. Index of the sequence |


## Open API

```http
http://localhost:8080/swagger-ui.html
```