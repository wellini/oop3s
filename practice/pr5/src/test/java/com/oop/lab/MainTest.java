package com.oop.lab;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void recursion() {
        int k = 3, s = 2;
        int start = (int) Math.pow(10, k - 1);
        int end = (int) Math.pow(10, k) - 1;
        assertEquals(3, Main.recursion((int) end, s, (int) start, 0));
    }
}