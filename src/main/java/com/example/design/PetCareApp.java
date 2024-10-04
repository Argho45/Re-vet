package com.example.design;

import javafx.application.Application;
import javafx.stage.Stage;

public class PetCareApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        LoginInterface loginInterface = new LoginInterface(primaryStage);
        primaryStage.setScene(loginInterface.getLoginScene());
        primaryStage.setTitle("Pet Care Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
