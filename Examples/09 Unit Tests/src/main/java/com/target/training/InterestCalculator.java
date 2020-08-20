package com.target.training;

public class InterestCalculator {
    private double principal;
    private int years;
    private double rate;

    public InterestCalculator(){}

    public InterestCalculator(double principal, int years, double rate) {
        this.principal = principal;
        this.years = years;
        this.rate = rate;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double simpleInterest() {
        return principal * years * 12 * rate / 100;
    }

}
