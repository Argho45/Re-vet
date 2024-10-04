package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SymptomsInterface {
    private Stage stage;
    private Scene symptomsScene;
    private VBox layout = new VBox(10);

    public SymptomsInterface(Stage stage) {
        this.stage = stage;
        setUpSymptomsInterface();
    }

    private void setUpSymptomsInterface() {
        Button catButton = new Button("1. বিড়াল");
        Button cowButton = new Button("2. গরু");
        Button dogButton = new Button("3. কুকুর");
        Button goatButton = new Button("4. ছাগল");
        Button parrotButton = new Button("5. তোতা");
        Button henButton = new Button("6. মুরগী");
        Button duckButton = new Button("7. টিয়া");
        Button buffaloButton = new Button("8. মহিষ");

        catButton.setOnAction(e -> showCatSymptoms());
        cowButton.setOnAction(e -> showCowSymptoms());
        dogButton.setOnAction(e -> showDogSym());
        goatButton.setOnAction(e -> showGoatSymptoms());
        parrotButton.setOnAction(e -> showParrotSymptoms());
        henButton.setOnAction(e -> showHenSymptoms());
        duckButton.setOnAction(e -> showDuckSymptoms());
        buffaloButton.setOnAction(e -> showBuffaloSymptoms());

        Button backButton = new Button("ফিরে যান");
        backButton.setOnAction(e -> {
            M mainInterface = new M(stage);  // Create an instance of M
            stage.setScene(mainInterface.getMainScene());  // Set the scene to the main interface
        });


        layout.getChildren().addAll(catButton, cowButton, dogButton, goatButton, parrotButton, henButton, duckButton, buffaloButton, backButton);
        symptomsScene = new Scene(layout, 600, 400);
    }

    public void showSymptomsScene() {
        stage.setScene(symptomsScene);
        stage.show();
    }
    private void showBuffaloSymptoms() {
        new BuffaloSymptomsInterface(stage).showBuffaloSymptomsScene();
    }

    private void showDetailsFor(String animalType) {
        // Open new window or update current scene with details for the selected animal type
    }

    private void showCowSymptoms() {
        new CowSymptomsInterface(stage).showCowSymptomsScene();
    }
    private void showDogSym() {
        new DogSymptomsInterface(stage).showDogSymptomsScene();
    }
    private void showCatSymptoms() {
        new CatSymptomsInterface(stage).showCatSymptomsScene();
    }
    private void showGoatSymptoms(){
        new GoatSymptomsInterface(stage).showGoatSymptomsScene();

    }
    private void showParrotSymptoms(){
        new ParrotSymptomsInterface(stage).showParrotSymptomsScene();

    }
    private void showHenSymptoms(){
        new HenSymptomsInterface(stage).showHenSymptomsScene();

    }

    private void showDuckSymptoms(){
        new DuckSymptomsInterface(stage).showDuckSymptomsScene();

    }

    public Scene getSymptomsScene() {
        return symptomsScene;
    }


    // Method to return to the main scene or start scene, if applicable
    public Scene getMainScene() {
        // Assuming MainInterface is defined and can provide the main scene
        // return new MainInterface(stage).getMainScene();
        return null; // Placeholder
    }
}
