package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FarmerTrainingInterface {
    private Stage stage;
    private Scene farmerTrainingScene;
    private VBox layout = new VBox(10);

    public FarmerTrainingInterface(Stage stage) {
        this.stage = stage;
        setUpFarmerTrainingInterface();
    }

    private void setUpFarmerTrainingInterface() {
        Button backButton = new Button(" ফিরে যান ");
        backButton.setOnAction(e -> stage.setScene(new M(stage).getMainScene()));

        Label farmerTrainingCourse1 = new Label("কোর্স 1: 15 দিন = 300 টাকা");
        Label farmerTrainingCourse2 = new Label("কোর্স 2: 1 মাস = 400 টাকা");
        Label farmerTrainingCourse3 = new Label("কোর্স 3: 2 মাস = 700 টাকা");
        Label farmerTrainingCourse4 = new Label("কোর্স 4: 3 মাস = 1000 টাকা");

        Label farmerTrainingDescription1 = new Label("ফর্মার ট্রেনিং কোর্সে আপনি বহুত কিছু পেট সম্বন্ধীত বিষয় জানবেন।");
        Label farmerTrainingDescription2 = new Label("এই কোর্সে আপনি পেট চেহারা বিশ্লেষণ, পেট চিকিৎসা, পেট চেয়ে নিয়মিত পরিচালনা সম্বন্ধীত বিষয় জানবেন।");
        Label farmerTrainingDescription3 = new Label("পেট ও ফর্ম ব্যবস্থাপনা ইত্যাদি বিষয়ে বিস্তারিত জানবেন।");

        layout.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 20px;");
        layout.getChildren().addAll(farmerTrainingCourse1,
                farmerTrainingCourse2,
                farmerTrainingCourse3,
                farmerTrainingCourse4,
                farmerTrainingDescription1,
                farmerTrainingDescription2,
                farmerTrainingDescription3,
                backButton);

        farmerTrainingScene = new Scene(layout, 400, 400);
    }

    public Scene getFarmerTrainingScene() {
        return farmerTrainingScene;
    }
}