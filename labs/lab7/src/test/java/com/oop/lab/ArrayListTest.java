package com.oop.lab;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {
    private ArrayList<String> arrayList = new ArrayList<>(2);

    @Before
    public void setUp() throws Exception {
        arrayList.add("First");
        arrayList.add("Second");
    }

    @Test
    public void getElementTest() {
        assertEquals("Second", arrayList.get(1));
    }

    @Test
    public void removingElementTest() {
        arrayList.remove(0);
        assertEquals(1, arrayList.size());

    }

    @Test
    public void setElementByIndexTest() {
        arrayList.set(1, "Third");
        assertEquals("Third", arrayList.get(1));
    }

    @Test
    public void forEachIteratingTest() {
        LinkedList<String> strings = new LinkedList<>();
        arrayList.forEach(strings::add);
        assertEquals("First", arrayList.get(0));
        assertEquals("Second", arrayList.get(1));
    }

    @Test
    public void cloneTest() {
        ArrayList<String> clone = (ArrayList<String>) arrayList.clone();
        assertEquals("First", clone.get(0));
        assertEquals("Second", clone.get(1));
    }

    @Test
    public void sortTest() {
        ArrayList<String> arrayList = new ArrayList<>(2);
        arrayList.add("B");
        arrayList.add("A");
        arrayList.sort(String::compareTo);
        assertEquals("A", arrayList.get(0));
        assertEquals("B", arrayList.get(1));
    }
}
