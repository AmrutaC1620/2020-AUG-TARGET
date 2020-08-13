package com.target.training.entity;

public class Cone extends Circle {
    private double height;

    public Cone() {
    }

    public Cone(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void printArea() {
        double area = PI * radius * (radius + Math.sqrt(height * height + radius * radius));
        System.out.printf("Surface area of cone with radius %f units and height %f units is %f sq.units\n", radius, height, area);
    }
}
