package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ParrotSymptomsInterface {
    private Stage stage;
    private Scene parrotSymptomsScene;

    public ParrotSymptomsInterface(Stage stage) {
        this.stage = stage;
        setUpParrotSymptomsScene();
    }

    private void setUpParrotSymptomsScene() {
        VBox layout = new VBox(10);
        layout.getChildren().add(new Label("তোতার রোগ, লক্ষণ এবং চিকিৎসা:"));

        // Add diseases and treatments
        layout.getChildren().addAll(
                new Label("পিএসআইটি ভাইরাস: পালক পড়ে যাওয়া, দুর্বলতা। চিকিৎসা: অ্যান্টিভাইরাল ওষুধ।"),
                new Label("এভিয়ান টিবি: শ্বাসকষ্ট, অনিহা। চিকিৎসা: যথাযথ এন্টিবায়োটিক চিকিৎসা।")
        );

        // Add back button
        Button backButton = new Button("ফিরে যান");
        backButton.setOnAction(e -> {
            SymptomsInterface symptomsInterface = new SymptomsInterface(stage);
            symptomsInterface.showSymptomsScene();
        });
        layout.getChildren().add(backButton);

        parrotSymptomsScene = new Scene(layout, 400, 300);
    }

    public void showParrotSymptomsScene() {
        stage.setScene(parrotSymptomsScene);
    }
}
