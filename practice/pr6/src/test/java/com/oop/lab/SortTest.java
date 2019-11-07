package com.oop.lab;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void insertionSort() {
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
        Student[] all = {student2, student3, student1};
        Sort.insertionSort(all);
        assertEquals("[Student{id=1}, Student{id=2}, Student{id=3}]", Arrays.toString(all));
    }
}