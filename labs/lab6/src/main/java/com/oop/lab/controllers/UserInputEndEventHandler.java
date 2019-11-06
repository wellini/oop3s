package com.oop.lab.controllers;

import com.oop.lab.AppContext;
import com.oop.lab.SceneNames;
import com.oop.lab.events.UserInputEndEvent;
import javafx.event.EventHandler;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class UserInputEndEventHandler implements EventHandler<UserInputEndEvent> {

    private AppContext context;

    public UserInputEndEventHandler(AppContext context) {
        this.context = context;
    }

    @Override
    public void handle(UserInputEndEvent userInputEndEvent) {
        HashMap<String, String> bundle = new HashMap<>();
        int randomResult = ThreadLocalRandom.current().nextInt(0, 21);
        bundle.put("title",
                Integer.parseInt(userInputEndEvent.getUserValue()) == randomResult
                        ? "You are win! " + userInputEndEvent.getUserValue() + " is right answer!"
                        : "You lost! " + userInputEndEvent.getUserValue() + " not equals " + randomResult
                );
        context.go(SceneNames.RESULT, bundle);
    }
}
