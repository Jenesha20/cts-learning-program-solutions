# 📰 BlogApp – React Lifecycle Demo

A simple React class-based app that fetches blog posts using lifecycle methods and displays them in a structured layout.

---

## 🎯 Objective

- Demonstrate the use of `componentDidMount()` for data fetching  
- Handle errors gracefully using `componentDidCatch()`  
- Understand the lifecycle of a class component

---

## 🛠️ Tech Stack

- React (Class Components)
- JavaScript (ES6)
- Fetch API
- JSONPlaceholder API

---

## 📁 Project Structure

```

src/
├── Post.js         # Post model class
├── Posts.js        # Class component with lifecycle methods
├── App.js          # Root component
└── index.js

````

---

## 🚀 Getting Started

### 1. Setup the project

```bash
npx create-react-app blogapp
cd blogapp
````

### 3. Run the app

```bash
npm start
```

Open: [http://localhost:3000](http://localhost:3000)

---

## 📷 Output Preview

Displays a list of posts:

```
Blog Posts
-----------
Title 1
Body 1

Title 2
Body 2
...
```

Errors in rendering or fetching are shown using `alert()` via `componentDidCatch()`.

---


