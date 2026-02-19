# Uber-like Application - Backend

## Tech Stack

- Java
- Spring Boot
- H2 database

## Description

This project is an Uber-like application that allows users to request transportation services similar to Uber. The goal is to simplify the transportation process, reduce interaction with the driver, and ensure faster, more consistent, and safer transportation for users. The application caters to four types of users:

1. Unregistered Users - They can view basic information about the application and enter their pickup and drop-off locations to get estimated time and cost for transportation.

2. Registered Users - They can request rides, receive real-time notifications about the status of their ride, track vehicles on the map, rate drivers and vehicles after the ride, and access their ride history. They can also schedule future rides to prioritize assignment during peak hours. Additionally, users can define favorite routes for quick selection and use the PANIC button during a ride to alert the dispatcher of any issues. They can also update their profile information and contact support for assistance.

3. Drivers - They are automatically assigned rides by the system and receive pickup and drop-off locations. They can edit their profile, view their ride history, generate ride reports, and access the PANIC button. Drivers can manually switch their availability status and will be marked as unavailable if they exceed 8 working hours in a day.

4. Administrators - They can create driver accounts, view information and ride status of any driver, access driver history and generate reports. Administrators can block users and drivers, respond to PANIC notifications, and provide 24/7 live chat support.

## How to Run 
### Prerequisites
* **Java 17** (Verify with `java -version`)
* **PostgreSQL** (Database name: `uber_db`)

### Installation & Run
1. Clone the Repository
```bash
git clone https://github.com/VukRadmilovic/uber-like-backend.git
cd uber-like-backend/uber-like-backend
```
2. Configure Database

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/uber_db
spring.datasource.username=postgres
spring.datasource.password=password
```

3. Build and Run (Windows)
```bash
.\mvnw clean install
.\mvnw spring-boot:run
```

4. Build and Run (Linux/macOS)
```bash
./mvnw clean install
./mvnw spring-boot:run
```

### API Access
* **Base URL**: http://localhost:8080

## Related repositories
1. [Frontend](https://github.com/VukRadmilovic/uber-like-frontend)
2. [Mobile application](https://github.com/VukRadmilovic/uber-like-mobile-app)
