package com.oop.lab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {

    private static final String INIT_TITLE = "Milan – Real Madrid score";

    private static final String PRIMARY_NAME = "AC Milan";
    private static final String SECONDARY_NAME = "Real Madrid";

    private int primaryScore = 0;
    private int secondaryScore = 0;

    private static final int INIT_WIDTH = 600;
    private static final int INIT_HEIGHT = 400;

    private String makeResultText(int primary, int secondary){
        return "Result: " + primary + " x " + secondary;
    }

    private String makeLastScorerText(String lastScorer){
        return "Last scorer: " + lastScorer;
    }

    private String makeWinnerText(String winner){
        return "Winner: " + winner;
    }

    private String calcWinner(int primary, int secondary, String primaryName, String secondaryName){
        if(primary == secondary) return "DRAW";
        return primary > secondary ? primaryName : secondaryName;
    }

    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        Scene scene = new Scene(root, INIT_WIDTH, INIT_HEIGHT);
        stage.setTitle(INIT_TITLE);


        Label title = new Label("Milan – Real Madrid");
        Label score = new Label(makeResultText(primaryScore, secondaryScore));
        Label lastScorer = new Label(makeLastScorerText("N/A"));
        Label winner = new Label(makeWinnerText(calcWinner(primaryScore, secondaryScore, PRIMARY_NAME, SECONDARY_NAME)));

        Button buttonMilan = new Button(PRIMARY_NAME);
        buttonMilan.setOnAction(actionEvent -> {
            primaryScore++;
            score.setText(makeResultText(primaryScore, secondaryScore));
            lastScorer.setText(makeLastScorerText(PRIMARY_NAME));
            winner.setText(makeWinnerText(calcWinner(primaryScore, secondaryScore, PRIMARY_NAME, SECONDARY_NAME)));
        });

        Button buttonReal = new Button(SECONDARY_NAME);
        buttonReal.setOnAction(actionEvent -> {
            secondaryScore++;
            score.setText(makeResultText(primaryScore, secondaryScore));
            lastScorer.setText(makeLastScorerText(SECONDARY_NAME));
            winner.setText(makeWinnerText(calcWinner(primaryScore, secondaryScore, PRIMARY_NAME, SECONDARY_NAME)));
        });

        root.getChildren().addAll(title, score, lastScorer, winner, buttonMilan, buttonReal);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
