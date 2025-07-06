# 📚 **Spring Core & Boot Exercises - Library Management System**

## 🧾 **Overview**

This repository contains hands-on solutions for **Spring Core** and **Spring Boot** exercises focused on building a **Library Management System**. The exercises cover:

✨ Basic Spring Configuration
🧩 Dependency Injection (DI)
⚙️ Maven Setup
🧠 Spring IoC Container
🔌 Constructor & Setter Injection
🌐 Spring Boot REST API with H2 Database

---


## 📝 **Exercise Details**

### 📘 **Exercise 1: Basic Spring Configuration**

**🎯 Goal**: Set up a Spring project with XML-based bean configuration.
**🗂️ Key Files**:

* `applicationContext.xml`
* `BookService.java`, `BookRepository.java`
* `LibraryManagementApplication.java`

**▶️ How to Run**:

```bash
mvn clean install

```

**✅ Expected Output**:

```
Book info for ISBN: 123-456-789
```

---

### 🧩 **Exercise 2: Dependency Injection**

**🎯 Goal**: Wire `BookRepository` into `BookService` using XML DI.
**🔧 Key Changes**:

* Updated `applicationContext.xml` with `<property>` injection.

**▶️ How to Run**
```bash
mvn clean install


---

### ⚙️ **Exercise 4: Maven Project Setup**

**🎯 Goal**: Configure Maven with Spring dependencies.
**🗂️ Key File**: `pom.xml` (Includes `spring-context`, `spring-aop`, `spring-webmvc`)

**🔍 How to Validate**:

```bash
mvn clean install
```

---

### 🧠 **Exercise 5: Spring IoC Container**

**🎯 Goal**: Centralized bean management via `applicationContext.xml`.
Same as Ex1, with emphasis on **IoC** container usage.

---

### 🔌 **Exercise 7: Constructor & Setter Injection**

**🎯 Goal**: Use both constructor and setter injection.
**🛠️ Key Changes**:

* `BookService.java`: Constructor + setter
* `applicationContext.xml`: `<constructor-arg>` and `<property>`

**▶️ How to Run**: 
```bash
mvn clean install


---

### 🌐 **Exercise 9: Spring Boot REST API**

**🎯 Goal**: Build a RESTful API using Spring Boot + H2 database.

**🗂️ Key Files**:

* `Book.java` (JPA Entity)
* `BookRepository.java` (Spring Data JPA)
* `BookController.java` (REST Controller)
* `application.properties` (H2 config)

**▶️ How to Run**:

```bash
cd spring_Boot_Application
mvn spring-boot:run
```

**🌍 Endpoints**:

* `POST /books` → Add a book 📖
* `GET /books` → List all books 📚
* 🔗 H2 Console: `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:librarydb`)

**📦 Sample Output**:

```json
// POST /books
{
  "isbn": "123-456-789",
  "title": "Spring in Action",
  "author": "Craig Walls"
}

// GET /books
[
  {
    "isbn": "123-456-789",
    "title": "Spring in Action",
    "author": "Craig Walls"
  }
]
```

---


