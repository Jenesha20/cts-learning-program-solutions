CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER,
    LastModified DATE
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    LoanAmount NUMBER,
    InterestRate NUMBER,
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);
INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (1, 'John Doe', TO_DATE('1950-05-15', 'YYYY-MM-DD'), 5000, SYSDATE);

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (1, 1, 10000, 6, SYSDATE, ADD_MONTHS(SYSDATE, 60));

COMMIT;
DECLARE
    CURSOR customer_cursor IS
        SELECT c.CustomerID, c.DOB, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID;
    
    v_age NUMBER;
BEGIN
    FOR customer_rec IN customer_cursor LOOP
        -- Calculate age
        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, customer_rec.DOB) / 12);
        
        IF v_age > 60 THEN
            -- Apply 1% discount
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = customer_rec.LoanID;
            
            DBMS_OUTPUT.PUT_LINE('Applied 1% discount to loan ' || customer_rec.LoanID || 
                                 ' for customer ' || customer_rec.CustomerID);
        END IF;
    END LOOP;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Discount application process completed.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
