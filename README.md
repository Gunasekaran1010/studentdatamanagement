 

# School Database Management System

This project is a School Database Management System developed using Java, Spring Boot, and MySQL. It facilitates the organization and management of 
student information including their names, ages, and departments. Additionally, it features user authentication for secure access.

## Features

- **User Authentication**: Secure login system for user access.
- **Student Management**: CRUD operations for student data.
- **Age Filtering**: Ability to filter students based on their age.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

Before running this project, ensure you have the following prerequisites installed:

- Java 11 or higher
- MySQL installed and running
- Maven (for building the project)

## Installation

1. Clone the repository to your local machine.
2. Import the project into your preferred IDE.
3. Configure `src/main/resources/application.properties` with your MySQL credentials.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sampledb
spring.datasource.username=root
spring.datasource.password=your_password_here
```

4. Build and run the project.

## Usage

1. Access the application at `http://localhost:8081`.
2. Use Postman or any API testing tool to interact with the endpoints (e.g., GET, POST, UPDATE, DELETE).

## Endpoints

- `GET /data`: Get a list of all students.
- `GET /studentsOlderThan/{age}`: Get students older than a specified age.
- `POST /post`: Add a new student.
- `DELETE /delete/{id}`: Delete a student by ID.
- `POST /login`: Authenticate user and retrieve student data.

## Contributing

If you'd like to contribute, please fork the repository and create a pull request.
 
