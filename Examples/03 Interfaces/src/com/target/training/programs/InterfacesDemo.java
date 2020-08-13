package com.target.training.programs;

import com.target.training.entity.Cone;
import com.target.training.entity.Shape;
import com.target.training.entity.Triangle;

public class InterfacesDemo {
    public static void main(String[] args) {
        // because interface is a datatype, you can create a variable (reference)
        // however, because interfaces are meant contain abstract methods, it is an abstract type.
        // hence you cannot create an object of an interface
        Shape shape;

        // only way to realize an object of Shape, is to create objects of some concrete classes,
        // which IMPLEMENTS Shape interface

        shape = new Triangle(1.2, 3.4);
        shape.printArea();

//        shape = new Circle(12.34);
        shape.printArea();

//        shape = new Cone(12.34, 10);
        shape.printArea();
    }
}

