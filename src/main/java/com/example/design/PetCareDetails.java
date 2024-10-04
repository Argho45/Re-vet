package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PetCareDetails {
    private Stage stage;
    private Scene petCareScene;
    private TextArea careDetailsArea = new TextArea();

    public PetCareDetails(Stage stage) {
        this.stage = stage;
        setUpPetCareDetailsInterface();
    }

    private void setUpPetCareDetailsInterface() {
        careDetailsArea.setEditable(false);

        Button backButton = new Button("ফিরে যান");
        backButton.setOnAction(e -> goBackToDailyCareInterface());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(careDetailsArea, backButton);
        petCareScene = new Scene(layout, 400, 300);
    }

    private void goBackToDailyCareInterface() {

    }

    public void showCareDetailsFor(String petType) {
        // Implement logic to show care details for selected pet
        String careDetails = "";
        switch (petType) {
            case "Cat":
                careDetails = "Cats need regular feeding, grooming, and playtime. They also need regular vet checkups and vaccinations.";
                break;
            case "cow":
                careDetails = "Cows need regular feeding, watering, and milking. They also need a clean and dry living environment and regular vet checkups.";
                break;
            case "dog":
                careDetails = "Dogs need regular feeding, grooming, and exercise. They also need regular vet checkups and vaccinations.";
                break;
            case "goat":
                careDetails = "Goats need regular feeding, watering, and shelter. They also need regular vet checkups and hoof trimming.";
                break;
            case "parrot":
                careDetails = "Parrots need regular feeding, watering, and socialization. They also need regular vet checkups and wing trimming.";
                break;
            case "hen":
                careDetails = "Hens need regular feeding, watering, and egg collection. They also need a clean and dry living environment and regular vet checkups.";
                break;
            case "duck":
                careDetails = "Ducks need regular feeding, watering, and swimming. They also need a clean and dry living environment and regular vet checkups.";
                break;
            case "Buffalow":
                careDetails = "Buffaloes need regular feeding, watering, and rest. They also need a clean and dry living environment and regular vet checkups.";
                break;
            default:
                careDetails = "No care details available for this pet.";
        }
        careDetailsArea.setText(careDetails);
    }

    public Scene getPetCareScene() {
        return petCareScene;
    }
    }