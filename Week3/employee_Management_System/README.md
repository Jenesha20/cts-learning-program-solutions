# 💼 **Employee Management System (EMS)**

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.3-brightgreen)
![H2 Database](https://img.shields.io/badge/H2-2.2.224-lightgrey)

> 🔧 A full-featured **Employee Management System** built using Spring Boot, JPA, and Hibernate. Designed for mastering **ORM concepts** with real-world, production-ready code.

---

## 🚀 **Key Features**

* ✅ Full **CRUD** for Employees & Departments
* 🧬 **JPA/Hibernate Mappings** & Relationships
* 🔎 **Custom Query Methods** using Spring Data
* 📊 **Pagination** & **Sorting** for large datasets
* 🕵️‍♂️ **Entity Auditing** to track changes
* 📦 **Projections** for lightweight data fetch
* ⚙️ Hibernate-specific features like **Batch Processing**
* 🌐 RESTful **API Endpoints**
* 🧪 **H2 Console** access for dev testing
* 🛡️ Centralized **Exception Handling**

---

## 🛠️ **Technology Stack**

| Layer       | Tool                           |
| ----------- | ------------------------------ |
| Language    | ☕ Java 21                      |
| Framework   | ⚙️ Spring Boot 3.5.3           |
| ORM         | 🔄 Spring Data JPA + Hibernate |
| DB (Dev)    | 🧪 H2 (in-memory)              |
| Build Tool  | 📦 Maven 3.9+                  |
| Boilerplate | ✨ Lombok                       |

---

## 📁 **Project Structure**

```
src/
├── main/
│   ├── java/com/example/ems/
│   │   ├── config/               # ⚙️ App configurations
│   │   ├── controller/           # 🌐 REST endpoints
│   │   ├── dto/                  # 🔄 Data Transfer Objects
│   │   ├── exception/            # 🚨 Exception handling
│   │   ├── model/                # 🧬 JPA Entities
│   │   ├── projection/           # 🔍 Lightweight data views
│   │   ├── repository/           # 📂 JPA Repositories
│   │   ├── service/              # 🧠 Business logic
│   │   └── EmsApplication.java   # 🏁 Main class
│   └── resources/
│       ├── application.properties # 🔧 Config settings
│       └── data.sql              # 📄 Initial data load
└── test/                         # ✅ Unit & Integration tests
```

---

## ⚙️ **Getting Started**

### 📦 Prerequisites

* ✅ JDK 21
* ✅ Maven 3.9+
* ✅ IntelliJ / Eclipse / VS Code



### ▶️ Run the App

```bash
mvn spring-boot:run
```

🔗 Visit: `http://localhost:8080`

---

## 🌐 **API Endpoints**

### 👨‍💼 Employee Endpoints

| Method | Endpoint                   | Description           |
| ------ | -------------------------- | --------------------- |
| POST   | `/api/employees`           | ➕ Create new employee |
| GET    | `/api/employees`           | 📋 Get all employees  |
| GET    | `/api/employees/paginated` | 📊 Paginated results  |
| PUT    | `/api/employees/{id}`      | ✏️ Update employee    |
| DELETE | `/api/employees/{id}`      | ❌ Delete employee     |
| GET    | `/api/employees/search`    | 🔍 Search by name     |

### 🏢 Department Endpoints

| Method | Endpoint                | Description            |
| ------ | ----------------------- | ---------------------- |
| POST   | `/api/departments`      | ➕ Add new department   |
| GET    | `/api/departments`      | 📋 Get all departments |
| PUT    | `/api/departments/{id}` | ✏️ Update department   |
| DELETE | `/api/departments/{id}` | ❌ Delete department    |

---

## 🗄️ **Database Console**

> 🎯 Dev-friendly H2 Console is enabled

🔗 Visit: `http://localhost:8080/h2-console`

**Connection Settings:**

```
JDBC URL: jdbc:h2:mem:employeedb
Username : sa
Password : (leave empty)
```

---

## 🧪 **Testing**

```bash
# Run all unit & integration tests
mvn test
```

---

## 📌 **Best Practices Followed**

* 🧱 Layered Architecture (Controller → Service → Repository)
* 🔐 `@Transactional` for transaction safety
* 📤 DTOs to decouple API & DB
* 🧯 Global Exception Handling
* 🧾 Entity Audit with timestamps
* 📑 Pagination for scalable queries
* 🧪 Batch inserts using Hibernate
* 🕵️ Efficient data fetching via Projections

---
