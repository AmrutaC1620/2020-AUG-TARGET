package com.target.training.programs;

import com.target.training.entity.Person;

import java.util.HashSet;
import java.util.Set;

public class PersonSetDemo {
    public static void main(String[] args) {

        Set<Person> people = new HashSet<Person>();

        Person p = new Person("Vinod", 47, 5.8);
        System.out.println("hashCode of p is: " + p.hashCode());

        people.add(p);
        p = new Person("Vinod", 47, 5.8);
        System.out.println("hashCode of p is: " + p.hashCode());

        people.add(p);
        p = new Person("Vinod", 47, 5.8);
        System.out.println("hashCode of p is: " + p.hashCode());

        people.add(p);
        p = new Person("Vinod", 47, 5.8);
        System.out.println("hashCode of p is: " + p.hashCode());

        people.add(p);

        for(Person p1: people) {
            System.out.println(p1);
        }

    }
}
