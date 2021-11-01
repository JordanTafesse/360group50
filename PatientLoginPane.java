/*
 * Joshua Ballecer, Shawn Mian, Jadon O'Neil, Jordan Tafesse, Patrick Walker Jauregui
 * Group 50
 * CSE 360 Tuesday 9:00-10:15
 * Description:
 * 		This class will create a PatientLoginPane that a patient will
 * 		use to log in. They will need a username and password to do this.
 * 		A new patient may also create an account through this with the
 * 		create account functionality.
 * 
 */

//package PhaseII;		

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

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
		
		loginLabel = new Label();
		loginLabel.setText("User Login");
		
		HBox userBox = new HBox();
		usernameTextField = new TextField();
		userLabel = new Label();
		userLabel.setText("Username: ");
		userBox.getChildren().addAll(userLabel, usernameTextField);
		
		HBox passBox = new HBox();
		passwordTextField = new TextField();
		passLabel = new Label();
		passLabel.setText("Password: ");
		passBox.getChildren().addAll(passLabel, passwordTextField);
		
		VBox loginBox = new VBox(); // VBox that contains both username and password elements to add to the gridpane
		loginBox.getChildren().addAll(userBox, passBox);
		
		loginButton = new Button();
		loginButton.setText("Sign in");
		
		createAccountButton = new Button();
		createAccountButton.setText("Create an account");
		
		HBox buttonHBox = new HBox(); // HBox that contains all button elements
		buttonHBox.getChildren().addAll(loginButton, createAccountButton);
		
		GridPane patientGrid = new GridPane();
		patientGrid.add(welcomeLabel, 1, 0);
		patientGrid.add(loginBox, 1, 1);
		patientGrid.add(buttonHBox, 1, 2);
		patientGrid.setHgap(10);
		patientGrid.setVgap(20);
		patientGrid.setAlignment(Pos.CENTER);
		
		this.getChildren().addAll(patientGrid);
	}

}
