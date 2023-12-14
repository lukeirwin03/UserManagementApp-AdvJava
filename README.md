# UserManagementApp-AdvJava
 User Management Application for CIST-3830 Adv Java

## Table of Contents
1. [Introduction](#introduction)
2. [Functional Requirements](#functional-requirements)
3. [Technical Requirements](#technical-requirements)
4. [Architecture](#architecture)
5. [Installation Guide](#installation-guide)

## Introduction

This document provides an overview of the design, functionality, and installation process for the Jakarta EE User Management Application.

## Functional Requirements

The application must include the following features:

1. **New User Registration:** Allow new users to register with the application.
2. **Registered User Login:** Provide a secure login mechanism for registered users.
3. **Password Reset / Change Password:** Allow users to reset their password or change it after login.
4. **User Logout:** Implement a logout functionality for users.
5. **Show and Tell Page:** Include a page where users can present any subject of their choice.
6. **Role-Based Access:** Implement role-based access, ensuring that certain pages are accessible only to logged-in users.

## Technical Requirements

1. **Database:** Utilize a relational database (Java DB - JDBC:derby://localhost:1527/sample [app on APP]).
2. **SQLs:** Use SQL queries for database operations.
3. **Web Technologies:** Employ XHTML or JSP with Expression Language (EL).
4. **Web Browser Compatibility:** Ensure compatibility with modern web browsers (Firefox, IE, Google Chrome).
5. **CSS:** Implement CSS for consistent page layouts and styling.
6. **JavaScript:** Utilize JavaScript for client-side validation and include scripts in external files.

## Architecture

The application follows a basic architecture with the following components:

- **Presentation Layer:** Contains XHTML/JSP pages with EL for dynamic content.
- **Business Logic:** Manages user authentication, authorization, and other business processes.
- **Data Access Layer:** Interacts with the Java DB using SQL queries.
- **CSS and JavaScript Files:** External files for styling and client-side validation.

## Installation Guide

### Prerequisites

Before starting the installation, ensure the following are installed:

- NetBeans 18 IDE 
- Glassfish 3v
- Java DB (Derby) with a database named "sample" and an application user (e.g., app) with appropriate privileges.

### Steps

1. **Clone the Repository:**
   ```sh
   git clone https://github.com/your-username/your-repository.git
   
2. **Open the project in NetBeans**

3. **Go to Services -> Servers and start your GlassFish server**

4. **Go to Projects, right click the project and click 'Clean and Build'**

5. **Open up a web browser of your choice, and in the search bar type "localhost:8080/UserManagement02-1.0-SNAPSHOT/login.html"**

6. **Go through the functionality of our web page!**
