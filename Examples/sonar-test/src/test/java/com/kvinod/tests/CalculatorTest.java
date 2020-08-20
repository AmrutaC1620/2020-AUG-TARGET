package com.kvinod.tests;

import com.kvinod.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int expected = 10;
        int actual = c.add(12, -2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        Calculator c = new Calculator();
        int expected = 10;
        int actual = c.multiply(2, 5);
        Assertions.assertEquals(expected, actual);
    }
}
