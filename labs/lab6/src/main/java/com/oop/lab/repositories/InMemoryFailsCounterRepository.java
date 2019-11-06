package com.oop.lab.repositories;

public class InMemoryFailsCounterRepository {

    public static final InMemoryFailsCounterRepository INSTANCE = new InMemoryFailsCounterRepository();
    private int counter = 0;

    private InMemoryFailsCounterRepository() {
    }

    public int getCounter() {
        return counter;
    }

    public void increment() {
        this.counter++;
    }
}
