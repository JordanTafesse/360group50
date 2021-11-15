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

                    List<User> users = new ArrayList<User>();

                    read = new CSVReaderWriter();
                    users = read.readCsv(filePath);

                    String tempUser = "JDoe";

                    String user = "n/a";
                    String pass = "n/a";
                    String fname = "n/a";
                    String lname = "n/a";
                    String birth = "n/a";
                    String address = "n/a";

                    for (User u : users) {
                        //if ((PatientLoginPane.currentUser.equals(u.getUsername()) == true)) {
                        if ((tempUser.equals(u.getUsername()) == true)) {   //this one works, but it's just a temp. Above uses global variable of user that is logged in
                            //set fields with currentUser information to be edited


                            //set variables to what is in the textfields

                            user = String.valueOf(u.getUsername());
                            //System.out.println("input " + user);
                            pass = String.valueOf(u.getPassword());
                            //System.out.println("input " + pass);
                            fname = String.valueOf(u.getFirstName());
                            //System.out.println("input " + fname);
                            lname = String.valueOf(u.getLastName());
                            //System.out.println("input " + lname);
                            birth = String.valueOf(u.getBirthday());
                            //System.out.println("input " + birth);
                            address = String.valueOf(u.getAddress());
                            //System.out.println("input " + address);
                        }
                    }


            userField = new TextField(user);
            passField = new TextField(pass);
            fNameField = new TextField(fname);
            lNameField = new TextField(lname);
            birthField = new TextField(birth);
            addressField = new TextField(address);

            //Loop to check if username exist in the system=====
        //these are final variables to allow use for button handler
        List<User> finalUsers = users;
        saveButton.setOnAction(e ->     {

            //SET STRINGS (put q at the end)
            String userq = String.valueOf(userField.getText());
            //System.out.println("input " + user);
            String passq = String.valueOf(passField.getText());
            //System.out.println("input " + pass);
            String fnameq = String.valueOf(fNameField.getText());
            //System.out.println("input " + fname);
            String lnameq = String.valueOf(lNameField.getText());
            //System.out.println("input " + lname);
            String birthq = String.valueOf(birthField.getText());
            //System.out.println("input " + birth);
            String addressq = String.valueOf(addressField.getText());
            //System.out.println("input " + address);

            boolean userExist = false;

            boolean isPatient = false;

            int currentID = 0;
            String Pharmacy = "n/a";
            int age = 0;
            //read = new CSVReaderWriter();
            //users = read.readCsv(filePath);

            for(User u: finalUsers) {
                if((fnameq.equals(u.getFirstName()) == true) && (lnameq.equals(u.getLastName()) == true) && (u.getAccess() == 0)){
                    isPatient = true;
                    currentID = u.getId();
                    Pharmacy = u.getPharmacy();
                    age = u.getAge();
                    System.out.println("Patient EXISTS");
                }
                if((userq.equals(u.getUsername()) == true)){
                    userExist = true;
                    System.out.println("USER EXISTS");
                }

            }

            //adds user if all fields contain text & if username isn't already in the system & if f and l name are registered by the nurse, (STILL NEEDS TO BE IMPLEMENTED)
            if ((userq != null) && (passq != null) && (fnameq != null) && (lnameq != null) && (birthq != null) && (addressq != null) && (userExist != true) && (isPatient == true) && (currentID !=0)) {
                //users = read.addtoCsv(filePath, user, pass, fname, lname, birth, address);

                //GOTTA FIGURE OUT A WAY TO ATTACH PATIENT TO THEIR ACCOUNT (THEY ALREADY SHOULD HAVE A PHARMACY AND AGE, BUT ARENT PROMTED IN THIS PANE)
                //**^^ IMPORTANT
                read.updateEntry(filePath,currentID, userq, passq, fnameq, lnameq, birthq, addressq, 0, Pharmacy, age);
                //System.out.println("ERROR, Missing fields!");
                //LEAVE THIS PANE ONCE WE ENTER THIS IF STATEMENT!!!
            }
            //}
            System.out.println("ERROR, Missing fields!");
            //ADD PRINT TO THE PANE
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