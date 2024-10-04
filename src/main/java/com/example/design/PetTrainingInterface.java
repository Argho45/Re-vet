package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PetTrainingInterface {
    private Stage stage;
    private Scene petTrainingScene;
    private VBox layout = new VBox(10);

    public PetTrainingInterface(Stage stage) {
        this.stage = stage; setUpPetTrainingInterface(); }

    private void setUpPetTrainingInterface() {
        Button backButton = new Button(" ফিরে যান ");
        backButton.setOnAction(e -> stage.setScene(new M(stage).getMainScene()));

        Label petTrainingSuggestion1 = new Label("1. পোটি ট্রেনিং");
        Label petTrainingSuggestion2 = new Label("2. বার্কিং ট্রেনিং");
        Label petTrainingSuggestion3 = new Label("3. সামাজিক ট্রেনিং");
        Label petTrainingSuggestion4 = new Label("4. খাদ্য ট্রেনিং");
        Label petTrainingSuggestion5 = new Label("5. কমান্ড ট্রেনিং ও অন্যান্য...");

        Label petCareLabel1 = new Label("আমরা আপনার পেট সম্বন্ধে চিন্তা করি |");
        Label petCareLabel2 = new Label("এই প্রকার ট্রেনিং সেটা সাহায্য করবে আপনার পেটকে একটা ভাল পেট হিসাবে আপনার সমাজিক পরিবেশে উপস্থাপন করার জন্য।");

        layout.getChildren().addAll(petTrainingSuggestion1, petTrainingSuggestion2, petTrainingSuggestion3, petTrainingSuggestion4, petTrainingSuggestion5, petCareLabel1, petCareLabel2, backButton);

        layout.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 20px;");

        petTrainingScene = new Scene(layout, 400, 300); }

    public Scene getPetTrainingScene() { return petTrainingScene; } }