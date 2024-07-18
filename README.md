# Java Projects Repository

Welcome to my Java Projects Repository! 🚀

This repository houses a collection of Java projects that I've developed as part of my journey in learning Java development. Each project here represents a practical application of my skills and knowledge gained through hands-on practice and learning.

## About Me

I am Tamal Barman, an aspiring software engineer passionate about Java development and full-stack web technologies. This repository is a portfolio of my growth and capabilities in Java programming.

## Projects

### Project 1: Weather App

- **Description:** The Weather App is a Java-based web application that integrates with weather APIs to provide real-time weather information. It lets users view current weather conditions, forecasts, and weather details based on user-specified locations.

- **Technologies Used:**
  - **Java Servlet:** Handles server-side logic and integrates with APIs to fetch weather data.
  - **JSP (JavaServer Pages):** Used for dynamic presentation of weather information and rendering HTML content.
  - **HTML:** Provides the structure and markup for the web pages.
  - **CSS:** Styles the HTML elements to enhance the visual presentation and user experience.
  - **JavaScript:** Enhances interactivity on the client side, handling user inputs and dynamic content updates.
  
- **Features:**
  - Fetch and display current weather data including temperature, humidity, and wind speed.
  - Search functionality to retrieve weather information for specific locations.
  - Display weather forecasts for the upcoming days.
  - Responsive user interface for seamless usability across devices.
 
### Project 2: Web Calculator
**Description:** The Web-Based Calculator is a simple, user-friendly web application developed using Java that performs basic arithmetic operations. It provides a clean and intuitive interface for users to carry out addition, subtraction, multiplication, and division with ease.

**Technologies Used:**
- **Java Servlet:** Handles server-side logic and processes user requests for calculations.
- **JSP (JavaServer Pages):** Dynamically generates HTML content to display the calculator interface and results.
- **HTML:** Structures the calculator layout and defines the markup for the web pages.
- **CSS:** Styles the calculator elements to create an intuitive and visually appealing user experience.
- **JavaScript:** Enhances client-side interactivity, handles user inputs, and performs dynamic updates to the calculator interface.

**Features:**
- **Basic Arithmetic Operations:** Perform addition, subtraction, multiplication, and division.
- **User-Friendly Interface:** Simple and clean design for easy use.
- **Real-Time Calculations:** Immediate display of results as users input values.
- **Error Handling:** Displays error messages for invalid inputs or operations.
- **Responsive Design:** Ensures usability across different devices and screen sizes.

### Project 3: Login and Logout Web Application

This project is a simple web application demonstrating login and logout functionality using JSP, Servlets, HTML, and CSS. The application allows users to register, log in, and log out securely.

## Features

- User Registration
- User Login
- Session Management
- Error Handling
- Responsive Design

## Technologies Used

- Java
- JSP (JavaServer Pages)
- Servlets
- HTML5
- CSS3
- JDBC (Java Database Connectivity)
- MySQL

## Getting Started

### Prerequisites

- JDK 8 or higher
- Apache Tomcat 8 or higher
- MySQL Database
- Git

### Setup

1. **Clone the repository**:

    ```bash
    git clone https://github.com/username/repository.git
    cd repository
    ```

2. **Set up the MySQL database**:
    - Create a database named `Loginandlogout`.
    - Run the following SQL script to create the `users` table:

    ```SQL
    CREATE DATABASE Loginandlogout;
    USE Loginandlogout;
    CREATE TABLE users (
        id INT AUTO_INCREMENT PRIMARY KEY,
        username VARCHAR(50) NOT NULL,
        email VARCHAR(100) NOT NULL,
        password VARCHAR(255) NOT NULL
    );
    ```

    - Insert test data:

    ```SQL
    INSERT INTO users (username, email, password) VALUES
    ('user1', 'user1@example.com', 'password1'),
    ('user2', 'user2@example.com', 'password2');
    ```

3. **Configure the project**:
    - Open the project in your favorite IDE (such as IntelliJ IDEA or Eclipse).
    - Ensure the MySQL JDBC driver is included in the project's classpath.
    - Update the database connection settings in `DBUtil.java`:

    ```java
    private static final String URL = "jdbc:mysql://localhost:3306/Loginandlogout";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "yourpassword";
    ```

4. **Deploy to Apache Tomcat**:
    - Add the project to your Apache Tomcat server.
    - Start the Tomcat server and navigate to `http://localhost:8080/your-project-name`.

## Usage

1. **Registration**:
    - Navigate to the registration page and fill in the form to create a new account.

2. **Login**:
    - Navigate to the login page and enter your credentials to log in.

3. **Logout**:
    - Once logged in, you can log out by clicking the logout button to end your session.


## Learning Goals

My primary focus is mastering Java development and related technologies such as Spring Boot, Hibernate, and more. I aim to deepen my understanding of software architecture, data structures, algorithms, and best coding practices through each project.

## Contact Me

Feel free to reach out if you have any questions, suggestions, or opportunities to collaborate. You can connect with me via:

- Email: tamalbarman86@gmail.com
- LinkedIn: https://www.linkedin.com/in/tamalbrman/

## Future Plans

I am committed to expanding my skills further by exploring advanced topics in Java development, contributing to open-source projects, and staying updated with industry trends.
