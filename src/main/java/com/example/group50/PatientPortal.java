package com.example.group50;

/*
 * Joshua Ballecer, Shawn Mian, Jadon O'Neil, Jordan Tafesse, Patrick Walker Jauregui
 * Group 50
 * CSE 360 Tuesday 9:00-10:15
 * Description:
 *
 * 		This class will display the JavaFX window containing all of the elements for
 * 		the Patient Portal page. It will create a PatientPortal that will be created
 * 		in the PatientPortal.java class.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//************************************************************
//
//************************************************************

public class PatientPortal extends Application
{
    public static final int WINSIZE_X = 600, WINSIZE_Y = 600;

    // Start  Variables for Patient Login

    //JORDAN ADDED VARIABLES==================
    //NEEDS TO BE INCLUDED TO READ .csv
    private CSVReaderWriter read;
    //global variable to track that this is our current user
    public static int currentUser;

    //===========================
    private Label welcomeLabel;	// Displays login text
    private Label loginLabel;

    private TextField usernameTextField;
    private Label userLabel;

    private TextField passwordTextField;
    private Label passLabel;

    private Button loginButton;		// Patient will click this to log in
    private Button createAccountButton;

    // End Variables for Patient Login



    // Start Variables for Patient Home
    private Label welcomeHomeLabel;
    private Label homePageLabel;
    private Label destinationLabel;

    private Button contactInfoButton;
    private Button visitHistoryButton;
    private Button contactDoctorButton;

    private Button homeBackButton = new Button("Back");
    // End Variables for Patient Home



    // Start Variables for Create Account
    private Label createLabel;

    private Label userLabelCA;
    private TextField userField;

    private Label passLabelCA;
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

    private Button createAccBackButton = new Button("Back");
    // End Variables for Create Account



    // Start Variables for Contact Doctor
    private Label contactLabel = new Label("Contact Doctor");

    private TextField nameField = new TextField("Doctor Name");
    private TextField subjectField = new TextField("Subject Title");
    private TextField messageField = new TextField("Type Message Here");

    private Button submitButton = new Button("Submit");

    private Button contactDoctorBackButton = new Button("Back");
    // End Variables for Contact Doctor



    // Start Variables for Edit Contact
    private Label editLabel;

    private Label userLabelEC;
    private TextField userFieldEC;

    private Label passLabelEC;
    private TextField passFieldEC;

    private Label fNameLabelEC;
    private TextField fNameFieldEC;

    private Label lNameLabelEC;
    private TextField lNameFieldEC;

    private Label birthLabelEC;
    private TextField birthFieldEC;

    private Label addressLabelEC;
    private TextField addressFieldEC;

    private Button saveContactButton;

    private Button editContactBackButton = new Button("Back");
    // End Variables for Edit Contact



    // Start Variables for Visit History
    private Label historyLabel = new Label ("Visit History");

    private TextArea visitBox = new TextArea();

    private Button visitHistoryBackButton = new Button();
    // End Variables for Visit History



    // Start Variables for

    // End Variables for
    public void start(Stage primaryStage)
    {
        //************************************************************
        //	Patient Login Start Patient Login
        //************************************************************
        File file = new File("user.csv");
        String path = file.getAbsolutePath();
        String filePath = path;


        welcomeLabel = new Label("Welcome Patient");
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


        HBox buttonHBox = new HBox(); // HBox that contains all button elements
        buttonHBox.getChildren().addAll(loginButton, createAccountButton);
        buttonHBox.setSpacing(10);

        VBox patientGrid = new VBox();
        patientGrid.getChildren().add(welcomeLabel);
        patientGrid.getChildren().add(loginBox);
        patientGrid.getChildren().add(buttonHBox);
        patientGrid.setAlignment(Pos.CENTER);
        patientGrid.setSpacing(50);

        HBox patientLoginPane = new HBox(patientGrid);
        patientLoginPane.setAlignment(Pos.CENTER);
        //************************************************************
        //	End Patient Login
        //************************************************************




        //************************************************************
        //	Start Patient Home
        //************************************************************
        welcomeHomeLabel = new Label();
        welcomeHomeLabel.setText("Welcome!");
        welcomeHomeLabel.setFont(Font.font(32));

        homePageLabel = new Label();
        homePageLabel.setText("Home Page");

        destinationLabel = new Label();
        destinationLabel.setText("Please select a destination.");

        contactInfoButton = new Button();
        contactInfoButton.setText("Change Contact \nInformation");
        contactInfoButton.setPrefWidth(150);
        contactInfoButton.setPrefHeight(50);

        visitHistoryButton = new Button();
        visitHistoryButton.setText("View Visit History");
        visitHistoryButton.setPrefWidth(150);
        visitHistoryButton.setPrefHeight(50);

        contactDoctorButton = new Button();
        contactDoctorButton.setText("Contact a Doctor");
        contactDoctorButton.setPrefWidth(150);
        contactDoctorButton.setPrefHeight(50);

        homeBackButton.setPrefWidth(100);

        VBox homeVBox = new VBox();
        homeVBox.getChildren().addAll(homePageLabel, destinationLabel);
        homeVBox.setSpacing(20);
        homeVBox.setAlignment(Pos.CENTER);

        VBox buttonVBox = new VBox();
        buttonVBox.getChildren().addAll(contactInfoButton, visitHistoryButton, contactDoctorButton, homeBackButton);
        buttonVBox.setSpacing(20);
        buttonVBox.setAlignment(Pos.CENTER);

        VBox homeGrid = new VBox();
        homeGrid.getChildren().addAll(welcomeHomeLabel, homeVBox, buttonVBox);
        homeGrid.setAlignment(Pos.CENTER);
        homeGrid.setSpacing(50);

        HBox patientHomePane = new HBox(homeGrid);
        patientHomePane.setAlignment(Pos.CENTER);
        //************************************************************
        //	End Patient Home
        //************************************************************




        //************************************************************
        //	Start Create Account
        //************************************************************
        createLabel = new Label("Create New Account");
        createLabel.setFont(Font.font(32));

        userLabelCA = new Label("Username: ");
        userField = new TextField();

        passLabelCA = new Label("Password: ");
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
        labelBox.getChildren().addAll(userLabelCA, passLabelCA, fNameLabel, lNameLabel, birthLabel, addressLabel);
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

        createAccBackButton.setPrefWidth(100);

        HBox createAccBtnBox = new HBox(createButton, createAccBackButton);
        createAccBtnBox.setAlignment(Pos.CENTER);
        createAccBtnBox.setSpacing(10);

        VBox createAccPane = new VBox(createLabel, midBox, createAccBtnBox);
        createAccPane.setSpacing(50);
        createAccPane.setAlignment(Pos.CENTER);
        //************************************************************
        //	End Create Account
        //************************************************************




        //************************************************************
        //	Start Contact Doctor
        //************************************************************
        contactLabel.setFont(Font.font(32));
        contactLabel.setAlignment(Pos.CENTER);

        nameField.setPrefWidth(180);

        subjectField.setPrefWidth(360);
        messageField.setPrefSize(400, 200);

        submitButton.setPrefWidth(100);
        submitButton.setOnAction(new SubmitButtonHandler());

        contactDoctorBackButton.setPrefWidth(100);


        HBox docBtnBox = new HBox(submitButton, contactDoctorBackButton);
        docBtnBox.setAlignment(Pos.CENTER);
        docBtnBox.setSpacing(10);

        VBox contactDoctorPane = new VBox(contactLabel, nameField, subjectField, messageField, docBtnBox);
        contactDoctorPane.setAlignment(Pos.CENTER_LEFT);
        contactDoctorPane.setSpacing(10);
        //************************************************************
        //	End Contact Doctor
        //************************************************************




        //************************************************************
        //	Start Edit Contact
        //************************************************************
        //contactInfoButton.setOnAction(e -> {
        editLabel = new Label("Edit Contact Information");
        editLabel.setFont(Font.font(32));

        userLabelEC = new Label("Username: ");
        //userFieldEC = new TextField();

        passLabelEC = new Label("Password: ");
        //passFieldEC = new TextField();

        fNameLabelEC = new Label("First Name: ");
        //fNameFieldEC = new TextField();

        lNameLabelEC = new Label("Last Name: ");
        //lNameFieldEC = new TextField();

        birthLabelEC = new Label("Date of Birth: ");
        //birthFieldEC = new TextField();

        addressLabelEC = new Label("Address: ");
        //addressFieldEC = new TextField();

        VBox labelECBox = new VBox();
        labelECBox.getChildren().addAll(userLabelEC, passLabelEC, fNameLabelEC, lNameLabelEC, birthLabelEC, addressLabelEC);
        labelECBox.setAlignment(Pos.CENTER_RIGHT);
        labelECBox.setSpacing(20);


        List<User> users = new ArrayList<User>();
        read = new CSVReaderWriter();
        users = read.readCsv(filePath);


        int tempUser = 1;

        String userEc = "n/a";
        String passEc = "n/a";
        String fnameEc = "n/a";
        String lnameEc = "n/a";
        String birthEc = "n/a";
        String addressEc = "n/a";

        for (User u : users) {
            System.out.println("This is currentUser: " + currentUser);
            //if ((currentUser == u.getId())) {
                if ((tempUser == u.getId())) {   //this one works, but it's just a temp. Above uses global variable of user that is logged in
                //set fields with currentUser information to be edited

                System.out.println("This is currentUser: " + currentUser);
                //set variables to what is in the textfields

                userEc = String.valueOf(u.getUsername());
                //System.out.println("input " + user);
                passEc = String.valueOf(u.getPassword());
                //System.out.println("input " + pass);
                fnameEc = String.valueOf(u.getFirstName());
                //System.out.println("input " + fname);
                lnameEc = String.valueOf(u.getLastName());
                //System.out.println("input " + lname);
                birthEc = String.valueOf(u.getBirthday());
                //System.out.println("input " + birth);
                addressEc = String.valueOf(u.getAddress());
                //System.out.println("input " + address);
            }
        }

        userFieldEC = new TextField(userEc);
        passFieldEC = new TextField(passEc);
        fNameFieldEC = new TextField(fnameEc);
        lNameFieldEC = new TextField(lnameEc);
        birthFieldEC = new TextField(birthEc);
        addressFieldEC = new TextField(addressEc);


        VBox fieldECBox = new VBox();
        fieldECBox.getChildren().addAll(userFieldEC, passFieldEC, fNameFieldEC, lNameFieldEC, birthFieldEC, addressFieldEC);
        fieldECBox.setSpacing(10);

        HBox midECBox = new HBox();
        midECBox.getChildren().addAll(labelECBox, fieldECBox);
        midECBox.setAlignment(Pos.CENTER);
        midECBox.setSpacing(10);

        saveContactButton = new Button("Save Changes");
        saveContactButton.setPrefWidth(150);
        saveContactButton.setOnAction(new SaveContactButtonHandler());

        editContactBackButton.setPrefWidth(100);
        editContactBackButton.setOnAction(new EditContactBackButtonHandler());

        HBox btnBox = new HBox(saveContactButton, editContactBackButton);
        btnBox.setAlignment(Pos.CENTER);
        btnBox.setSpacing(10);

        VBox editContactPane = new VBox(editLabel, midECBox, btnBox);
        editContactPane.setAlignment(Pos.CENTER);
        editContactPane.setSpacing(50);

        String finalLnameEc = lnameEc;
        String finalFnameEc = fnameEc;
        String finalUserEc = userEc;
        saveContactButton.setOnAction(e ->     {

            //SET STRINGS (put q at the end)
            String userq = String.valueOf(userFieldEC.getText());
            //System.out.println("input " + user);
            String passq = String.valueOf(passFieldEC.getText());
            //System.out.println("input " + pass);
            String fnameq = String.valueOf(fNameFieldEC.getText());
            //System.out.println("input " + fname);
            String lnameq = String.valueOf(lNameFieldEC.getText());
            //System.out.println("input " + lname);
            String birthq = String.valueOf(birthFieldEC.getText());
            //System.out.println("input " + birth);
            String addressq = String.valueOf(addressFieldEC.getText());
            //System.out.println("input " + address);

            boolean userExist = false;

            boolean isPatient = false;

            int currentID = 0;
            String Pharmacy = "n/a";
            int age = 0;
            //read = new CSVReaderWriter();
            //users = read.readCsv(filePath);

            List<User> usersEdit = new ArrayList<User>();
            read = new CSVReaderWriter();
            usersEdit = read.readCsv(filePath);

            for(User u: usersEdit) {
                if((fnameq.equals(u.getFirstName()) == true) && (lnameq.equals(u.getLastName()) == true) && (u.getAccess() == 0)){
                    isPatient = true;
                    currentID = u.getId();
                    Pharmacy = u.getPharmacy();
                    age = u.getAge();
                    System.out.println("Patient EXISTS");
                }
                if((userq.equals(u.getUsername()) == true) && (userq.equals(finalUserEc) == false)){
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
                System.out.println("EDITED");
                //LEAVE THIS PANE ONCE WE ENTER THIS IF STATEMENT!!!
            }
            //}
            System.out.println("ERROR, Missing fields!");
            //ADD PRINT TO THE PANE
            ;
        });
            //Scene editContactScene = new Scene(editContactPane, WINSIZE_X, WINSIZE_Y);
            //primaryStage.setScene(editContactScene);
        //});
        //************************************************************
        //	End  Edit Contact
        //************************************************************





        //************************************************************
        //	Start Visit History
        //************************************************************
        historyLabel.setFont(Font.font(32));
        historyLabel.setAlignment(Pos.TOP_RIGHT);

        visitHistoryBackButton.setText("Back");
        visitHistoryBackButton.setPrefWidth(100);

        visitBox.setPrefWidth(400);
        visitBox.setPrefHeight(400);

        ScrollPane visitScroll = new ScrollPane(visitBox);

        VBox visitHistoryPane = new VBox(historyLabel, visitScroll, visitHistoryBackButton);
        visitHistoryPane.setSpacing(10);
        visitHistoryPane.setAlignment(Pos.CENTER);
        //************************************************************
        //	End Visit History
        //************************************************************

        Scene loginScene = new Scene(patientLoginPane, WINSIZE_X, WINSIZE_Y);

        Scene homeScene = new Scene(patientHomePane, WINSIZE_X, WINSIZE_Y);

        Scene createAccScene = new Scene(createAccPane, WINSIZE_X, WINSIZE_Y);

        Scene contactDocScene = new Scene(contactDoctorPane, WINSIZE_X, WINSIZE_Y);

        Scene editContactScene = new Scene(editContactPane, WINSIZE_X, WINSIZE_Y);

        Scene visitScene = new Scene(visitHistoryPane, WINSIZE_X, WINSIZE_Y);

        //************************************************************
        //	Patient Login
        //************************************************************

        // Patient Login Buttons
        //loginButton.setOnAction(e -> primaryStage.setScene(homeScene));

        loginButton.setOnAction(e -> {
            String user = String.valueOf(usernameTextField.getText());
            //System.out.println("input " + user);
            String pass = String.valueOf(passwordTextField.getText());
            //System.out.println("input " + pass);
            //IF USER AND PASSWORD IS FOUND IN THE DATABASE (needs to be implemented)
            //patient. needs to be replaced with a function that sorts through the database.

            //CREATE AN OBJECT FOR THE LIST
            //THIS IS HOW WE CALL THE LIST TO BE READ FROM .csv FILE

            List<User> usersLog = new ArrayList<User>();

            read = new CSVReaderWriter();
            usersLog = read.readCsv(filePath);

            for(User u: usersLog ) {
                if ((user.equals(u.getUsername()) == true) && (pass.equals(u.getPassword()) == true) && (u.getAccess() == 0)) {
                    System.out.println("WELCOME!");
                    currentUser = u.getId();
                    primaryStage.setScene(homeScene);
                    //cut the loop, CONTINUE TO NEXT PANE

                }
            }


            System.out.println("ERROR, Username or Password not found");
            //ADD PRINT TO THE PANE
        });


        createAccountButton.setOnAction(e -> primaryStage.setScene(createAccScene));
        // ***THIS CODE SHOULD BE ENCLOSED IN A LOOP TO BLOCK FALSE LOGIN***
        // ***You may need to create a handler that passes primary stage as a
        // ***parameter

        //************************************************************
        //	Patient Login
        //************************************************************

        // Patient Home Buttons
        contactInfoButton.setOnAction(e -> primaryStage.setScene(editContactScene));
        visitHistoryButton.setOnAction(e -> primaryStage.setScene(visitScene));
        contactDoctorButton.setOnAction(e -> primaryStage.setScene(contactDocScene));
        homeBackButton.setOnAction(e -> primaryStage.setScene(loginScene));

        // CreateAcc Buttons
        //************************************************************
        //	Create Account
        //************************************************************
        //createButton.setOnAction(e -> primaryStage.setScene(homeScene));
        //==========JORDAN ADDED

        //String filePath = "/Users/jordan/Desktop/project50/user.csv";

        createButton.setOnAction(e -> {

            //SET STRINGS
            String userC = String.valueOf(userField.getText());
            //System.out.println("input " + user);
            String passC = String.valueOf(passField.getText());
            //System.out.println("input " + pass);
            String fnameC = String.valueOf(fNameField.getText());
            //System.out.println("input " + fname);
            String lnameC = String.valueOf(lNameField.getText());
            //System.out.println("input " + lname);
            String birthC = String.valueOf(birthField.getText());
            //System.out.println("input " + birth);
            String addressC = String.valueOf(addressField.getText());
            //System.out.println("input " + address);

            List<User> usersCreate = new ArrayList<User>();

            read = new CSVReaderWriter();

            //Loop to check if username exist in the system=====
            boolean userExist = false;

            boolean isPatient = false;

            int currentIDC = 0;
            String PharmacyC = "n/a";
            int ageC = 0;
            read = new CSVReaderWriter();
            usersCreate = read.readCsv(filePath);

            for(User u: usersCreate ) {
                if((fnameC.equals(u.getFirstName()) == true) && (lnameC.equals(u.getLastName()) == true) && (u.getAccess() == 0)){
                    isPatient = true;
                    currentIDC = u.getId();
                    PharmacyC = u.getPharmacy();
                    ageC = u.getAge();
                    System.out.println("Patient EXISTS");
                }
                if((userC.equals(u.getUsername()) == true)){
                    userExist = true;
                    System.out.println("USER EXISTS");
                }

            }

            //adds user if all fields contain text & if username isn't already in the system & if f and l name are registered by the nurse, (STILL NEEDS TO BE IMPLEMENTED)
            if ((userC != null) && (passC != null) && (fnameC != null) && (lnameC != null) && (birthC != null) && (addressC != null) && (userExist != true) && (isPatient == true) && (currentIDC !=0)) {
                //users = read.addtoCsv(filePath, user, pass, fname, lname, birth, address);

                //GOTTA FIGURE OUT A WAY TO ATTACH PATIENT TO THEIR ACCOUNT (THEY ALREADY SHOULD HAVE A PHARMACY AND AGE, BUT ARENT PROMTED IN THIS PANE)
                //**^^ IMPORTANT
                read.updateEntry(filePath,currentIDC, userC, passC, fnameC, lnameC, birthC, addressC, 0, PharmacyC, ageC);
                //System.out.println("ERROR, Missing fields!");
                //primaryStage.setScene(homeScene);
                primaryStage.setScene(loginScene);      //prefrence I think this makes more sense. Could change to above^
                //LEAVE THIS PANE ONCE WE ENTER THIS IF STATEMENT!!!
            }
            //}
            System.out.println("ERROR, Missing fields!");
            //ADD PRINT TO THE PANE
        });
        createAccBackButton.setOnAction(e -> primaryStage.setScene(loginScene));

        //************************************************************
        //	Create Account
        //************************************************************

        // Contact Doctor Buttons
        contactDoctorBackButton.setOnAction(e -> primaryStage.setScene(homeScene));

        //************************************************************
        //	Edit Contact Login
        //************************************************************
        // Edit Contact Buttons
        editContactBackButton.setOnAction(e -> primaryStage.setScene(homeScene));

        //JORDAN's ADDED CODE============
        //need to think of a catch that will display that user is not found, because the filling the textfields will be an errpr.




        //Loop to check if username exist in the system=====
        //these are final variables to allow use for button handler

        //List<User> users = new ArrayList<User>();
        read = new CSVReaderWriter();
        users = read.readCsv(filePath);

        List<User> finalUsers = users;

        //================
        //************************************************************
        //	Edit Contact Login
        //************************************************************

        // Visit History Buttons
        visitHistoryBackButton.setOnAction(e -> primaryStage.setScene(homeScene));

        primaryStage.setTitle("Patient Portal");
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }

    // Contact Doctor
    private class SubmitButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            // ***CODE TO EXECUTE UPON PRESSING SUBMIT***
            System.out.println("SubmitButton pressed");	// Debug breakpoint

        }

    }

    // Edit Contact
    private class EditContactBackButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            // ***CODE TO EXECUTE UPON PRESSING BACK***
            System.out.println("editContactBackButton pressed");
        }
    }

    // Edit Contact
    private class SaveContactButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            // ***CODE TO EXECUTE UPON PRESSING ADDBUTTON***
            System.out.println("saveContactButton pressed");	// Debug breakpoint

        }

    }





}