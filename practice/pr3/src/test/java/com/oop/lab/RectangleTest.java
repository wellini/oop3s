package com.oop.lab;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getArea() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(10 * 20, rectangle.getArea(), 10 * 20 - rectangle.getArea());
    }

    @Test
    public void getPerimeter() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(2 * (10 + 20), rectangle.getPerimeter(), 2 * (10 + 20 - rectangle.getPerimeter()));
    }
}