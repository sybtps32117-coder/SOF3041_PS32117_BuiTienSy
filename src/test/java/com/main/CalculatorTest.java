package com.main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    // Phép + 2 + 3 = 5 , nếu code trả về đúng là 5 -> pass, sai -> fail
    void testAdd() {
        assertEquals(5, cal.add(2, 3));
    }
    // Phép trừ
    @Test
    void testSubtract() {
        assertEquals(1, cal.subtract(3, 2));
    }
    // Phép nhân
    @Test
    void testMultiply() {
        assertEquals(6, cal.multiply(2, 3));
    }
    // Phép chia
    @Test
    void testDivide() {
        assertEquals(2, cal.divide(4, 2));
    }
    // Test chia cho 0
    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> cal.divide(4, 0));
    }
}
