package com.example.group50;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class AddPatient extends Application
{
    public static final int WINSIZE_X = 600, WINSIZE_Y = 600;

    public void start(Stage primaryStage)
    {

        AddPatientPane addPane = new AddPatientPane();
        addPane.setPrefSize(WINSIZE_X, WINSIZE_Y);

        Scene scene = new Scene(addPane, WINSIZE_X, WINSIZE_Y);
        addPane.setAlignment(Pos.CENTER);
        primaryStage.setTitle("Patient UI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }

}
