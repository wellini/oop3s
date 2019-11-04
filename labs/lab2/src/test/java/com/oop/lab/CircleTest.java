package com.oop.lab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    private Circle circle;
    private final float X = 123f;
    private final float Y = 54f;
    private final float RADIUS = 11f;

    @Before
    public void setUp() throws Exception {
        circle = new Circle(X, Y, RADIUS);
    }

    @Test
    public void getX() {
        assertEquals(X, circle.getX(), X - circle.getX());
    }

    @Test
    public void setX() {
        final float NEW_X = 32.7f;
        circle.setX(NEW_X);
        assertEquals(NEW_X, circle.getX(), NEW_X - circle.getX());
    }

    @Test
    public void getY() {
        assertEquals(Y, circle.getY(), Y - circle.getY());
    }

    @Test
    public void setY() {
        final float NEW_Y = 519.7f;
        circle.setY(NEW_Y);
        assertEquals(NEW_Y, circle.getY(), Y - circle.getY());
    }

    @Test
    public void getRadius() {
        assertEquals(RADIUS, circle.getRadius(), RADIUS - circle.getRadius());
    }

    @Test
    public void setRadius() {
        final float NEW_RADIUS = 519.7f;
        assertEquals(NEW_RADIUS, circle.getRadius(), NEW_RADIUS - circle.getRadius());
    }
}