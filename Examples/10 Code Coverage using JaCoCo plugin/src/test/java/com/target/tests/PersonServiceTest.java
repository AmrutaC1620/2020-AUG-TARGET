package com.target.tests;

import com.target.entity.Person;
import com.target.service.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

class PersonServiceTest {

    static Logger log = LoggerFactory.getLogger(PersonServiceTest.class);

    PersonService service = new PersonService();


    @BeforeEach
    public void setup() {
        log.debug("setting up PersonService instance");
//        service = new PersonService();
    }

    @Test
    void testGetPerson() {
        Person p = service.getPersonById(1);
        Assertions.assertEquals("Vinod", p.getName());
        Assertions.assertEquals(47, p.getAge());
        Assertions.assertEquals(5.8, p.getHeight());
    }

    @Test
    void testGetPersonsByAgeRange() {
        List<Person> list = service.getPersonsByAgeRange(30, 50);
        Assertions.assertEquals(0, list.size());
    }
}
