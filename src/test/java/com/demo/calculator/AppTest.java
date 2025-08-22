package com.demo.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * A basic test case
     */
    @Test
    void testApp() {
        assertTrue(true, "This test should always pass");
    }

    /**
     * Example: simple addition check
     */
    @Test
    void testAddition() {
        int a = 5;
        int b = 3;
        assertEquals(8, a + b, "5 + 3 should equal 8");
    }
}
