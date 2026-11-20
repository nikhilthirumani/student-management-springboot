# Student Management REST API

Spring Boot REST API using MySQL, Spring Data JPA, DTOs and Jakarta Validation.

## Implemented endpoints
- `POST /api/students` — create a student
- `GET /api/students` — list students

GET by ID, PUT and DELETE are not yet included in this uploaded project.

## Requirements
Java 21+, MySQL 8, Maven 3.9+ installed locally

## Run locally
1. Create a MySQL database called `student_management`.
2. Set the `DB_PASSWORD` environment variable to your MySQL password.
3. Check `src/main/resources/application.properties` for database settings.
4. Run `mvn spring-boot:run` in the project directory.
5. API: `http://localhost:8081/api/students`

Example POST JSON:
```json
{"name":"Rahul","age":22,"email":"rahul@example.com","rollNo":101,"subject":"Java"}
```

The GitHub upload includes the Java sources, Maven POM and configuration. The Maven wrapper shell scripts are not included; install Maven locally to run it.\n\nDo not commit real database passwords or API keys.
