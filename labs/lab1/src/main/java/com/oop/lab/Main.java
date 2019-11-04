package com.oop.lab;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        final int[] source = {1, 2, 3, 4, 5};
        int result = 0;
        for (int i = 0; i < Array.getLength(source); i++) {
            result += source[i];
        }
        System.out.println("Result: " + result);
    }
}
