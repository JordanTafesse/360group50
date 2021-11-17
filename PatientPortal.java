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


package Patient;

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

	//************************************************************
	//	
	//************************************************************

public class PatientPortal extends Application
{
	public static final int WINSIZE_X = 600, WINSIZE_Y = 600;
	
	// Start  Variables for Patient Login
	
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
		editLabel = new Label("Edit Contact Information");
		editLabel.setFont(Font.font(32));
		
		userLabelEC = new Label("Username: ");
		userFieldEC = new TextField();
		
		passLabelEC = new Label("Password: ");
		passFieldEC = new TextField();
		
		fNameLabelEC = new Label("First Name: ");
		fNameFieldEC = new TextField();
		
		lNameLabelEC = new Label("Last Name: ");
		lNameFieldEC = new TextField();
		
		birthLabelEC = new Label("Date of Birth: ");
		birthFieldEC = new TextField();
		
		addressLabelEC = new Label("Address: ");
		addressFieldEC = new TextField();
		
		VBox labelECBox = new VBox();
        labelECBox.getChildren().addAll(userLabelEC, passLabelEC, fNameLabelEC, lNameLabelEC, birthLabelEC, addressLabelEC);
        labelECBox.setAlignment(Pos.CENTER_RIGHT);
        labelECBox.setSpacing(20);
        
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
		
		// Patient Login Buttons
		loginButton.setOnAction(e -> primaryStage.setScene(homeScene));
		createAccountButton.setOnAction(e -> primaryStage.setScene(createAccScene));
		// ***THIS CODE SHOULD BE ENCLOSED IN A LOOP TO BLOCK FALSE LOGIN***
		// ***You may need to create a handler that passes primary stage as a
		// ***parameter
		
		// Patient Home Buttons
		contactInfoButton.setOnAction(e -> primaryStage.setScene(editContactScene));
		visitHistoryButton.setOnAction(e -> primaryStage.setScene(visitScene));
		contactDoctorButton.setOnAction(e -> primaryStage.setScene(contactDocScene));
		homeBackButton.setOnAction(e -> primaryStage.setScene(loginScene));
		
		// CreateAcc Buttons
		createButton.setOnAction(e -> primaryStage.setScene(homeScene));
		createAccBackButton.setOnAction(e -> primaryStage.setScene(loginScene));
		
		// Contact Doctor Buttons
		contactDoctorBackButton.setOnAction(e -> primaryStage.setScene(homeScene));
		
		// Edit Contact Buttons
		editContactBackButton.setOnAction(e -> primaryStage.setScene(homeScene));
		
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
