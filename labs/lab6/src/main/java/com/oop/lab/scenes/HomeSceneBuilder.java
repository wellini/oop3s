package com.oop.lab.scenes;

import com.oop.lab.events.UserInputEndEvent;
import com.oop.lab.repositories.InMemoryFailsCounterRepository;
import com.oop.lab.ui.Title;
import com.oop.lab.ui.Palette;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;


public class HomeSceneBuilder {

    private static final int INIT_WIDTH = 600;
    private static final int INIT_HEIGHT = 400;


    private static final String TITLE = "Try to guess number between 0-20";
    private static final String OK_BUTTON_TITLE = "Ok";

    private Scene scene;
    private Button button;
    private TextField input;

    public HomeSceneBuilder() {
        VBox root = new VBox();
        scene = new Scene(root, INIT_WIDTH, INIT_HEIGHT);
        root.setBackground(new Background(new BackgroundFill(Palette.PRIMARY, CornerRadii.EMPTY, Insets.EMPTY)));

        Title title = new Title(TITLE);
        input = new TextField();

        button = new Button(OK_BUTTON_TITLE);

        root.getChildren().addAll(title, input, button);
    }

    public HomeSceneBuilder setOnUserInputEnd(EventHandler<UserInputEndEvent> userInputEndHandler) {
        button.setOnAction(actionEvent -> userInputEndHandler.handle(new UserInputEndEvent(input.getText())));
        return this;
    }

    public Scene create() {
        return scene;
    }

}
