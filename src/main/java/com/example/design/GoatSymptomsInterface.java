package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GoatSymptomsInterface {
    private Stage stage;
    private Scene goatSymptomsScene;

    public GoatSymptomsInterface(Stage stage) {
        this.stage = stage;
        setUpGoatSymptomsScene();
    }

    private void setUpGoatSymptomsScene() {
        VBox layout = new VBox(10);
        layout.getChildren().add(new Label("ছাগলের রোগ, লক্ষণ এবং চিকিৎসা:"));

        // Diseases and treatments
        layout.getChildren().addAll(
                new Label("পিপিআর: জ্বর, মুখে ঘা, ডায়রিয়া। চিকিৎসা: ভ্যাকসিন এবং সমর্থনাত্মক চিকিৎসা।"),
                new Label("ফুট অ্যান্ড মাউথ ডিজিজ: পা এবং মুখে ঘা। চিকিৎসা: ভাইরাস বিরোধী ওষুধ এবং পরিচর্যা।")
        );

        // Add back button
        Button backButton = new Button("ফিরে যান");
        backButton.setOnAction(e -> {
            SymptomsInterface symptomsInterface = new SymptomsInterface(stage);
            symptomsInterface.showSymptomsScene();  // Shows the symptoms interface scene
        });
        layout.getChildren().add(backButton);

        goatSymptomsScene = new Scene(layout, 400, 300);
    }

    public void showGoatSymptomsScene() {
        stage.setScene(goatSymptomsScene);
    }
}
