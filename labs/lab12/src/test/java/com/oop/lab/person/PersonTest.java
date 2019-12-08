package com.oop.lab.person;

import com.oop.lab.person.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person("Plotnikov");
    }

    @Test
    public void getSignature_shouldHandleNullNameAndFatherName() {
        assertEquals("Plotnikov", person.getSignature());
    }

    @Test
    public void getSignature_shouldHandleNullFatherName() {
        person.setName("Alexander");
        assertEquals("Plotnikov A.", person.getSignature());
    }

    @Test
    public void getSignature() {
        person.setName("Alexander");
        person.setFatherName("Vyacheslavovich");
        assertEquals("Plotnikov A.V.", person.getSignature());
    }
}