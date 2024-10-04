package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HenSymptomsInterface {
    private Stage stage;
    private Scene henSymptomsScene;

    public HenSymptomsInterface(Stage stage) {
        this.stage = stage;
        setUpHenSymptomsScene();
    }

    private void setUpHenSymptomsScene() {
        VBox layout = new VBox(10);
        layout.getChildren().add(new Label("মুরগীর রোগ, লক্ষণ এবং চিকিৎসা:"));

        // Add diseases and treatments
        layout.getChildren().addAll(
                new Label("বার্ড ফ্লু: খাওয়ার অনীহা, শ্বাসকষ্ট। চিকিৎসা: বিশেষ ভ্যাকসিন এবং সংক্রমণ নিয়ন্ত্রণ।"),
                new Label("ফাউল কলেরা: অস্বাভাবিক মল, জ্বর। চিকিৎসা: অ্যান্টিবায়োটিকস।")
        );

        // Add back button
        Button backButton = new Button("ফিরে যান");
        backButton.setOnAction(e -> {
            SymptomsInterface symptomsInterface = new SymptomsInterface(stage);
            symptomsInterface.showSymptomsScene();  // Shows the symptoms interface scene
        });
        layout.getChildren().add(backButton);

        henSymptomsScene = new Scene(layout, 400, 300);
    }

    public void showHenSymptomsScene() {
        stage.setScene(henSymptomsScene);
    }
}
