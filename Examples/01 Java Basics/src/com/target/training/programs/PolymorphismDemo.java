package com.target.training.programs;

import com.target.training.entity.Customer;
import com.target.training.entity.CustomerType;
import com.target.training.entity.Person;
import com.target.training.entity.Student;

import java.util.Date;

public class PolymorphismDemo {

    public static void main(String[] args) {

        Person p1;
        p1 = new Student(23, "Harish", "harish@xmpl.com", null, 4.4); // instanceof Student, Person, Object

        p1.print(); // prints the details of the student
        // can I print the GPA of the student here using p1?
        double gpa = ((Student) p1).getGpa();
        System.out.println("gpa = " + gpa);

        p1 = new Customer(987, "John", "john@xmpl.com", "9383741234", CustomerType.GOLD);
        // instanceof Customer, Person, Object

        p1.print(); // prints the details of the customer
        // can I print the type of customer using p1 here?

        // gpa = ((Student) p1).getGpa(); // runtime error (Exception)
        // System.out.println("gpa = " + gpa);
    }
}
