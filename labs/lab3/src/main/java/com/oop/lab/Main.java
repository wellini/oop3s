package com.oop.lab;


import com.oop.lab.models.CupboardFurniture;
import com.oop.lab.models.Furniture;
import com.oop.lab.models.ShelfFurniture;

public class Main {
    public static void main(String[] args) {
        Furniture cupboardFurniture = new CupboardFurniture();
        cupboardFurniture.add("Socks");
        cupboardFurniture.add("Laptop");
        System.out.println(cupboardFurniture.showStuff());
        System.out.println("\n\n");
        Furniture shelfFurniture = new ShelfFurniture();
        shelfFurniture.add("Socks");
        shelfFurniture.add("Laptop");
        System.out.println(shelfFurniture.showStuff());
    }
}
