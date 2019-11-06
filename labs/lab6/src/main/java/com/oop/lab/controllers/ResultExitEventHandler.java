package com.oop.lab.controllers;

import com.oop.lab.AppContext;
import com.oop.lab.SceneNames;
import javafx.event.Event;
import javafx.event.EventHandler;

public class ResultExitEventHandler implements EventHandler<Event> {

    private AppContext context;

    public ResultExitEventHandler(AppContext context) {
        this.context = context;
    }

    @Override
    public void handle(Event event) {
        context.go(SceneNames.HOME);
    }
}
