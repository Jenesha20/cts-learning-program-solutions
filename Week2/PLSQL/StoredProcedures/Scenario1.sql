CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER,
    LastModified DATE
);
INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (1, 1, 'Savings', 1000, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (2, 2, 'Checking', 1500, SYSDATE);

COMMIT;


CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
    CURSOR savings_cursor IS
        SELECT AccountID, Balance
        FROM Accounts
        WHERE AccountType = 'Savings';
    
    v_interest NUMBER;
BEGIN
    FOR account_rec IN savings_cursor LOOP
        
        v_interest := account_rec.Balance * 0.01;
        
       
        UPDATE Accounts
        SET Balance = Balance + v_interest,
            LastModified = SYSDATE
        WHERE AccountID = account_rec.AccountID;
        
        DBMS_OUTPUT.PUT_LINE('Applied interest of ' || v_interest || 
                             ' to account ' || account_rec.AccountID);
    END LOOP;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Monthly interest processing completed.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END ProcessMonthlyInterest;
/
