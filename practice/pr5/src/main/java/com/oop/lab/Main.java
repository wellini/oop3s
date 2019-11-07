package com.oop.lab;

public class Main {

    public static int recursion(int end, int target, int last, int numberOfDecimals) {
        if(last > end) return numberOfDecimals;
        String sequence = "" + last;
        int s = 0;
        for (int i = 0; i < sequence.length(); i++) {
            s += Integer.parseInt("" + sequence.charAt(i));
        }
        return recursion(end, target, last + 1, target == s ? numberOfDecimals + 1 : numberOfDecimals);
    }

    public static void main(String[] args) {

    }
}
