package com.example.group50;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class PatientLoginPane extends HBox
{

    private Label welcomeLabel;	// Displays login text
    private Label loginLabel;

    private TextField usernameTextField;
    private Label userLabel;

    private TextField passwordTextField;
    private Label passLabel;

    private Button loginButton;		// Patient will click this to log in
    private Button createAccountButton;

    public PatientLoginPane()
    {
        welcomeLabel = new Label();
        welcomeLabel.setText("Welcome Patient");
        welcomeLabel.setFont(Font.font(32));

        loginLabel = new Label();
        loginLabel.setText("User Login");

        HBox userBox = new HBox();
        usernameTextField = new TextField();
        userLabel = new Label();
        userLabel.setText("Username: ");
        userBox.getChildren().addAll(userLabel, usernameTextField);
        userBox.setAlignment(Pos.CENTER);

        HBox passBox = new HBox();
        passwordTextField = new TextField();
        passLabel = new Label();
        passLabel.setText(" Password: ");
        passBox.getChildren().addAll(passLabel, passwordTextField);
        passBox.setAlignment(Pos.CENTER);

        VBox loginBox = new VBox(); // VBox that contains both username and password elements to add to the gridpane
        loginBox.getChildren().addAll(userBox, passBox);

        loginButton = new Button();
        loginButton.setText("Sign in");
        loginButton.setPrefWidth(180);

        createAccountButton = new Button();
        createAccountButton.setText("Create an account");
        createAccountButton.setPrefWidth(180);

        //============JORDAN GETTING STRINGS
        loginButton.setOnAction(e -> {
                    String user = String.valueOf(userLabel.getText());
                    String pass = String.valueOf(passLabel.getText());

                    //IF USER AND PASSWORD IS FOUND IN THE DATABASE (needs to be implemented)
                    //patient. needs to be replaced with a function that sorts through the database.
            /*if((user.equals(patient.) == 0)  && (pass.equals(patient.) == 0)){

            }
            */
                });

        //GO TO CREATE ACCOUNT PANE ONCE PRESSED
        createAccountButton.setOnAction(e -> {



                });
            //==============================================

        HBox buttonHBox = new HBox(); // HBox that contains all button elements
        buttonHBox.getChildren().addAll(loginButton, createAccountButton);
        buttonHBox.setSpacing(75);

        VBox patientGrid = new VBox();
        patientGrid.getChildren().add(welcomeLabel);
        patientGrid.getChildren().add(loginBox);
        patientGrid.getChildren().add(buttonHBox);
        patientGrid.setAlignment(Pos.CENTER);
        patientGrid.setSpacing(50);

        this.getChildren().addAll(patientGrid);
    }

}