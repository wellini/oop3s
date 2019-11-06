package com.oop.lab.events;

import javafx.event.Event;
import javafx.event.EventType;

public class UserInputEndEvent extends Event {
    private String userValue;

    public UserInputEndEvent(String userValue) {
        super(EventType.ROOT);
        this.userValue = userValue;
    }

    public String getUserValue() {
        return userValue;
    }
}
