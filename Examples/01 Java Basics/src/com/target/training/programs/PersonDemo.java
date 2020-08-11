package com.target.training.programs;

import com.target.training.entity.Gender;
import com.target.training.entity.Person;

public class PersonDemo {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("Vinod", "vinod@vinod.co", "9731424784");
        Person p3 = new Person("Satya");
        Person p4 = new Person("Jane", "jane@xmpl.com");
        p4.setGender(Gender.Female);

        p1.setName("Shyam");
        p1.setEmail("shyam@example.com");
        p1.setPhone("9876599887");

        p2.setName("Vinod Kayartaya");

//        System.out.println(p1);
//        System.out.println(p2); // println function invokes p2.toString() implicitly
//        System.out.println(p3);
//        System.out.println(p4);

        p1.print();
        p2.print();
        p3.print();
        p4.print();

    }
}
