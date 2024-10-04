package com.example.design;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginInterface {
    private Stage stage;
    private Scene loginScene;
    private GridPane loginGridPane = new GridPane();
    private GridPane accountCreationPane = new GridPane();

    public LoginInterface(Stage stage) {
        this.stage = stage;
        setUpLoginInterface();
    }

    private void setUpLoginInterface() {
        Label phoneLabel = new Label("ফোন:");
        TextField phoneInput = new TextField();
        Label passwordLabel = new Label("পাসওয়ার্ড:");
        PasswordField passwordInput = new PasswordField();
        Button loginButton = new Button("লগইন");
        Button createAccountButton = new Button("নতুন একাউন্ট তৈরী করুন");

        loginGridPane.add(phoneLabel, 0, 0);
        loginGridPane.add(phoneInput, 1, 0);
        loginGridPane.add(passwordLabel, 0, 1);
        loginGridPane.add(passwordInput, 1, 1);
        loginGridPane.add(loginButton, 0, 2);
        loginGridPane.add(createAccountButton, 1, 2);

        loginButton.setOnAction(e -> handleLogin(phoneInput.getText(), passwordInput.getText()));
        createAccountButton.setOnAction(e -> showAccountCreationInterface());

        loginScene = new Scene(loginGridPane, 300, 200);
        stage.setScene(loginScene);
    }

    private void showAccountCreationInterface() {
        accountCreationPane.getChildren().clear();

        Label nameLabel = new Label("ইউজারনেম:");
        TextField nameInput = new TextField();
        Label phoneLabel = new Label("ফোন:");
        TextField phoneInput = new TextField();
        Label newPasswordLabel = new Label("নতুন পাসওয়ার্ড:");
        PasswordField newPasswordInput = new PasswordField();
        Label confirmPassLabel = new Label("পাসওয়ার্ড নিশ্চিত করুন:");
        PasswordField confirmPassInput = new PasswordField();
        Button submitButton = new Button("একাউন্ট তৈরী করুন");

        accountCreationPane.add(nameLabel, 0, 0);
        accountCreationPane.add(nameInput, 1, 0);
        accountCreationPane.add(phoneLabel, 0, 1);
        accountCreationPane.add(phoneInput, 1, 1);
        accountCreationPane.add(newPasswordLabel, 0, 2);
        accountCreationPane.add(newPasswordInput, 1, 2);
        accountCreationPane.add(confirmPassLabel, 0, 3);
        accountCreationPane.add(confirmPassInput, 1, 3);
        accountCreationPane.add(submitButton, 0, 4);

        submitButton.setOnAction(e -> handleAccountCreation(nameInput, phoneInput, newPasswordInput, confirmPassInput));

        stage.setScene(new Scene(accountCreationPane, 300, 250));
    }

    private void handleAccountCreation(TextField nameInput, TextField phoneInput, PasswordField newPasswordInput, PasswordField confirmPassInput) {
        if (newPasswordInput.getText().isEmpty() || confirmPassInput.getText().isEmpty() || nameInput.getText().isEmpty() || phoneInput.getText().isEmpty()) {
            showAlert("সব তথ্য পূরণকরুন");
            return;
        }
        if (!newPasswordInput.getText().equals(confirmPassInput.getText())) {
            showAlert("পাসওয়ার্ডগুলি মেলে না");
            return;
        }
        // Assume successful account creation logic here
        showAlert("একাউন্ট সফলভাবে তৈরী হয়েছে");
        clearForm(nameInput, phoneInput, newPasswordInput, confirmPassInput);

        // Navigate to the M class after creating a new account
        M m = new M(stage);
        stage.setScene(m.getMainScene());
    }

    private void clearForm(TextField nameInput, TextField phoneInput, PasswordField newPasswordInput, PasswordField confirmPassInput) {
        nameInput.clear();
        phoneInput.clear();
        newPasswordInput.clear();
        confirmPassInput.clear();
    }

    private void handleLogin(String phone, String password) {
        if (phone.equals("123") && password.equals("568")) {
            // Redirect to the main scene
            showAlert("সফল লগইন");
            // Add the following line to show the main scene
            stage.setScene(new M(stage).getMainScene());
        } else {
            showAlert("ফোন অথবা পাসওয়ার্ড সঠিক নয়");
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public Scene getLoginScene() {
        return loginScene;
    }

    public void setLoginScene(Scene loginScene) {
        this.loginScene = loginScene;
    }
}