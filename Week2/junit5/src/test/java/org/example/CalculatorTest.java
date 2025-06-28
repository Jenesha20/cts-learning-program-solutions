package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("🔧 Setup Calculator");
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
        System.out.println("🧹 Teardown Calculator");
    }

    @Test
    public void testAdd() {
        int result = calculator.add(10, 5);

        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(9, 4);
        assertEquals(5, result);
    }
}
