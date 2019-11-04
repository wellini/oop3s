package com.oop.lab.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Furniture {
    protected List<String> stuff = new ArrayList<>(10);

    public boolean add(String s) {
        return stuff.add(s);
    }

    public abstract String showStuff();
}
