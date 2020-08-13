package com.target.training.programs;

// Note: Do not create more than one class in a single Java Source code

// 1. abstract class cannot be instantiated (can't create objects)
abstract class Shape {
    // 1. abstract methods do not have method body, which means these functions cannot be invoked.
    // 2. to make sure that you cannot invoke abstract methods, Java does not allow you to create
    //    an object of the class containing abstract function. This is done by marking the class
    //    as abstract.
    // 3. all abstract functions, will be inherited to the subclasses, and subclasses must provide
    //    a body for these abstract functions, by overriding.
    // 4. abstract functions force subclasses to have common contract functions
    public abstract void printArea();

    // subclasses cannot override this final function
    public void printAuthorInfo() {
        System.out.println("Name    : Vinod Kumar");
        System.out.println("Email   : vinod@vinod.co");
    }
}

// while overriding a superclass function, the access modifier must be
// of equal of higher visibility/

// visibility order:
// private -> package_level -> protected -> public

class Rectangle extends Shape {
    @Override
    public void printArea() {
    }

}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void printArea() {
        double area = 0.5 * base * height;
        System.out.printf("Area of triangle with base %.2f units and height of %.2f units is %f sq.units",
                base, height, area);
    }
}

class Circle extends Shape {
    private double radius;

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
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " units is " + area + " sq.units");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Shape s1;
        s1 = new Circle(12.34); // upcasting - implicitly done!
        s1.printArea();

        s1 = new Triangle(12.34, 56.78);
        s1.printArea();

        // s1 = new Shape();
    }
}
