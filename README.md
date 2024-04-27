# Employee Management Service

## Overview
This Employee Management Service is a Java-based application built with Spring Boot framework. It provides services for managing employee records stored in a PostgreSQL database using Hibernate ORM.

## Features
- Create, Read, Update, and Delete employee records
- RESTful API endpoints for interacting with employee data
- Secure authentication and authorization mechanisms
- Integration with PostgreSQL database using Hibernate ORM

## Requirements
- Java 11
- Spring Boot 2.3.4
- PostgreSQL
- Hibernate ORM
- Gradle (for dependency management)

## Installation
1. Clone the repository: https://github.com/Lucky-Rathor/EmployeeManagement.git

2. Navigate to the project directory: cd EmployeeManagementService

3. Configure PostgreSQL database:
- Create a PostgreSQL database named 'employee_management_db'.
- Update the database configuration in `application.properties` file.

4. Build the project: mvn clean install

5. Run the application: com/hiton/employee/HiltonEmployeeManagementApplication.java

6. Access the API endpoints:
- The API documentation can be found at [API Documentation](http://localhost:8080/swagger-ui.html).

## Usage
- Use any REST API client (e.g., Postman) to interact with the provided endpoints.
- Authenticate using the provided authentication mechanism (e.g., JWT token) before accessing secure endpoints.

## Contribution
Contributions are welcome! If you'd like to contribute to this project, feel free to fork the repository and submit a pull request.

## Contact
For any inquiries or support, please contact [Lucky Rathore](mailto: rlucky2000@gmail.com).


