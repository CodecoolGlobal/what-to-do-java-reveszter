# Task Master Project

## Table of Contents
- [Project Overview](#project-overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Running the Tests](#running-the-tests)
- [Usage](#usage)

## Project Overview
Task Master is a web application designed to help users manage their tasks efficiently.
This project includes functionalities such as user registration, login, task management
(add, view, edit, delete), and secure user data handling.

## Prerequisites
Before you begin, ensure you have met the following requirements:
- **Java Development Kit (JDK)**: Version 8 or above
- **Apache Maven**: Version 3.6.3 or above
- **Selenium WebDriver**: Latest version
- **Web Browser**: Firefox (ensure GeckoDriver is installed and configured)
- **Firefox Browser**: Ensure it is installed on your machine

## Installation
1. **Clone the Repository**:
    ```bash
    git clone https://github.com/CodecoolGlobal/what-to-do-java-reveszter.git
    cd task-master
    ```

2. **Install Dependencies**:
    ```bash
    mvn install
    ```

## Running the Application
1. **Start the Application**:
    ```bash
    mvn spring-boot:run
    ```

2. **Access the Application**:
   Open your web browser and navigate to `http://localhost:4040`.

## Running the Tests
To run the tests, follow these IDE-independent steps:

1. **Ensure the Application is Running**:
   Make sure the application is running at `http://localhost:4040`.

2. **Run Tests using Maven**:
    ```bash
    mvn test
    ```
   
### Usage
1. **User Registration**:
    - Open the application and navigate to the registration page to create a new account.

2. **Login**:
    - Use your credentials to log in and access your tasks.

3. **Task Management**:
    - Add, view, edit, and delete tasks from your dashboard.