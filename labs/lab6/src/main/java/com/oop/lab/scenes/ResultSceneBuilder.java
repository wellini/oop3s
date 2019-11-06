package com.oop.lab.scenes;

import com.oop.lab.ui.Title;
import com.oop.lab.ui.Palette;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;

import java.util.Map;

public class ResultSceneBuilder {
    private static final int INIT_WIDTH = 600;
    private static final int INIT_HEIGHT = 400;

    private Scene scene;
    private Title title;
    private Button button;
    private Map<String, String> bundle;

    public ResultSceneBuilder(Map<String, String> bundle) {
        this.bundle = bundle;
        VBox root = new VBox();
        scene = new Scene(root, INIT_WIDTH, INIT_HEIGHT);
        title = new Title(bundle.get("title"));

        root.setBackground(new Background(new BackgroundFill(Palette.PRIMARY, CornerRadii.EMPTY, Insets.EMPTY)));
        button = new Button("Try again");
    }

    public ResultSceneBuilder setOnUserInputEnd(EventHandler<Event> userInputEndHandler) {
        button.setOnAction(actionEvent -> {
            userInputEndHandler.handle(new Event(EventType.ROOT));
        });
        return this;
    }

    public Scene create(){
        VBox root = (VBox) scene.getRoot();
        root.getChildren().addAll(title, button);
        return scene;
    }
}
