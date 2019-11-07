package com.oop.lab;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void intoHumanAge() {
        Dog dog = new Dog("Mike", 10);
        assertEquals(70, dog.intoHumanAge());
    }

}