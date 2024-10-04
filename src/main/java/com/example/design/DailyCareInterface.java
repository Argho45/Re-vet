package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DailyCareInterface {
    private Stage stage;
    private Scene dailyCareScene;
    private VBox layout = new VBox(10);

    public DailyCareInterface(Stage stage) {
        this.stage = stage;
        setUpDailyCareInterface();
    }

    private void setUpDailyCareInterface() {
        Button backButton = new Button("ফিরে যান");
        backButton.setOnAction(e -> stage.setScene(new M(stage).getMainScene()));

        layout.getChildren().add(backButton);

        Button catButton = new Button("1.বিড়াল");
        Button cowButton = new Button("2.গরু");
        Button dogButton = new Button("3.কুকুর");
        Button goatButton = new Button("4.ছাগল");
        Button parrotButton = new Button("5.তোতা");
        Button henButton = new Button("6.মুরগী");
        Button duckButton = new Button("7.টিয়া");
        Button buffaloButton = new Button("8.মহিষ");

        catButton.setOnAction(e -> showCareDetailsFor("বিড়াল"));
        cowButton.setOnAction(e -> showCareDetailsFor("গরু"));
        dogButton.setOnAction(e -> showCareDetailsFor("কুকুর"));
        goatButton.setOnAction(e -> showCareDetailsFor("ছাগল"));
        parrotButton.setOnAction(e -> showCareDetailsFor("তোতা"));
        henButton.setOnAction(e -> showCareDetailsFor("মুরগী"));
        duckButton.setOnAction(e -> showCareDetailsFor("টিয়া"));
        buffaloButton.setOnAction(e -> showCareDetailsFor("মহিষ"));

        layout.getChildren().addAll(catButton, cowButton, dogButton, goatButton, parrotButton, henButton, duckButton, buffaloButton);
        dailyCareScene = new Scene(layout, 600, 400);
    }

    private void showCareDetailsFor(String petType) {
        Stage detailStage = new Stage();
        VBox detailLayout = new VBox(20);
        detailLayout.getChildren().add(new Label("যত্ন বিবরণ" + petType));
        // Example detail information
        //detailLayout.getChildren().add(new Label("Feed: Specific feeding instructions here"));
        detailLayout.getChildren().add(new Label("1.প্রতিদিন স্বাস্থ্যকর খাদ্য পরিবহন করুন।\n" +
                "2.পানি প্রদান করুন।\n" +
                "3.ঘর কে শুক্ল রাখুন।\n" +
                "4.স্বাস্থ্য চেকআপ করুন।"));
        //detailLayout.getChildren().add(new Label("Healthcare: Regular healthcare checkups"));

        Scene detailScene = new Scene(detailLayout, 300, 200);
        detailStage.setTitle(petType + " Care Details");
        detailStage.setScene(detailScene);
        detailStage.initModality(Modality.APPLICATION_MODAL); // Make this window modal to focus user attention on it
        detailStage.show();
    }

    public Scene getDailyCareScene() {
        return dailyCareScene;
    }
}