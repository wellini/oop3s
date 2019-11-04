package com.oop.lab.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShelfFurnitureTest {

    private Furniture furniture = new ShelfFurniture();

    @Test
    public void showStuffShouldPrintCupboard() {
        furniture.add("Socks");
        furniture.add("Laptop");
        assertEquals("------------------\n| Socks | Laptop |\n------------------\n", furniture.showStuff());
    }

    @Test
    public void showStuffShouldPrintNothing() {
        assertEquals("", furniture.showStuff());
    }
}