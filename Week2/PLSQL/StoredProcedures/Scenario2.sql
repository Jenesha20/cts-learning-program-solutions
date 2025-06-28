CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Position VARCHAR2(50),
    Salary NUMBER,
    Department VARCHAR2(50),
    HireDate DATE
);
INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (1, 'Alice Johnson', 'Manager', 70000, 'HR', TO_DATE('2015-06-15', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (2, 'Bob Brown', 'Developer', 60000, 'IT', TO_DATE('2017-03-20', 'YYYY-MM-DD'));

COMMIT;
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department IN VARCHAR2,
    p_bonus_percentage IN NUMBER
) IS
    v_bonus_amount NUMBER;
BEGIN
    FOR emp_rec IN (
        SELECT EmployeeID, Salary 
        FROM Employees 
        WHERE Department = p_department
    ) LOOP
       
        v_bonus_amount := emp_rec.Salary * (p_bonus_percentage / 100);
        
        UPDATE Employees
        SET Salary = Salary + v_bonus_amount
        WHERE EmployeeID = emp_rec.EmployeeID;
        
        DBMS_OUTPUT.PUT_LINE('Added bonus of ' || v_bonus_amount || 
                             ' to employee ' || emp_rec.EmployeeID);
    END LOOP;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Bonus update completed for ' || p_department || ' department.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END UpdateEmployeeBonus;
/
