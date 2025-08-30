# Delivery Website

### Spring - Svelte - PostgreSQL

---

### Running with docker-compose

1. Create a .env file according to .env-example for the database credentials

2. Do the same with the backend file `application.properties`, according to `application-example.properties`.

3. Run with docker-compose: 
```
docker-compose up --build
```
 
The website will be accessible on `http://localhost:5173/` (front-end).
The back-end runs on `http://localhost:8080/` with a website build with Thymeleaf,
and on `http://localhost:8080/api/` for the REST API consumed by the front-end. 

This is mainly because it was a project used to study the back-end/front-end integration and also
using Docker to help it.

The `docker-compose.yml` also uses a postgres image with the SQL scripts inside `db/init/`

---

