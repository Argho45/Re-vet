package com.example.design;

import com.example.design.DailyCareInterface;
import com.example.design.EmergencyInterface;
import com.example.design.FarmerTrainingInterface;
import com.example.design.LoginInterface;
import com.example.design.PetCareInterface;
import com.example.design.PetTrainingInterface;
import com.example.design.SymptomsInterface;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class M {
    private Stage stage;
    private Scene mainScene;
    private VBox layout = new VBox(10);
    private StackPane root = new StackPane();

    public M(Stage stage) {
        this.stage = stage;
        setUpMainInterface();
    }

    private void setUpMainInterface() {
        Button symptomsButton = new Button("1. সমস্যা ও চিকিৎসা ");
        symptomsButton.setOnAction(e -> stage.setScene(new SymptomsInterface(stage).getSymptomsScene()));

        Button dailyCareButton = new Button("2.দৈনিক  যত্ন ");
        dailyCareButton.setOnAction(e -> stage.setScene(new DailyCareInterface(stage).getDailyCareScene()));

        Button emergencyButton = new Button("3. জরুরি চিকিৎসা ");
        emergencyButton.setOnAction(e -> stage.setScene(new EmergencyInterface(stage).getEmergencyScene()));

        Button petCareButton = new Button("4. পেট কেয়ার ");
        petCareButton.setOnAction(e -> stage.setScene(new PetCareInterface(stage).getPetCareScene()));

        Button petTrainingButton = new Button("5. পেট ট্রেনিং ");
        petTrainingButton.setOnAction(e -> stage.setScene(new PetTrainingInterface(stage).getPetTrainingScene()));

        Button farmerTrainingButton = new Button("6. কৃষি শিক্ষা ");
        farmerTrainingButton.setOnAction(e -> stage.setScene(new FarmerTrainingInterface(stage).getFarmerTrainingScene()));

        layout.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 20px;");
        layout.getChildren().addAll(symptomsButton, dailyCareButton, emergencyButton, petCareButton, petTrainingButton, farmerTrainingButton);

        Button backButton = new Button("ফিরে যান");
        backButton.setOnAction(e -> stage.setScene(new LoginInterface(stage).getLoginScene()));

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(backButton);
        borderPane.setCenter(root);
        borderPane.setBottom(new ExitButton());

        root.getChildren().add(layout);

        mainScene = new Scene(borderPane, 400, 300);
    }

    public Scene getMainScene() {
        return mainScene;
    }

    private class ExitButton extends Button {
        public ExitButton() {
            super("Exit");
            setOnAction(e -> stage.close());
        }
    }
}