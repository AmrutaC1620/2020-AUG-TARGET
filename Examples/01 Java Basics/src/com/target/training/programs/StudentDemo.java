package com.target.training.programs;

import com.target.training.entity.Gender;
import com.target.training.entity.Student;

public class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollno(11223);
        s1.setName("Ramesh Kumar");
        s1.setEmail("ramesh.kumar@example.com");
        s1.setGpa(4.5);

        Student s2 = new Student(2345, "Ramya", "ramya@example.com", null, 4.7);
        s2.setGender(Gender.Female);

        s2.print(); // invokes print() from Person class
//        System.out.println(s1);
        s1.print();

    }
}
