package com.example.design;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmergencyInterface {
    private Stage stage;
    private Scene emergencyScene;
    private VBox layout = new VBox(10);

    public EmergencyInterface(Stage stage) {
        this.stage = stage;
        setUpEmergencyInterface(); }

    private void setUpEmergencyInterface() {
        Label backButton = new Label("ফিরে যান");
        backButton.setOnMouseClicked(e -> stage.setScene(new M(stage).getMainScene()));

        layout.getChildren().addAll(backButton, new Label("1.ডাক্তার মোস্তাফিজুর, ফোন: 123-456-7890, ফি: 100টাকা"),
                new Label("2.ডাক্তার রুবেল, ফোন: 987-654-3210, ফি: 100টাকা"),
                new Label("3.ডাক্তার রহিম, ফোন: 456-789-1230, ফি: 100টাকা"),
                new Label("4.ডাক্তার প্রান্তো, ফোন: 789-456-1230, ফি: 100টাকা"),
                new Label("5.ডাক্তার রহিত, ফোন: 123-987-4560, ফি: 100টাকা"),
                new Label("6.ডাক্তার জাহাঙ্গীর, ফোন: 987-123-4560, ফি: 100টাকা"),
                new Label("7.ডাক্তার করিম, ফোন: 456-123-7890, ফি: 100টাকা"),
                new Label("8.ডাক্তার হাসান, ফোন: 789-123-4560, ফি: 100টাকা"),
                new Label("9.ডাক্তার নাজিম, ফোন: 123-456-9870, ফি: 100টাকা"),
                new Label("1.ডাক্তার শামিম, ফোন: 987-654-1230, ফি: 100টাকা"));

        emergencyScene = new Scene(layout, 600, 400); }

    public Scene getEmergencyScene() {
        return emergencyScene;
    }
}