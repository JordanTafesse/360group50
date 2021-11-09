package com.example.group50;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class PatientHome extends Application
{
    public static final int WINSIZE_X = 600, WINSIZE_Y = 600;

    public void start(Stage primaryStage)
    {

        PatientLoginPane patPane = new PatientLoginPane();
        patPane.setPrefSize(WINSIZE_X, WINSIZE_Y);

        PatientHomePage homePane = new PatientHomePage();
        homePane.setPrefSize(WINSIZE_X, WINSIZE_Y);

        Scene scene = new Scene(homePane, WINSIZE_X, WINSIZE_Y);
        patPane.setAlignment(Pos.CENTER);
        homePane.setAlignment(Pos.CENTER);
        primaryStage.setTitle("Patient UI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }

}
