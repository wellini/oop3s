package com.oop.lab;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private static final String INIT_TITLE = "20 Random Shapes";

    private static final int INIT_WIDTH = 600;
    private static final int INIT_HEIGHT = 400;

    private static final int SHAPES_COUNT = 20;

    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, INIT_WIDTH, INIT_HEIGHT);
        stage.setTitle(INIT_TITLE);
        stage.setScene(scene);

        root.getChildren().addAll(
                ShapesGenerator.INSTANCE.makeShapes(SHAPES_COUNT, INIT_WIDTH, INIT_HEIGHT)
        );

        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
