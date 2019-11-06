package com.oop.lab.controllers;

import com.oop.lab.AppContext;
import com.oop.lab.SceneNames;
import com.oop.lab.events.UserInputEndEvent;
import com.oop.lab.repositories.InMemoryFailsCounterRepository;
import javafx.event.EventHandler;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class UserInputEndEventHandler implements EventHandler<UserInputEndEvent> {

    private static final int MAX = 20;
    private static final int MIN = 0;

    private AppContext context;

    public UserInputEndEventHandler(AppContext context) {
        this.context = context;
    }

    @Override
    public void handle(UserInputEndEvent userInputEndEvent) {
        HashMap<String, String> bundle = new HashMap<>();
        int randomResult = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        if(Integer.parseInt(userInputEndEvent.getUserValue()) == randomResult) {
            bundle.put("title", "You are win! " + userInputEndEvent.getUserValue() + " is right answer!");
        } else {
            InMemoryFailsCounterRepository.INSTANCE.increment();
            bundle.put("title", "You have lost! " + userInputEndEvent.getUserValue() + " not equals " + randomResult);
        }
        context.go(SceneNames.RESULT, bundle);
    }
}
