package com.oop.lab.controllers;

import com.oop.lab.AppContext;
import com.oop.lab.SceneNames;
import com.oop.lab.repositories.InMemoryFailsCounterRepository;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;

public class ResultExitEventHandler implements EventHandler<Event> {

    private static final int MAX_FAILS_COUNT = 3;

    private AppContext context;

    public ResultExitEventHandler(AppContext context) {
        this.context = context;
    }

    @Override
    public void handle(Event event) {
        if (InMemoryFailsCounterRepository.INSTANCE.getCounter() >= MAX_FAILS_COUNT) {
            Platform.exit();
        }
        context.go(SceneNames.HOME);
    }
}
