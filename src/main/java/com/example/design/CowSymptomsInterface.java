package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CowSymptomsInterface {
    private Stage stage;
    private Scene mainScene;

    public CowSymptomsInterface(Stage stage) {
        this.stage = stage;
        // Removed unused mainScene initialization in constructor
    }

    public void showCowSymptomsScene() {
        VBox layout = new VBox(10);
        layout.setStyle("-fx-padding: 20;");

        Label foodAndMouthDiseaseSymptom = new Label("- মুখ ও পায়ের রোগ\n" +
                "লক্ষণ:\n" +
                "উচ্চ তাপমাত্রা, দুধ উৎপাদন কমে যাওয়া, পায়ে ব্যথা ও সংবেদনশীলতা, লালা ঝরানো এবং ঠোঁট চাটানো\n" +
                "চিকিৎসা:\n" +
                "ডায়াডিন ৩০মিলি, পিট-আর-ভেট, অ্যাস্টাভেট");
        Label anthraxSymptom = new Label("- এনথ্রাক্স\n" +
                "লক্ষণ:\n" +
                "জ্বর, শ্বাসকষ্ট বা হৃদরোগের সমস্যা, উত্তেজনা, পায়ের দুর্বলতা\n" +
                "চিকিৎসা:\n" +
                "এসপি ভেট ২.৫গ্রাম, লেগা ভেট, ম্যাগ ভেট");

        Button backButton = new Button("ফিরে যান");
        backButton.setOnAction(e -> {
            SymptomsInterface symptomsInterface = new SymptomsInterface(stage);
            symptomsInterface.showSymptomsScene(); // Ensures the symptoms interface is shown
        });

        layout.getChildren().addAll(foodAndMouthDiseaseSymptom, anthraxSymptom, backButton);

        Scene scene = new Scene(layout, 400, 300);
        stage.setScene(scene);
        stage.show();
    }
}
