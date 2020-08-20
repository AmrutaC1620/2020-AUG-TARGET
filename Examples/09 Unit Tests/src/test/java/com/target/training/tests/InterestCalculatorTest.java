package com.target.training.tests;


import com.target.training.InterestCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterestCalculatorTest {

    @Test
    void testSimpleInterest() {
        InterestCalculator ic = new InterestCalculator();
        ic.setPrincipal(100000);
        ic.setYears(3);
        ic.setRate(8.5);

        double actual = ic.simpleInterest();
        double expected = 306000;

        assertEquals(expected, actual);
    }
}
