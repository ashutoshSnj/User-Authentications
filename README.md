# User-Authentications

A **dynamic web application** built with **Java Servlets** and **Apache Tomcat web server** that handles user authentication processes.
This project uses **JDK 21**, allows dynamic storage selection (via database or file storage), and demonstrates **dynamic polymorphism** using the **Factory Pattern**. 
The application follows a **5-layer architecture** for scalability and maintainability and is developed in **Eclipse IDE**.

---

## Features

- User authentication using **Java Servlets** and **JDBC**.
- Supports **dynamic storage selection**:
  - **Database storage**: User credentials are stored in a MySQL database.
  - **File storage**: User credentials are stored in a text file.
- **Dynamic polymorphism** using the **Factory Pattern** to switch between storage methods.
- Follows a **5-layer architecture**:
  1. **Presentation Layer**: Handles user interaction via web pages (HTML, CSS).
  2. **Service Layer**: Processes requests and communicates with business logic.
  3. **Business Logic Layer**: Core logic for user authentication.
  4. **Data Access Layer**: Manages interaction with persistence methods.
  5. **Data Persistence Layer**: Handles actual storage (database or file).
- Modular and scalable design for real-world applications.

---

## Technologies Used

- **Programming Language**: Java (JDK 21)
- **Web Framework**: Servlets (Java EE)
- **Frontend**: HTML and CSS
- **Database**: MySQL (optional, based on persistence method)
- **File Storage**: For alternative data persistence
- **Server**: Apache Tomcat
- **IDE**: Eclipse IDE
- **Design Pattern**: Factory Pattern

---

## Screenshots
### 1. Login Page
![Login Page](webapp/login_page.png)

### 2. Authentication Success
![Authentication Success](webapp/Successfully_login.png)

### 3. Authentication Failure
![Authentication Failure](webapp/not_login.png)
---

## Installation and Setup

Follow these steps to set up and run the project on your local system:

### Prerequisites

1. **JDK 21**: Install the Java Development Kit (JDK) version 21.
2. **Apache Tomcat**: Install a Servlet-compatible web server like Apache Tomcat.
3. **MySQL** (optional for database storage):
   - Ensure you have MySQL installed and running if using database storage.
4. **Eclipse IDE**: Install Eclipse IDE for Java EE developers.
5. **Git**: Install Git to clone the repository.

### Steps to Install and Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/ashutoshSnj/User-Authentications.git
   cd User-Authentications
