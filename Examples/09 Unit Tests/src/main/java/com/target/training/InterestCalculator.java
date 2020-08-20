package com.target.training;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class InterestCalculator {
    private double principal;
    private int years;
    private double rate;

    public InterestCalculator() {
    }

    public InterestCalculator(double principal, int years, double rate) {
        this.principal = principal;
        this.years = years;
        this.rate = rate;
    }

    public double simpleInterest() {
        log.info("This is not a code smell :-)");

        return principal * years * 12 * rate / 100;
    }

}
