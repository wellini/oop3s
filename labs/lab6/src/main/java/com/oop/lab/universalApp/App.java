package com.oop.lab.universalApp;

import com.oop.lab.SceneNames;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class App extends Application {

    @GetFrom("/api/getAllUsers")
    private List<User> allUsers;

    public App() {}

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        stage.setTitle("fdsfds");
        VBox root = new VBox();
        scene = new Scene(root, INIT_WIDTH, INIT_HEIGHT);
        stage.setScene(scene);
        root.getChildren().add(new Table(allUsers))
        stage.show();
    }
}
