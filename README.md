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
   git clone https://github.com/lukeirwin03/UserManagementApp-AdvJava.git
   
2. **Open the project in NetBeans**

3. **Go to Services -> Servers and start your GlassFish server**

4. **Go to your command prompt and navigate to the file path your project is located in**

5. **Create a realm by pasting this command into command prompt:**
   ```sh
   asadmin create-auth-realm --classname com.sun.enterprise.security.auth.realm.jdbc.JDBCRealm --property db-user=root:db-password=Secure.10:jaas-context=jdbcRealm:password-column=password:datasource-jndi=jdbc/securityDatasource:group-table=USERS_GROUPS:user-     
   table=users:group-name-column=groupid:digest-algorithm=none:user-name-column=userid myjdbcRealm

6. **Go to Services -> Databases -> jdbc:derby://localhost:1527/sample [app on APP], right click on Table and click Execute Command**

7. **Paste these two commands into the editor to create tables**
    ```sh
    CREATE TABLE USERS (
     "USERID" VARCHAR(255) NOT NULL,
     "PASSWORD" VARCHAR(255) NOT NULL,
     PRIMARY KEY ("USERID")
    );
 
    CREATE TABLE USERS_GROUPS (
      "GROUPID" VARCHAR(20) NOT NULL,
      "USERID" VARCHAR(255) NOT NULL,
      PRIMARY KEY ("GROUPID")
    );
 
   INSERT INTO USERS (userid, password) VALUES ('jerry', 'jerry1234');
   INSERT INTO USERS_GROUPS (userid, groupid) VALUES ('jerry', 'user');
 
   INSERT INTO USERS (userid, password) VALUES ('admin', 'admin1234');
   INSERT INTO USERS_GROUPS (userid, groupid) VALUES ('admin', 'admin');
    

8. **Go to Projects, right click the project and click 'Clean and Build'**

9. **Open up a web browser of your choice, and in the search bar type "localhost:8080/UserManagement02-1.0-SNAPSHOT/login.html"**

10. **Go through the functionality of our web page!**
