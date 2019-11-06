package com.oop.lab;

import com.oop.lab.controllers.ResultExitEventHandler;
import com.oop.lab.controllers.UserInputEndEventHandler;
import com.oop.lab.scenes.HomeSceneBuilder;
import com.oop.lab.scenes.ResultSceneBuilder;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Map;

public class AppContext extends Application {

    private static final String INIT_TITLE = "Guess game";
    private Stage stage;

    public void start(Stage stage) throws Exception {
        this.stage = stage;
        stage.setTitle(INIT_TITLE);
        go(SceneNames.HOME);
        stage.show();
    }

    public void go(SceneNames name) {
        go(name, null);
    }

    public void go(SceneNames name, Map<String, String> bundle){
        Scene scene = null;
        switch(name){
            case HOME:
                scene = new HomeSceneBuilder()
                        .setOnUserInputEnd(new UserInputEndEventHandler(this))
                        .create();
                break;
            case RESULT:
                if (bundle == null) assert false;
                else scene = new ResultSceneBuilder(bundle)
                        .setOnUserInputEnd(new ResultExitEventHandler(this))
                        .create();
                break;
        }
        stage.setScene(scene);
    }

    public static void main(String args[]) {
        launch(args);
    }
}
