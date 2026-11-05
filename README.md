# Laboratorio 13 – CRUD Completo con Spring Boot y MySQL

## Descripción

Aplicación web desarrollada con Spring Boot que implementa un CRUD completo (Create, Read, Update y Delete) para la gestión de contactos.

Este proyecto forma parte del Laboratorio 13 de Programación Orientada a Objetos y utiliza:

- Java
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

## Estructura del Proyecto

```text
lab13_crud/
├── pom.xml
└── src/main/
    ├── java/com/gremio/
    │   ├── AgendaWebApplication.java
    │   ├── model/
    │   │   └── Contacto.java
    │   ├── repository/
    │   │   └── ContactoRepository.java
    │   ├── service/
    │   │   └── ContactoService.java
    │   └── controller/
    │       └── ContactoController.java
    └── resources/
        ├── templates/
        │   ├── contactos.html
        │   └── formulario.html
        └── application.properties
```

## Base de Datos

El proyecto utiliza MySQL como sistema gestor de base de datos.

Crear la base de datos:

```sql
CREATE DATABASE agenda
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;
```

## Configuración

Editar el archivo:

```properties
src/main/resources/application.properties
```

y configurar las credenciales de MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/agenda
spring.datasource.username=root
spring.datasource.password=TU_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Ejecución

### Windows

```bash
mvnw.cmd spring-boot:run
```

### Linux / Mac

```bash
./mvnw spring-boot:run
```

La aplicación estará disponible en:

```text
http://localhost:8080/contactos
```

## Operaciones CRUD

| Operación | Método | URL |
|-----------|---------|------|
| Crear | POST | /guardar |
| Listar | GET | /contactos |
| Editar | GET | /editar/{id} |
| Actualizar | POST | /actualizar |
| Eliminar | GET | /eliminar/{id} |

## Evidencias de funcionamiento

- Creación de contactos.
- Edición de registros existentes.
- Eliminación de contactos.
- Persistencia de datos en MySQL después de reiniciar la aplicación.

## Autor

**Yuliana González**

Programación Orientada a Objetos  
Laboratorio 13 – CRUD Completo con Spring Boot y MySQL
