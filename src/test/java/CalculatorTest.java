package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Should correctly add two numbers")
    void testAddition() {
        int result = calculator.add(5, 3);
        // assertEquals(expected, actual)
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    @DisplayName("Should handle division correctly")
    void testDivision() {
        assertEquals(2.0, calculator.divide(10, 5));
    }

    @Test
    @DisplayName("Should throw exception when dividing by zero")
    void testDivideByZero() {
        // This checks if the specific exception is thrown
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

}
