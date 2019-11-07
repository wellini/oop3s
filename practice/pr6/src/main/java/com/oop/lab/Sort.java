package com.oop.lab;

public class Sort {

    private static void swap(Comparable[] array, int ind1, int ind2) {
        Comparable tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void insertionSort(Comparable[] source){
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < source.length; i++) {
                if (source[i - 1].compareTo(source[i]) < 0) {
                    swap(source, i, i-1);
                    needIteration = true;
                }
            }
        }
    }
}
