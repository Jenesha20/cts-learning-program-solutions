
# 🚀 Design Patterns and Principles

This repository contains Java implementations of common design patterns with clear examples and test cases.



## 🚀Singleton Pattern

### 🧩Scenario
Implement a logging utility class that maintains only one instance throughout the application lifecycle.

### Implementation
- **Logger.java**: Singleton class with:
  - Private static instance
  - Private constructor
  - Public static `getInstance()` method
- **SingletonTest.java**: Demonstrates single instance behavior

### ✅Key Features
- Thread-safe implementation
- Lazy initialization
- Global access point

---

## 🚀Factory Method Pattern

### 🧩Scenario
Create a document management system that generates different document types (Word, PDF, Excel).

### Implementation
#### Document Interfaces
- **Document.java**: Base interface with `open()` and `save()` methods
- **WordDocument.java**: Concrete Word document implementation
- **PdfDocument.java**: Concrete PDF document implementation
- **ExcelDocument.java**: Concrete Excel document implementation

#### Factory Classes
- **DocumentFactory.java**: Abstract factory class
- **WordDocumentFactory.java**: Creates Word documents
- **PdfDocumentFactory.java**: Creates PDF documents
- **ExcelDocumentFactory.java**: Creates Excel documents

### ✅Key Features
- Decouples document creation from usage
- Extensible for new document types
- Centralized creation logic

---



### 🎯Expected Output
#### 📄Singleton
```
LOG: First message
LOG: Second message
Are both instances the same? true
```

#### 📄Factory Method
```
Testing Word Document:
Opening Word document
Saving Word document

Testing PDF Document:
Opening PDF document
Saving PDF document
...
```

---

## Project Structure

### 📁Singleton Pattern
```
SingletonPatternExample/
└── 
   ├── Logger.java
   └── SingletonTest.java
```

### 📁Factory Method Pattern
```
FactoryMethodPatternExample/
└── src/
    └── main/
        └── java/
            ├── documents/
            │   ├── Document.java
            │   ├── WordDocument.java
            │   ├── PdfDocument.java
            │   └── ExcelDocument.java
            ├── factories/
            │   ├── DocumentFactory.java
            │   ├── WordDocumentFactory.java
            │   ├── PdfDocumentFactory.java
            │   └── ExcelDocumentFactory.java
            └── FactoryTest.java
```

Happy Coding! 🎉