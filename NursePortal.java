/*
 * Joshua Ballecer, Shawn Mian, Jadon O'Neil, Jordan Tafesse, Patrick Walker Jauregui
 * Group 50
 * CSE 360 Tuesday 9:00-10:15
 * Description:
 * 
 * 		This class will display the JavaFX window containing all of the elements for 
 * 		the Nurse Portal page. It will create a NursePortal that will be created
 * 		in the NursePortal.java class.
 */


package Nurse;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

	//************************************************************
	//	
	//************************************************************

public class NursePortal extends Application
{
	public static final int WINSIZE_X = 600, WINSIZE_Y = 600;
	
	public static final int BTN_SIZE = 180;
	
	
	//************************************************************
	//	Nurse Login Variables
	//************************************************************
	
	private Label welcomeLabel;	// Displays login text
	private Label loginLabel;
	
	private TextField usernameTextField;
	private Label userLabel;
	
	private TextField passwordTextField;
	private Label passLabel;
	
	private Button loginButton;
	
	//************************************************************
	
	
	
	//************************************************************
	//	Select Patient Variables
	//************************************************************
	private Label selectLabel;
	
	private ComboBox<String> patientCombo;
	
	private Button gotoAddPatientButton;
	
	private Button gotoVitalsButton = new Button("Take Vitals");
	
	private Button gotoHistoryButton = new Button("Patient History");
	
	private Button gotoCurrentAppButton = new Button("Current Appointment");
	
	private Button backButton = new Button("Back");	
	//************************************************************
	//	
	//************************************************************
	
	
	
	//************************************************************
	//	Add Patient Pane Variables
	//************************************************************
	private Label addPatientLabel;
	private Label nameLabel;
	private Label addressLabel;
	private Label pharmaLabel;
	private Label ageLabel;
	
	private TextField nameField;
	private TextField addressField;
	private TextField pharmaField;
	private TextField ageField;
	
	private Button addPatButton;
	
	private Button addPatBackButton = new Button("Back");	
	//************************************************************
	//	
	//************************************************************
	
	
	//************************************************************
	//	Vitals Variables
	//************************************************************
	private Label vitalsLabel;
	private Label infoLabel;
	
	private Label heightLabel;
	private Label weightLabel;
	private Label tempLabel;
	private Label pressureLabel;
	
	private TextField heightField;
	private TextField weightField;
	private TextField tempField;
	private TextField pressureField;
	
	private Button saveButton;
	private Button updateButton;
	
	private Button vitalsBackButton = new Button("Back");	
		
	//************************************************************
	//	History Variables
	//************************************************************
	private Label historyLabel;
	private Label immuneLabel;
	private Label allergyLabel;
	private Label previousLabel;
	private Label medsLabel;
	
	private TextField immuneField;
	private TextField allergyField;
	private TextField previousField;
	private TextField medsField;
	
	private Button saveChangesButton;
	
	private Button historyBackButton = new Button("Back");
	//************************************************************
	//	
	//************************************************************
	
	private Label currentLabelCA = new Label("Current Appointment");
	
	private Label notesLabelCA = new Label("Physical Notes: ");
	private TextField notesFieldCA = new TextField();
	
	private Label medsLabelCA = new Label("Medication Prescribed: ");
	private TextField medsFieldCA = new TextField();
	
	private Label pharmaLabelCA = new Label("Pharmacy Used: ");
	private TextField pharmaFieldCA = new TextField();
	
	private Label historyLabelCA = new Label("Patient History: ");
	private TextField historyFieldCA = new TextField();
	
	private Button saveCurrentAppButton = new Button("Save Changes");
	
	private Button currentAppBackButton = new Button("Back");
	
	public void start(Stage primaryStage)
	{
		//************************************************************
		//	START OF NURSE LOGIN CREATION
		//************************************************************
		VBox nurseLoginPane = new VBox();
		
		welcomeLabel = new Label("Welcome Nurse");
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
		loginButton.setText("Log in");
		loginButton.setPrefWidth(180);
		
		VBox patientGrid = new VBox();
		patientGrid.getChildren().add(welcomeLabel);
		patientGrid.getChildren().add(loginBox);
		patientGrid.getChildren().add(loginButton);
		patientGrid.setAlignment(Pos.CENTER);
		patientGrid.setSpacing(50);
		
		nurseLoginPane.getChildren().add(patientGrid);

		Button testButton = new Button("Log in2");
		testButton.setPrefWidth(180);
		
		Scene loginScene = new Scene(nurseLoginPane, WINSIZE_X, WINSIZE_Y);
		//************************************************************
		//	END OF NURSE LOGIN CREATION
		//	loginScene corresponds to nurseLoginPane
		//************************************************************
		
		
		
		
		//************************************************************
		//	START OF SELECT PATIENT
		//************************************************************
		
		selectLabel = new Label();
		selectLabel.setText("Select Patient");
		selectLabel.setFont(Font.font(32));
		
		patientCombo = new ComboBox<String>();
		patientCombo.setPromptText("Select Patient");
		patientCombo.setPrefWidth(300);
		patientCombo.setOnAction(new ComboBoxHandler());
		
		// ***You will probably need to use loops to add patients***
		/*
		 * Sample code to add and pick items:
		 * 
		 * 		patientCombo.getItems().add("PATIENT NAME");
		 *		patientCombo.getSelectionModel().selectFirst();
		 */
		
		gotoAddPatientButton = new Button();
		gotoAddPatientButton.setText("Add New Patient");
		gotoAddPatientButton.setPrefWidth(150);
		
		
		backButton.setPrefWidth(100);
		
		VBox buttonBox = new VBox();
		buttonBox.getChildren().addAll(gotoAddPatientButton, gotoVitalsButton, gotoHistoryButton, gotoCurrentAppButton, backButton);
		buttonBox.setSpacing(20);
		buttonBox.setAlignment(Pos.CENTER_RIGHT);
		
		VBox selectBox = new VBox();
		selectBox.getChildren().addAll(selectLabel, patientCombo);
		selectBox.setPrefHeight(400);
		selectBox.setSpacing(50);
		selectBox.setAlignment(Pos.CENTER);
		
		VBox selectPatientPane = new VBox(buttonBox, selectBox);
		selectPatientPane.setAlignment(Pos.CENTER);
		//************************************************************
		//	END OF SELECT PATIENT
		//************************************************************
		
		
		
		
		//************************************************************
		//	START OF ADD PATIENT
		//************************************************************
		addPatientLabel = new Label();
		addPatientLabel.setText("Add New Patient");
		addPatientLabel.setFont(Font.font(32));
		
		nameLabel = new Label();
		nameLabel.setText("Name:\t\t ");
		
		addressLabel = new Label();
		addressLabel.setText("Address:\t\t ");
		
		pharmaLabel = new Label();
		pharmaLabel.setText("Pharmacy:\t ");
		
		ageLabel = new Label();
		ageLabel.setText("Age:\t\t\t ");
		
		nameField = new TextField();
		addressField = new TextField();
		pharmaField = new TextField();
		ageField = new TextField();
		
		addPatButton = new Button();
		addPatButton.setText("Add Patient");
		addPatButton.setPrefWidth(180);
		
		backButton.setPrefWidth(180);
		
		addPatButton.setOnAction(new gotoAddPatientButtonHandler());
		
		HBox nameBox = new HBox();
		nameBox.getChildren().addAll(nameLabel, nameField);
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
		
		HBox btnBox = new HBox();
		btnBox.getChildren().addAll(addPatButton, addPatBackButton);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.setSpacing(10);
		
		VBox addGrid = new VBox();
		addGrid.getChildren().addAll(addPatientLabel, nameBox, addressBox, pharmaBox, ageBox, btnBox);
		addGrid.setAlignment(Pos.CENTER);
		addGrid.setSpacing(50);
		
		VBox addPatientPane = new VBox(addGrid);
		addPatientPane.setAlignment(Pos.CENTER);
		//************************************************************
		//	END OF ADD PATIENT
		//************************************************************
		
		
		
		//************************************************************
		//	START OF VITALS	
		//************************************************************
		vitalsLabel = new Label();
		vitalsLabel.setText("Vitals");
		vitalsLabel.setFont(Font.font(32));
		
		infoLabel = new Label();
		infoLabel.setText("Patient Information: ");
		
		heightLabel = new Label();
		heightLabel.setText("Height:\t\t\t ");
		
		weightLabel = new Label();
		weightLabel.setText("Weight:\t\t\t ");
		
		tempLabel = new Label();
		tempLabel.setText("Temperature:\t\t ");
		
		pressureLabel = new Label();
		pressureLabel.setText("Blood Pressure:\t");
		
		heightField = new TextField();
		weightField = new TextField();
		tempField = new TextField();
		pressureField = new TextField();
		
		saveButton = new Button();
		saveButton.setText("Save Changes");
		saveButton.setPrefWidth(180);
		
		saveButton.setOnAction(new SaveButtonHandler());
		
		updateButton = new Button();
		updateButton.setText("Update Vitals");
		updateButton.setPrefWidth(180);
		
		updateButton.setOnAction(new UpdateButtonHandler());
		
		backButton.setPrefWidth(100);
		
		HBox vitalsBtnBox = new HBox();
		vitalsBtnBox.getChildren().addAll(saveButton, updateButton, vitalsBackButton);
		vitalsBtnBox.setAlignment(Pos.CENTER);
		vitalsBtnBox.setSpacing(10);
		
		HBox heightBox = new HBox();
		heightBox.getChildren().addAll(heightLabel, heightField);
		heightBox.setAlignment(Pos.CENTER);
		
		HBox weightBox = new HBox();
		weightBox.getChildren().addAll(weightLabel, weightField);
		weightBox.setAlignment(Pos.CENTER);
		
		HBox tempBox = new HBox();
		tempBox.getChildren().addAll(tempLabel, tempField);
		tempBox.setAlignment(Pos.CENTER);
		
		HBox pressureBox = new HBox();
		pressureBox.getChildren().addAll(pressureLabel, pressureField);
		pressureBox.setAlignment(Pos.CENTER);
		
		VBox vitalsGrid = new VBox();
		vitalsGrid.getChildren().addAll(infoLabel, heightBox, weightBox, tempBox, pressureBox, vitalsBtnBox);
		vitalsGrid.setAlignment(Pos.CENTER);
		vitalsGrid.setSpacing(30);
		
		VBox vitalsPane = new VBox(vitalsLabel, vitalsGrid);
		vitalsPane.setSpacing(30);
		vitalsPane.setAlignment(Pos.CENTER);
		//************************************************************
		//	END OF VITALS
		//************************************************************	
		
		
		
		//************************************************************
		//	PATIENT HISTORY START
		//************************************************************
		historyLabel = new Label();
		historyLabel.setText("Patient History");
		historyLabel.setFont(Font.font(32));
		
		immuneLabel = new Label();
		immuneLabel.setText("Immunization History:\t\t\t ");
		
		allergyLabel = new Label();
		allergyLabel.setText("Allergies:\t\t\t\t\t\t ");
		
		previousLabel = new Label();
		previousLabel.setText("Previous Health issues:\t\t\t ");
		
		medsLabel = new Label();
		medsLabel.setText("Previously Prescribed Medication:\t ");
		
		immuneField = new TextField();
		allergyField = new TextField();
		previousField = new TextField();
		medsField = new TextField();
		
		saveChangesButton = new Button();
		saveChangesButton.setText("Save Changes");
		saveChangesButton.setPrefWidth(180);
		saveChangesButton.setOnAction(new SaveChangesButtonHandler());
		
		historyBackButton.setPrefWidth(180);
		historyBackButton.setOnAction(new HistoryBackButtonHandler());
		
		HBox immuneBox = new HBox();
		immuneBox.getChildren().addAll(immuneLabel, immuneField);
		immuneBox.setAlignment(Pos.CENTER);
		
		HBox allergyBox = new HBox();
		allergyBox.getChildren().addAll(allergyLabel, allergyField);
		allergyBox.setAlignment(Pos.CENTER);
		
		HBox previousBox = new HBox();
		previousBox.getChildren().addAll(previousLabel, previousField);
		previousBox.setAlignment(Pos.CENTER);
		
		HBox medsBox = new HBox();
		medsBox.getChildren().addAll(medsLabel, medsField);
		medsBox.setAlignment(Pos.CENTER);
		
		HBox historyBtnBox = new HBox(saveChangesButton, historyBackButton);
		historyBtnBox.setSpacing(10);
		historyBtnBox.setAlignment(Pos.CENTER);
		
		VBox historyGrid = new VBox();
		historyGrid.getChildren().addAll(historyLabel, immuneBox, allergyBox, previousBox, medsBox, historyBtnBox);
		historyGrid.setAlignment(Pos.CENTER);
		historyGrid.setSpacing(50);
		
		VBox patientHistoryPane = new VBox(historyGrid);
		patientHistoryPane.setAlignment(Pos.CENTER);
		//************************************************************
		//	PATIENT HISTORY END
		//************************************************************
		
		
		
		
		
		//************************************************************
		//	CURRENT APPOINTMENT START
		//************************************************************
		currentLabelCA.setFont(Font.font(32));
		
		notesFieldCA.setPrefSize(300, 50);
		medsFieldCA.setPrefSize(200, 50);
		pharmaFieldCA.setPrefSize(200, 50);
		historyFieldCA.setPrefSize(300, 300);
		
		saveCurrentAppButton.setPrefWidth(180);
		
		currentAppBackButton.setPrefWidth(180);
		
		saveCurrentAppButton.setOnAction(new SaveAppButtonHandler());
		
		
		
		VBox notesBox = new VBox(notesLabelCA, notesFieldCA);
		
		VBox medsBoxCA = new VBox(medsLabelCA, medsFieldCA);
		
		VBox pharmaBoxCA = new VBox(pharmaLabelCA, pharmaFieldCA);
		
		VBox historyBox = new VBox(historyLabelCA, historyFieldCA);
		historyBox.setAlignment(Pos.CENTER);
		
		VBox leftBox = new VBox(notesBox, medsBoxCA, pharmaBoxCA, historyBox);
		leftBox.setSpacing(54);
		
		HBox midBox = new HBox(leftBox, historyBox);
		
		HBox currentAppBtnBox = new HBox(saveCurrentAppButton, currentAppBackButton);
		currentAppBtnBox.setSpacing(10);
		
		VBox currentAppointmentPane = new VBox(currentLabelCA, midBox, currentAppBtnBox);
		currentAppointmentPane.setSpacing(30);
		currentAppointmentPane.setAlignment(Pos.CENTER);
		//************************************************************
		//	CURRENT APPOINTMENT END
		//************************************************************
		
		
		
		

		
		//************************************************************
		//	SCENE CREATION
		//
		//	Important note: This is where the scene switching takes place.
		//************************************************************
		
		Scene selectScene = new Scene(selectPatientPane, WINSIZE_X, WINSIZE_Y);
		
		Scene addPatScene = new Scene(addPatientPane, WINSIZE_X, WINSIZE_Y);
		
		Scene vitalsScene = new Scene(vitalsPane, WINSIZE_X, WINSIZE_Y);
		
		Scene historyScene = new Scene(patientHistoryPane, WINSIZE_X, WINSIZE_Y);
		
		Scene currentAppScene = new Scene(currentAppointmentPane, WINSIZE_X, WINSIZE_Y);
		
		primaryStage.setTitle("Nurse UI");
		primaryStage.setScene(loginScene);
		primaryStage.show();
		
		// *** THESE ARE THE BUTTONS. Change the scene under setScene() 
		// *** according to which scene you want to switch to upon 
		// *** button press.
		
		
		//*** THIS NEEDS TO BE CHANGED ***
		//*** Enclose loginButton.setOnAction(..) in a
		//*** loop to successfully do login ***
		loginButton.setOnAction(e -> primaryStage.setScene(selectScene));
		//***
		
		backButton.setOnAction(e -> primaryStage.setScene(loginScene));
		
		addPatBackButton.setOnAction(e -> primaryStage.setScene(selectScene));
		gotoAddPatientButton.setOnAction(e -> primaryStage.setScene(addPatScene));
		
		gotoVitalsButton.setOnAction(e -> primaryStage.setScene(vitalsScene));
		vitalsBackButton.setOnAction(e -> primaryStage.setScene(selectScene));
		
		gotoHistoryButton.setOnAction(e -> primaryStage.setScene(historyScene));
		historyBackButton.setOnAction(e -> primaryStage.setScene(selectScene));
		
		gotoCurrentAppButton.setOnAction(e -> primaryStage.setScene(currentAppScene));
		currentAppBackButton.setOnAction(e -> primaryStage.setScene(selectScene));
		//************************************************************
		//	End Scene Creation
		//************************************************************
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	// Dead code, revisit later
	private class LoginButtonHandler implements EventHandler<ActionEvent>
    {
		@Override
		public void handle(ActionEvent event) 
		{
			// ***CODE TO EXECUTE UPON PRESSING gotoAddPatientButton***
			System.out.println("Button pressed");	// Debug breakpoint
			
			//***ENCLOSE IN IF STATEMENT BASED ON LOGIN***
			
		}
    	
    }
	
	private class ComboBoxHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			// CODE TO EXECUTE UPON SELECTING PATIENT
			}
		}

	
	//***Corresponds to add patient***//
	private class gotoAddPatientButtonHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent event) {
			// ***CODE TO EXECUTE UPON PRESSING gotoAddPatientButton***
			System.out.println("Add Patient Button pressed");	// Debug breakpoint
			
		}
    	
    }
	
	private class UpdateButtonHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent event) {
			// ***CODE TO EXECUTE UPON PRESSING gotoAddPatientButton***
			System.out.println("UpdateButton pressed");	// Debug breakpoint	
		}
    	
    }
	
	private class SaveButtonHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent event) {
			// ***CODE TO EXECUTE UPON PRESSING gotoAddPatientButton***
			System.out.println("SaveButton pressed");	// Debug breakpoint
			
		}
    	
    }
	
	//For PatientHistory
	private class HistoryBackButtonHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			// ***CODE TO EXECUTE UPON PRESSING BACK***
			System.out.println("historyBackButton pressed");
		}
	}
	
	//For PatientHistory
	private class SaveChangesButtonHandler implements EventHandler<ActionEvent>
    {
		@Override
		public void handle(ActionEvent event) 
		{
			// ***CODE TO EXECUTE UPON PRESSING saveChangesButton***
			System.out.println("Button pressed");	// Debug breakpoint
			
		}
    	
    }
	
	// Corresponds to current appointment pane
		private class SaveAppButtonHandler implements EventHandler<ActionEvent>
	    {
			@Override
			public void handle(ActionEvent event) 
			{
				// ***CODE TO EXECUTE UPON PRESSING ADDBUTTON***
				System.out.println("Button pressed");	// Debug breakpoint
				
			}
	    	
	    }
}
