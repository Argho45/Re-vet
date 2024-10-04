package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DogSymptomsInterface {
    private Stage stage;
    private Scene dogSymptomsScene;

    public DogSymptomsInterface(Stage stage) {
        this.stage = stage;
        setUpDogSymptomsScene();
    }

    private void setUpDogSymptomsScene() {
        VBox layout = new VBox(10);
        layout.getChildren().add(new Label("কুকুরের রোগ, লক্ষণ এবং চিকিৎসা:"));

        layout.getChildren().addAll(
                new Label("প্যারভোভাইরাস: তীব্র ডায়রিয়া, বমি, জ্বর। চিকিৎসা: আইভি ফ্লুইডস, অ্যান্টিবায়োটিকস।"),
                new Label("র‍্যাবিজ: অতিরিক্ত লালাজনিত এবং আক্রমণাত্মক আচরণ। চিকিৎসা: র‍্যাবিজ ভ্যাকসিন।")
        );

        // Add back button
        Button backButton = new Button("ফিরে যান");
        backButton.setOnAction(e -> {
            SymptomsInterface symptomsInterface = new SymptomsInterface(stage);
            symptomsInterface.showSymptomsScene();
        });
        layout.getChildren().add(backButton);

        dogSymptomsScene = new Scene(layout, 400, 400);
    }

    public void showDogSymptomsScene() {
        stage.setScene(dogSymptomsScene);
    }
}
