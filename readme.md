# Microservices Project

## Introduction
This project is developed using **Microservices Architecture** with **Spring Boot**, **Thymeleaf**, and **MySQL**. It implements **RESTful APIs** for inter-service communication and leverages **Spring Data JPA** for database management. The project follows a modular approach, making it scalable and maintainable.

### Role
This project was developed as part of a **two-member team**, where I was responsible for **full-stack development**.

### Results
Although the project is not fully completed, with only the **admin page implemented** so far, it has been an excellent **learning experience**. Throughout development, I gained valuable knowledge in:
- **Microservices Architecture**
- **Spring Boot** and **Spring Data JPA**
- **Thymeleaf for UI development**
- **MySQL database management**
- **RESTful API development and inter-service communication**

This project provided hands-on practice in building **scalable and modular systems**, with plans for future enhancements.

## Setup Guide
### Prerequisites
Ensure you have the following installed:
- **Java 17 or later**
- **Spring Boot 3.x**
- **MySQL Server**
- **Maven or Gradle**
- **Postman (optional, for testing APIs)**

### Steps to Run the Project
1. **Clone the Repository**
   ```sh
   git clone <repository-url>
   cd <project-folder>
   ```

2. **Set Up MySQL Database**
   - Create a database named `microservices_db`.
   - Update `application.properties` with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/microservices_db
     spring.datasource.username=root
     spring.datasource.password=yourpassword
     ```

3. **Build and Run the Application**
   - Using Maven:
     ```sh
     mvn clean install
     mvn spring-boot:run
     ```
   - Using Gradle:
     ```sh
     ./gradlew build
     ./gradlew bootRun
     ```

4. **Access the Application**
   - Open the browser and go to: `http://localhost:8080/admin`

5. **Testing APIs**
   - Use Postman or `curl` to test RESTful APIs.
   - Example request:
     ```sh
     curl -X GET http://localhost:8080/api/example
     ```

## Future Enhancements
- Implementing user authentication and authorization.
- Adding more microservices for different functionalities.
- Enhancing frontend with better UI/UX.
- Integrating API Gateway for managing requests.
- Deploying the application using Docker and Kubernetes.

---
This project serves as a great foundation for learning and applying microservices principles, with room for further development and scalability.
