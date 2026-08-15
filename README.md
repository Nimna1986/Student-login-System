# 🎓 Student Login System

A Java-based desktop application that provides a secure and user-friendly student authentication system with database integration.

The project was developed to practice **Java, object-oriented programming, database connectivity, authentication, input validation, and GUI-based application development**.

## 🚀 Features

* 🔐 Student login authentication
* 👤 Student registration
* 🔑 Password-based authentication
* 🗄️ Database-backed user information
* ✅ Input validation
* ⚠️ Error handling and user feedback
* 🖥️ Graphical user interface
* 🔄 Database CRUD operations
* 🚪 Logout functionality

## 🏗️ Application Architecture

The application separates the user interface, application logic, and database operations to make the system easier to maintain.

```text
┌─────────────────────────┐
│       User Interface    │
│        Java GUI         │
└────────────┬────────────┘
             │
             ▼
┌─────────────────────────┐
│     Application Logic   │
│   Authentication Logic  │
│     Validation Logic    │
└────────────┬────────────┘
             │
             ▼
┌─────────────────────────┐
│      Database Layer     │
│       JDBC / MySQL      │
└────────────┬────────────┘
             │
             ▼
┌─────────────────────────┐
│         MySQL           │
│    Student Database     │
└─────────────────────────┘
```

## 🛠️ Technologies Used

### Programming Language

* Java

### Database

* MySQL

### Database Connectivity

* JDBC

### Application Design

* Object-Oriented Programming
* MVC principles

### Development Tools

* IntelliJ IDEA / NetBeans
* MySQL
* Git
* GitHub

> Update the IDE section to match the IDE actually used for this project.

## 📂 Project Structure

```text
Student-Login-System/
│
├── src/
│   ├── model/
│   ├── view/
│   ├── controller/
│   ├── database/
│   └── ...
│
├── database/
│   └── database.sql
│
├── screenshots/
│   ├── login.png
│   ├── register.png
│   └── dashboard.png
│
├── README.md
└── .gitignore
```

> Adjust the structure above to match the actual project structure.

## 🗄️ Database

The application uses **MySQL** to store student account information.

A typical student record contains information such as:

| Field      | Description               |
| ---------- | ------------------------- |
| `id`       | Unique student identifier |
| `username` | Student login username    |
| `password` | Student password          |
| `name`     | Student name              |

The database schema required to run the application is included in the `database` directory.

## 🔐 Authentication Flow

The login process follows this general flow:

```text
Student
   │
   ▼
Enter Username & Password
   │
   ▼
Input Validation
   │
   ▼
Send Authentication Request
   │
   ▼
Query MySQL Database
   │
   ├── Valid credentials ──► Login Successful
   │
   └── Invalid credentials ─► Error Message
```

The application validates user input before attempting authentication and provides appropriate feedback when authentication fails.

## ⚙️ Getting Started

### Prerequisites

Install the following before running the application:

* Java JDK
* MySQL Server
* A Java IDE
* MySQL JDBC Driver

### 1. Clone the repository

```bash
git clone YOUR_REPOSITORY_URL
cd Student-Login-System
```

### 2. Create the database

Open MySQL and create the required database.

```sql
CREATE DATABASE student_login;
```

Then execute the SQL script located in:

```text
database/database.sql
```

### 3. Configure the database connection

Update the database connection details in the application's database configuration.

Example:

```java
String url = "jdbc:mysql://localhost:3306/student_login";
String username = "root";
String password = "YOUR_PASSWORD";
```

> Do not commit real database passwords or credentials to GitHub.

### 4. Add the JDBC driver

Make sure the MySQL Connector/J JDBC driver is available to the project.

### 5. Run the application

Open the project in your Java IDE and run the main application class.

## 🖥️ Screenshots

### Login Screen

<img width="1260" height="1114" alt="image" src="https://github.com/user-attachments/assets/6ceb542c-43a3-4b9a-8224-8d714193b75c" />


### Registration Screen

<img width="1272" height="1120" alt="image" src="https://github.com/user-attachments/assets/1395e690-5767-4a80-8d08-8525b98ae6ee" />


### Dashboard

Haven't developed since the same procedure but planning to develop it with admin panel and the students dashboard.


## 🧠 What I Learned

This project helped me strengthen my understanding of several fundamental software engineering concepts.

### Object-Oriented Programming

The application was developed using Java OOP concepts such as:

* Classes and objects
* Encapsulation
* Constructors
* Methods
* Separation of responsibilities

### Database Connectivity

I learned how Java applications communicate with relational databases using **JDBC**, including:

* Establishing database connections
* Executing SQL queries
* Inserting records
* Retrieving records
* Updating data
* Handling SQL exceptions

### Authentication

The project introduced the basic concepts behind user authentication and validating credentials against stored user information.

### Input Validation & Error Handling

The application validates user input and provides meaningful error messages for situations such as:

* Empty fields
* Invalid credentials
* Duplicate usernames
* Database connection failures
* Invalid registration information

### MVC Architecture

The project helped me understand how separating the **Model, View, and Controller** components can make an application easier to understand and maintain.

## 🔒 Security Considerations

This project is primarily a learning project and is **not intended for production authentication**.

Potential improvements for a production implementation include:

* Password hashing using a modern password-hashing algorithm
* Secure credential storage
* Prepared statements for all database queries
* Session management
* Account lockout/rate limiting
* Strong password requirements
* Secure configuration through environment variables

## 🔮 Future Improvements

Possible improvements include:

* Password hashing
* Student profile management
* Role-based authentication
* Admin login
* Password reset functionality
* Account lockout after repeated failed attempts
* Improved UI/UX
* Automated testing
* Migration to a web-based application
* REST API integration

## 📚 Project Purpose

This project was created as a personal learning project to strengthen my understanding of **Java, OOP, SQL, JDBC, authentication, GUI development, and database-backed applications**.

It represents one of my early projects focused on building a complete application rather than isolated programming exercises.

## 👨‍💻 Author

**Nimna Chamathka**

Engineering Undergraduate
University of Moratuwa

GitHub: [Nimna1986](https://github.com/Nimna1986)
