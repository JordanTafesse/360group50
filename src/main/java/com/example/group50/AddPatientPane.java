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

public class AddPatientPane extends VBox
{
    //NEEDS TO BE INCLUDED TO READ .csv
    private CSVReaderWriter read;

    private Label addPatientLabel;
    private Label lnameLabel;
    private Label nameLabel;
    private Label addressLabel;
    private Label pharmaLabel;
    private Label ageLabel;

    private TextField lnameField;
    private TextField nameField;
    private TextField addressField;
    private TextField pharmaField;
    private TextField ageField;

    private Button addButton;

    public AddPatientPane()
    {

        addPatientLabel = new Label();
        addPatientLabel.setText("Add New Patient");
        addPatientLabel.setFont(Font.font(32));

        nameLabel = new Label();
        nameLabel.setText("First Name:\t\t ");
        lnameLabel = new Label();
        lnameLabel.setText("Lase Name:\t\t ");

        addressLabel = new Label();
        addressLabel.setText("Address:\t\t ");

        pharmaLabel = new Label();
        pharmaLabel.setText("Pharmacy:\t ");

        ageLabel = new Label();
        ageLabel.setText("Age:\t\t\t ");

        nameField = new TextField();
        lnameField = new TextField();
        addressField = new TextField();
        pharmaField = new TextField();
        ageField = new TextField();

        addButton = new Button();
        addButton.setText("Add Patient");
        addButton.setPrefWidth(180);

        HBox nameBox = new HBox();
        nameBox.getChildren().addAll(nameLabel, nameField);
        nameBox.setAlignment(Pos.CENTER);

        HBox lnameBox = new HBox();
        nameBox.getChildren().addAll(lnameLabel, lnameField);
        nameBox.setAlignment(Pos.CENTER);

        HBox addressBox = new HBox();
        addressBox.getChildren().addAll(addressLabel, addressField);
        addressBox.setAlignment(Pos.CENTER);

        HBox pharmaBox = new HBox();
        pharmaBox.getChildren().addAll(pharmaLabel, pharmaField);
        pharmaBox.setAlignment(Pos.CENTER);

        HBox ageBox = new HBox();
        ageBox.getChildren().addAll(ageLabel, ageField);
        ageBox.setAlignment(Pos.CENTER);

        VBox addGrid = new VBox();
        addGrid.getChildren().addAll(addPatientLabel, nameBox, lnameBox, addressBox, pharmaBox, ageBox, addButton);
        addGrid.setAlignment(Pos.CENTER);
        addGrid.setSpacing(50);

        //==========JORDAN ADDED

        String filePath = "/Users/jordan/Desktop/project50/user.csv";

        addButton.setOnAction(e -> {

            //SET STRINGS

            String fname = String.valueOf(nameField.getText());
            //System.out.println("input " + fname);
            String lname = String.valueOf(lnameField.getText());
            //System.out.println("input " + lname);
            String pharm = String.valueOf(pharmaField.getText());
            //System.out.println("input " + birth);
            String age = String.valueOf(ageField.getText());
            //System.out.println("input " + birth);
            String address = String.valueOf(addressField.getText());
            //System.out.println("input " + address);

            List<User> users = new ArrayList<User>();

            read = new CSVReaderWriter();

            //Loop to check if username exist in the system=====
            boolean userExist = false;


            read = new CSVReaderWriter();
            users = read.readCsv(filePath);

            for(User u: users ) {
                if((fname.equals(u.getFirstName()) == true) && (lname.equals(u.getLastName()) == true)){
                    userExist = true;
                    System.out.println("USER EXISTS");
                }
            }

            //adds user if all fields contain text & if username isn't already in the system & if f and l name are registered by the nurse, (STILL NEEDS TO BE IMPLEMENTED)
            if ((fname != null) && (lname != null) && (pharm != null) && (age != null) && (userExist != true) ) {
                //users = read.addtoCsv(filePath, user, pass, fname, lname, birth, address);

                //GOTTA FIGURE OUT A WAY TO ATTACH PATIENT TO THEIR ACCOUNT (THEY ALREADY SHOULD HAVE A PHARMACY AND AGE, BUT ARENT PROMTED IN THIS PANE)
                //**^^ IMPORTANT
                read.addtoCsv(filePath, "n/a", "n/a", fname, lname, "n/a", address, 0, pharm, Integer.parseInt(age));

                //LEAVE THIS PANE ONCE WE ENTER THIS IF STATEMENT!!!
            }
            //}
            System.out.println("ERROR, Missing fields!");
            //ADD PRINT TO THE PANE
        });

        this.getChildren().addAll(addGrid);
    }

}
