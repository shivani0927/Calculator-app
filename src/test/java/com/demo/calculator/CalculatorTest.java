package com.demo.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test void add_ok() { assertEquals(15.0, Calculator.add(10,5));}
    @Test void sub_ok() { assertEquals(5.0, Calculator.subtract(10,5));}
    @Test void mul_ok() { assertEquals(50.0, Calculator.multiply(10,5));}
    @Test void div_ok() { assertEquals(2.0, Calculator.divide(10,5));}
    @Test void div_by_zero() { assertThrows(ArithmeticException.class, () -> Calculator.divide(10, 0)); }
}
