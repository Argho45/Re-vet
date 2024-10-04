package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PetCareInterface {
    private Stage stage;
    private Scene petCareScene;
    private VBox layout = new VBox(10);

    public PetCareInterface(Stage stage)
    { this.stage = stage;
        setUpPetCareInterface(); }

    private void setUpPetCareInterface()
    { Button backButton = new Button(" ফিরে যান ");
        backButton.setOnAction(e -> stage.setScene(new M(stage).getMainScene()));

        Label petCareCharge1 = new Label("১.৫ ঘন্টা = ৫00 টাকা");
        Label petCareCharge2 = new Label("১ দিন = ১000 টাকা");
        Label petCareCharge3 = new Label("৫ দিন = 3000 টাকা");
        Label petCareCharge4 = new Label("১৫ দিন = 6000 টাকা");
        Label petCareCharge5 = new Label("১ মাস = ১0000 টাকা");

        Label petCareMessage = new Label("আমরা আপনার পোষা প্রাণী সম্পর্কে সচেতন.");
        Label petCareRooms = new Label("Pet has several rooms.");

        layout.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 20px;");
        layout.getChildren().addAll(petCareMessage,
            petCareRooms,
            petCareCharge1,
            petCareCharge2,
            petCareCharge3,
            petCareCharge4,
            petCareCharge5,
            backButton);

        petCareScene = new Scene(layout, 400, 300); }

    public Scene getPetCareScene() { return petCareScene; } }