package com.target.service;

import com.target.entity.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {

    public Map<String, String> addPerson(Person person) {
        // should validate and add the person data to the DB using DAO interface object
        return new HashMap<>();
    }

    public Person getPersonById(int id) {
        // supposed to read data from db using a DAO interface instance and return the same
        return new Person(1, "Vinod", 47, 5.8);
    }

    public List<Person> getPersonsByAgeRange(int ageFrom, int ageTo) {
        return new ArrayList<>();
    }
}
