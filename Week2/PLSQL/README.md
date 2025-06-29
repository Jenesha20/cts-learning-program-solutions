# 🏦 PL/SQL Banking System – Exercises & Procedures

This project contains a set of PL/SQL exercises for simulating core banking operations, including interest calculations, VIP promotions, fund transfers, bonus updates, and more.

---

## 📁 Contents

| File / Object | Description |
|---------------|-------------|
| `Customers`   | Customer data (DOB, Balance, etc.) |
| `Accounts`    | Savings/Checking accounts |
| `Loans`       | Loan details with interest rates and end dates |
| `Employees`   | Employee data with salary & department |
| `Transactions`| Transaction history (deposits, transfers, etc.) |
| `TransactionSeq` | Sequence to auto-generate transaction IDs |
| `ProcessMonthlyInterest` | Procedure to apply 1% interest on savings |
| `UpdateEmployeeBonus`    | Procedure to give bonus based on department |
| `TransferFunds`          | Procedure to safely transfer money between accounts |
| PL/SQL Blocks | For customer VIP flag updates, loan reminders, etc. |

---


## 📦 Setup Instructions

1. **Create the Tables**

```sql
-- Tables: Customers, Accounts, Loans, Employees, Transactions
-- Run these in order
CREATE TABLE Customers (...);
CREATE TABLE Accounts (...);
CREATE TABLE Loans (...);
CREATE TABLE Employees (...);
CREATE TABLE Transactions (...);
````

2. **Insert Sample Data**

```sql
-- Minimal working data for testing
INSERT INTO Customers VALUES (...);
INSERT INTO Accounts VALUES (...);
INSERT INTO Loans VALUES (...);
INSERT INTO Employees VALUES (...);
```

3. **Create Supporting Sequence**

```sql
CREATE SEQUENCE TransactionSeq START WITH 1 INCREMENT BY 1;
```

---

## 🚀 How to Use

### 1. Run Monthly Interest Procedure

```sql
EXEC ProcessMonthlyInterest;
```

### 2. Update Employee Bonus

```sql
EXEC UpdateEmployeeBonus('HR', 10);
```

### 3. Transfer Funds Between Accounts

```sql
EXEC TransferFunds(1, 2, 500);
```

### 4. Promote VIP Customers

```sql
-- PL/SQL block to update VIP flag
BEGIN ... END;
```

### 5. Send Loan Due Reminders

```sql
-- PL/SQL block for loans due in 30 days
BEGIN ... END;
```

---

## ✅ Expected Output

* `DBMS_OUTPUT` will print transaction and update messages.
* Use `SET SERVEROUTPUT ON;` in SQL Developer or Live SQL to view console output.
* Check `SELECT * FROM Accounts` or `SELECT * FROM Employees` to confirm updates.

---

