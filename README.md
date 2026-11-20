# Student Management REST API

Spring Boot REST API using MySQL, Spring Data JPA, DTOs and Jakarta Validation.

## Implemented endpoints
- `POST /api/students` — create a student
- `GET /api/students` — list students

GET by ID, PUT and DELETE are not yet included in this uploaded project.

## Requirements
Java 21+, MySQL 8, Maven 3.9+

## Run locally
1. Create a MySQL database called `student_management`.
2. Set the `DB_PASSWORD` environment variable to your MySQL password.
3. Check `src/main/resources/application.properties` for database settings.
4. Run `./mvnw spring-boot:run` (macOS/Linux) or `.\mvnw.cmd spring-boot:run` (Windows).
5. API: `http://localhost:8081/api/students`

Example POST JSON:
```json
{"name":"Rahul","age":22,"email":"rahul@example.com","rollNo":101,"subject":"Java"}
```

Do not commit real database passwords or API keys.
