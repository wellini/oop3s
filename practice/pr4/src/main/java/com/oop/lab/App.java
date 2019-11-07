package com.oop.lab;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {

    private static final String INIT_TITLE = "Milan – Real Madrid score";

    private int milanScore = 0;
    private int realScore = 0;


    private static final int INIT_WIDTH = 600;
    private static final int INIT_HEIGHT = 400;

    private String makeResultText(int primary, int secondary){
        return "Result: " + primary + " x " + secondary;
    }

    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        Scene scene = new Scene(root, INIT_WIDTH, INIT_HEIGHT);
        stage.setTitle(INIT_TITLE);


        Label title = new Label("Milan – Real Madrid");
        Label score = new Label("Result: 0 x 0");

        Button buttonMilan = new Button("AC Milan");
        buttonMilan.setOnAction(actionEvent -> {
            milanScore++;
            score.setText(makeResultText(milanScore, realScore));
        });

        Button buttonReal = new Button("Real Madrid");
        buttonReal.setOnAction(actionEvent -> {
            realScore++;
            score.setText(makeResultText(milanScore, realScore));
        });

        root.getChildren().addAll(title, score, buttonMilan, buttonReal);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
