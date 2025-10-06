## 🛡️ Authentication System (Spring Boot)

### 📘 Overview

This project is a simple **Spring Boot Authentication System** that demonstrates how to implement **basic security** and **in-memory authentication** using **Spring Security**.

It provides a foundation for building secure Java backend applications with role-based access control.

---

### ⚙️ Features

* 🔐 **User Authentication** using Spring Security
* 🧠 **In-Memory User Store** (no database yet)
* 🧱 **Modular Project Structure**
* ⚡ **Spring Boot 3+** and **Maven** setup
* 🌐 REST API endpoints for testing login access
* 🧩 Ready for extension (e.g. JWT, database integration, etc.)

---

### 🗂️ Project Structure

```
Authentication/
├── src/
│   ├── main/
│   │   ├── java/com/User/Auth/Playground/Authentication/
│   │   │   ├── AuthenticationApplication.java
│   │   │   ├── SecurityConfig.java
│   │   │   └── HelloController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/User/Auth/Playground/Authentication/
│           └── AuthenticationApplicationTests.java
├── pom.xml
└── README.md
```

---

### 🚀 Getting Started

#### 1️⃣ Clone the Repository

```bash
git clone https://github.com/Ohm-Kel/Authentication.git
cd Authentication
```

#### 2️⃣ Build the Project

Make sure you have **Java 17+** and **Maven** installed, then run:

```bash
mvn clean install
```

#### 3️⃣ Run the Application

```bash
mvn spring-boot:run
```

The app will start at 👉 **[http://localhost:8080](http://localhost:8080)**

---

### 🔑 Default Authentication

| Username | Password | Role  |
| -------- | -------- | ----- |
| user     | password | USER  |
| admin    | admin123 | ADMIN |

*(You can modify these in `SecurityConfig.java`.)*

---

### 🧪 Test Endpoint

Once the app is running, open your browser or use Postman:

* `GET http://localhost:8080/hello`

If authenticated successfully, you’ll receive a welcome message.

---

### 🧰 Technologies Used

* **Java 17+**
* **Spring Boot**
* **Spring Security**
* **Maven**
* **IntelliJ IDEA**

---

### 🧩 Next Steps

* 🔄 Integrate **MySQL or PostgreSQL**
* 🪪 Implement **JWT Authentication**
* 🔐 Add **Role-Based Access Control**
* 🌍 Add **CORS Configuration**

---

### 👨‍💻 Author

**Kelvin Ohm**
💼 [GitHub Profile](https://github.com/Ohm-Kel)
