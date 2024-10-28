# Task Management API

A Spring Boot application providing a REST API for managing tasks. Supports basic CRUD operations (Create, Read, Update, Delete).

## Getting Started

### Prerequisites

- Java 17
- Maven
- MySQL

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/task-management-api.git
   cd task-management-api
   
2. Configure the database:
  Edit src/main/resources/application.properties with your MySQL configuration.
    properties
      spring.datasource.url=jdbc:mysql://localhost:3306/<your_db_name>
      spring.datasource.username=root
      spring.datasource.password=<yourpassword>
      spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
      spring.jpa.hibernate.ddl-auto=update
      spring.jpa.show-sql=true
      spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

3. Build and run the application:
  sh
    mvn clean install
    mvn spring-boot:run

API Endpoints
  Create a Task
    URL: /api/tasks 
    Method: POST
    Headers: Content-Type: application/json
    Body:
    {
        "taskname": "Sample Task",
        "taskdescription": "This is a sample task.",
        "taskcategory": "General"
    }
    
  Get All Tasks
    URL: /api/tasks
    Method: GET
  
  Get Task by ID
    URL: /api/tasks/{id} 
    Method: GET
  
  Update a Task
    URL: /api/tasks/{id}
    Method: PUT
    Headers: Content-Type: application/json
    Body:
    {
      "taskname": "Updated Task",
      "taskdescription": "This task has been updated.",
      "taskcategory": "Updated Category"
    }
  
  Delete a Task
  URL: /api/tasks/{id}
  Method: DELETE

Built With
  Spring Boot - Framework
  MySQL - Database
  Maven - Dependency Management
  Lombok - Code Generation

Authors
Nick Pugliesi - nickpug9

License
  This project is licensed under the MIT License - see the LICENSE.md file for details.

