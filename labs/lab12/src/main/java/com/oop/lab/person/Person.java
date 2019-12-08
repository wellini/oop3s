package com.oop.lab.person;

public class Person {
    private String name;
    private String lastName;
    private String fatherName;

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getSignature() {
        StringBuilder builder = new StringBuilder();
        builder.append(lastName);
        if(name != null) builder.append(' ').append(name.charAt(0)).append('.');
        if(name != null && fatherName != null) builder.append(fatherName.charAt(0)).append('.');
        return builder.toString();
    }
}
