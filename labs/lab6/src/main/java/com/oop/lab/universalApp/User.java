package com.oop.lab.universalApp;

public class User {

    @TableColumnName("Имя")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
