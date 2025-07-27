# 🧮 Score Calculator App – React

A simple React app to calculate and display a student’s average score using **functional components** and **external CSS styling**.

---

## 🎯 Objective

To build a **function component** named `CalculateScore` that:
- Accepts `name`, `school`, `total`, and `goal` as props
- Calculates average score
- Displays the result in a styled box

---

## 🛠️ Tech Stack

- ✅ React (with Create React App)
- ✅ Functional Components
- ✅ External CSS (`mystyle.css`)

---

## 📁 Folder Structure

```

src/
├── components/
│   └── CalculateScore.js
├── stylesheets/
│   └── mystyle.css
├── App.js
└── index.js

````

---

## 🚀 Getting Started

### 1. Install dependencies

```bash
npm install
````

### 2. Start the application

```bash
npm start
```

Open browser at: [http://localhost:3000](http://localhost:3000)

---

## ✨ Sample Output

```jsx
<CalculateScore 
  name="Jenesha Malar" 
  school="Kongu Engineering College" 
  total={430} 
  goal={5} 
/>
```

Displays:

```
Name: Jenesha Malar
School: Kongu Engineering College
Total Score: 430
Goal: 5
Average Score: 86.00
```

Styled with a neat card layout using CSS.

---

