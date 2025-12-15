package com.main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAdd() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, App.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, App.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, App.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> App.divide(4, 0));
    }
}
