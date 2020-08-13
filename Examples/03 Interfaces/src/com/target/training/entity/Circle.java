package com.target.training.entity;

public class Circle implements Shape {

    // by implementing the interface Shape, this class inherits all the members of the Shape interface
    // 1. public static final double PI
    // 2. public abstract void printArea(); // must be impmlemented/overriddent, else class must be abstract

    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void printArea() {
        double area = PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " units is " + area + " sq.units");
    }
}
