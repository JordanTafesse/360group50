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

public class CreateAccountPane extends VBox
{
    //NEEDS TO BE INCLUDED TO READ .csv
    private CSVReaderWriter read;

    private Label createLabel;

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

    private Button createButton;

    public CreateAccountPane()
    {


        createLabel = new Label("Create New Account");
        createLabel.setFont(Font.font(32));

        userLabel = new Label("Username: ");
        userField = new TextField();

        passLabel = new Label("Password: ");
        passField = new TextField();

        fNameLabel = new Label("First Name: ");
        fNameField = new TextField();

        lNameLabel = new Label("Last Name: ");
        lNameField = new TextField();

        birthLabel = new Label("Date of Birth: ");
        birthField = new TextField();

        addressLabel = new Label("Address: ");
        addressField = new TextField();

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

        createButton = new Button("Create Account");
        createButton.setPrefWidth(150);

        //==========JORDAN ADDED

        String filePath = "/Users/jordan/Desktop/project50/user.csv";

        createButton.setOnAction(e -> {

            //SET STRINGS
            String user = String.valueOf(userField.getText());
            //System.out.println("input " + user);
            String pass = String.valueOf(passField.getText());
            //System.out.println("input " + pass);
            String fname = String.valueOf(fNameField.getText());
            //System.out.println("input " + fname);
            String lname = String.valueOf(lNameField.getText());
            //System.out.println("input " + lname);
            String birth = String.valueOf(birthField.getText());
            //System.out.println("input " + birth);
            String address = String.valueOf(addressField.getText());
            //System.out.println("input " + address);

        List<User> users = new ArrayList<User>();

        read = new CSVReaderWriter();

        //Loop to check if username exist in the system=====
            boolean userExist = false;

            boolean isPatient = false;

            int currentID = 0;
            String Pharmacy = "n/a";
            int age = 0;
            read = new CSVReaderWriter();
            users = read.readCsv(filePath);

            for(User u: users ) {
                if((fname.equals(u.getFirstName()) == true) && (lname.equals(u.getLastName()) == true) && (u.getAccess() == 0)){
                    isPatient = true;
                    currentID = u.getId();
                    Pharmacy = u.getPharmacy();
                    age = u.getAge();
                    System.out.println("Patient EXISTS");
                }
                if((user.equals(u.getUsername()) == true)){
                    userExist = true;
                    System.out.println("USER EXISTS");
                }

            }

            //adds user if all fields contain text & if username isn't already in the system & if f and l name are registered by the nurse, (STILL NEEDS TO BE IMPLEMENTED)
            if ((user != null) && (pass != null) && (fname != null) && (lname != null) && (birth != null) && (address != null) && (userExist != true) && (isPatient == true) && (currentID !=0)) {
                //users = read.addtoCsv(filePath, user, pass, fname, lname, birth, address);

                //GOTTA FIGURE OUT A WAY TO ATTACH PATIENT TO THEIR ACCOUNT (THEY ALREADY SHOULD HAVE A PHARMACY AND AGE, BUT ARENT PROMTED IN THIS PANE)
                //**^^ IMPORTANT
            read.updateEntry(filePath,currentID, user, pass, fname, lname, birth, address, 0, Pharmacy, age);
                //System.out.println("ERROR, Missing fields!");
            //LEAVE THIS PANE ONCE WE ENTER THIS IF STATEMENT!!!
            }
        //}
            System.out.println("ERROR, Missing fields!");
            //ADD PRINT TO THE PANE
        });
        this.setAlignment(Pos.CENTER);
        this.setSpacing(50);
        this.getChildren().addAll(createLabel, midBox, createButton);
    }

}