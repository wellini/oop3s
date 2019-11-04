package com.oop.lab.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CupboardFurnitureTest {

    private Furniture furniture = new CupboardFurniture();

    @Test
    public void showStuffShouldPrintCupboard() {
        furniture.add("Socks");
        furniture.add("Laptop");
        assertEquals("----------\n| Socks |\n----------\n| Laptop |\n----------\n", furniture.showStuff());
    }

    @Test
    public void showStuffShouldPrintNothing() {
        assertEquals("", furniture.showStuff());
    }
}