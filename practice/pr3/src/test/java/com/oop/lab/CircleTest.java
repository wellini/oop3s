package com.oop.lab;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void getArea() {
        Circle circle = new Circle(10);
        assertEquals(Math.PI * 100, circle.getArea(), Math.PI * 100 - circle.getArea());
    }

    @Test
    public void getPerimeter() {
        Circle circle = new Circle(10);
        assertEquals(2 * Math.PI * 10, circle.getPerimeter(), 2 * Math.PI * 10 - circle.getPerimeter());
    }
}