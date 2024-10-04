package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CatSymptomsInterface {
    private Stage stage;
    private Scene catSymptomsScene;

    public CatSymptomsInterface(Stage stage) {
        this.stage = stage;
        setUpCatSymptomsScene();
    }

    private void setUpCatSymptomsScene() {
        VBox layout = new VBox(10);
        layout.getChildren().add(new Label("বিড়ালের রোগ, লক্ষণ এবং চিকিৎসা:"));

        layout.getChildren().addAll(
                new Label("ফেলাইন লিউকেমিয়া: জ্বর ও ওজন হ্রাস।"),
                new Label("চিকিৎসা: ইমিউনমোডুলেটর, সমর্থনাত্মক চিকিৎসা।")
        );

        Button backButton = new Button("ফিরে যান");
        backButton.setOnAction(e -> {
            SymptomsInterface symptomsInterface = new SymptomsInterface(stage);
            symptomsInterface.showSymptomsScene();
        });
        layout.getChildren().add(backButton);

        catSymptomsScene = new Scene(layout, 400, 300);
    }

    public void showCatSymptomsScene() {
        stage.setScene(catSymptomsScene);
    }
}
