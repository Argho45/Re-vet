package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DuckSymptomsInterface {
    private Stage stage;
    private Scene duckSymptomsScene;

    public DuckSymptomsInterface(Stage stage) {
        this.stage = stage;
        setUpDuckSymptomsScene();
    }

    private void setUpDuckSymptomsScene() {
        VBox layout = new VBox(10);
        layout.getChildren().add(new Label("টিয়ার রোগ, লক্ষণ এবং চিকিৎসা:"));

        // Add diseases and treatments
        layout.getChildren().addAll(
                new Label("ডাক প্লেগ: জ্বর, মলে রক্ত। চিকিৎসা: এন্টিবায়োটিকস।"),
                new Label("অ্যাসপারজিলোসিস: শ্বাসকষ্ট, অনাহার। "),
                new Label("চিকিৎসা: অ্যান্টিফাঙ্গাল থেরাপি।")
        );

        // Add back button
        Button backButton = new Button("ফিরে যান");
        backButton.setOnAction(e -> {
            SymptomsInterface symptomsInterface = new SymptomsInterface(stage);
            symptomsInterface.showSymptomsScene();  // Shows the symptoms interface scene
        });
        layout.getChildren().add(backButton);

        duckSymptomsScene = new Scene(layout, 400, 300);
    }

    public void showDuckSymptomsScene() {
        stage.setScene(duckSymptomsScene);
    }
}
