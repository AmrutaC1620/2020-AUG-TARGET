package com.target.training.programs;

import com.target.training.entity.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrowFunctionsExample {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("john", 45, 5.07));
        people.add(new Person("ramesh", 34, 5.09));
        people.add(new Person("harish", 22, 5.11));
        people.add(new Person("jane", 19, 5.08));
        people.add(new Person("smith", 55, 5.06));

        List<String> names = new ArrayList<>();
        names.add("john");
        names.add("ramesh");
        names.add("harish");
        names.add("jane");
        names.add("smith");

        printList(people);

        Collections.sort(people); // p1.compareTo(p2) --> 0, negative, positive
        printList(people);

        Collections.sort(people, (p1, p2) -> p1.getAge() - p2.getAge());
        printList(people);

        Collections.sort(people, (p1, p2) -> Double.compare(p1.getHeight(), p2.getHeight()));
        printList(people);

    }

    static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();
    }
}
