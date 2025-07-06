# 🌍 **ORM Learn Project – Spring Data JPA with MySQL**

> 🚀 A beginner-friendly project to learn Spring Data JPA using MySQL, complete with CRUD operations, testing, and configuration best practices.

---

## 📌 **Tech Stack**

* 🔹 **Spring Boot**: `3.1+`
* 🔹 **Java**: `17`
* 🔹 **Database**: MySQL `8.0+`
* 🔹 **ORM**: Spring Data JPA
* 🔹 **Build Tool**: Maven `3.9+`

---

## ✅ **Prerequisites**

| Tool     | Version                      |
| -------- | ---------------------------- |
| ☕ Java   | 21                           |
| 🐬 MySQL | 8.0+                         |
| 🧰 Maven | 3.9+                         |
| 🧠 IDE   | IntelliJ / VS Code / Eclipse |

---

## ⚙️ **Project Setup**

### 🔸 Step 1: Create the MySQL Database

```sql
CREATE DATABASE ormlearn;
```

### 🔸 Step 2: Configure `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ormlearn
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ **Run the Application**

### 🧪 Build and Start the App

```bash
mvn clean install
mvn spring-boot:run
```

### 🔍 Run Tests

```bash
# Run all tests
mvn test

# Run a specific test class
mvn test -Dtest=CountryServiceTest
```

---

## 🧱 **Project Structure**

```
src/
├── main/
│   ├── java/com/cognizant/ormlearn/
│   │   ├── model/          # 📦 JPA Entity classes
│   │   ├── repository/     # 🗃️ Spring Data Repositories
│   │   ├── service/        # 🧠 Business logic
│   │   └── OrmLearnApplication.java
│   └── resources/          # ⚙️ Application configs
└── test/                   # 🧪 Unit & integration tests
```

---

## 🌟 **Key Features**

### 🇨🇮 Country Entity CRUD

* 🆕 Create a country
* 🔍 Read all / by code
* ✏️ Update country details
* ❌ Delete a country
* 🔎 Search using name pattern
* 🔄 Transaction management

### 🧪 Testing Highlights

* ✅ JUnit 5 for unit tests
* 🧪 H2 in-memory DB for integration tests
* 🔀 Test profiles with isolated configs

---

## 💡 **Dev Tips**

### 🛠️ Use H2 for Development (Optional)

Switch to in-memory DB by uncommenting in `application-dev.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
```

### 🔃 Common Maven Commands

```bash
# Skip tests during build
mvn clean install -DskipTests

---
