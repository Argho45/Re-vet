package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuffaloSymptomsInterface {
    private Stage stage;
    private Scene buffaloSymptomsScene;

    public BuffaloSymptomsInterface(Stage stage) {
        this.stage = stage;
        setUpBuffaloSymptomsScene();
    }

    private void setUpBuffaloSymptomsScene() {
        VBox layout = new VBox(10);
        layout.getChildren().add(new Label("মহিষের রোগ, লক্ষণ এবং চিকিৎসা:"));

        // Add diseases and treatments
        layout.getChildren().addAll(
                new Label("টিউবারকুলোসিস: ক্ষীণতা, ক্রনিক কাশি। চিকিৎসা: বিশেষ অ্যান্টিবায়োটিক চিকিৎসা।"),
                new Label("ফুট অ্যান্ড মাউথ ডিজিজ: পা এবং মুখের ঘা।"),
                new Label("চিকিৎসা: সমর্থনাত্মক চিকিৎসা এবং স্যানিটেশন।")
        );

        // Add back button
        Button backButton = new Button("ফিরে যান");
        backButton.setOnAction(e -> {
            SymptomsInterface symptomsInterface = new SymptomsInterface(stage);
            symptomsInterface.showSymptomsScene();  // Shows the symptoms interface scene
        });
        layout.getChildren().add(backButton);

        buffaloSymptomsScene = new Scene(layout, 400, 300);
    }

    public void showBuffaloSymptomsScene() {
        stage.setScene(buffaloSymptomsScene);
    }
}
