package com.example.group50;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;

public class EditContactPane extends VBox
{
    //NEEDS TO BE INCLUDED TO READ .csv
    //may need to make these global variables
    private CSVReaderWriter read;
    String filePath = "/Users/jordan/Desktop/project50/user.csv";

    private Label editLabel;

    private Label userLabel;
    private TextField userField;

    private Label passLabel;
    private TextField passField;

    private Label fNameLabel;
    private TextField fNameField;

    private Label lNameLabel;
    private TextField lNameField;

    private Label birthLabel;
    private TextField birthField;

    private Label addressLabel;
    private TextField addressField;

    private Button saveButton;

    public EditContactPane()
    {

        editLabel = new Label("Edit Contact Information");
        editLabel.setFont(Font.font(32));

        userLabel = new Label("Username: ");
        //userField = new TextField();

        passLabel = new Label("Password: ");
        //passField = new TextField();

        fNameLabel = new Label("First Name: ");
        //fNameField = new TextField();

        lNameLabel = new Label("Last Name: ");
        //lNameField = new TextField();

        birthLabel = new Label("Date of Birth: ");
        //birthField = new TextField();

        addressLabel = new Label("Address: ");
        //addressField = new TextField();

        saveButton = new Button("Save Changes");
        saveButton.setPrefWidth(150);
        //JORDAN's ADDED CODE============
        //need to think of a catch that will display that user is not found, because the filling the textfields will be an errpr.
        saveButton.setOnAction(e -> {
                    List<User> users = new ArrayList<User>();

                    read = new CSVReaderWriter();
                    users = read.readCsv(filePath);

                    String tempUser = "JDoe";

                    for (User u : users) {
                        //if ((PatientLoginPane.currentUser.equals(u.getUsername()) == true)) {
                        if ((tempUser.equals(u.getUsername()) == true)) {   //this one works, but it's just a temp. Above uses global variable of user that is logged in
                            //set fields with currentUser information to be edited
                            userField = new TextField(u.getUsername());
                            passField = new TextField(u.getPassword());
                            fNameField = new TextField(u.getFirstName());
                            lNameField = new TextField(u.getLastName());
                            birthField = new TextField(u.getBirthday());
                            addressField = new TextField(u.getAddress());
                        }
                    }
                    ;
                });
        //================

        VBox labelBox = new VBox();
        labelBox.getChildren().addAll(userLabel, passLabel, fNameLabel, lNameLabel, birthLabel, addressLabel);
        labelBox.setAlignment(Pos.CENTER_RIGHT);
        labelBox.setSpacing(20);

        VBox fieldBox = new VBox();
        fieldBox.getChildren().addAll(userField, passField, fNameField, lNameField, birthField, addressField);
        fieldBox.setSpacing(10);

        HBox midBox = new HBox();
        midBox.getChildren().addAll(labelBox, fieldBox);
        midBox.setAlignment(Pos.CENTER);
        midBox.setSpacing(10);





        this.setAlignment(Pos.CENTER);
        this.setSpacing(50);
        this.getChildren().addAll(editLabel, midBox, saveButton);
    }

}