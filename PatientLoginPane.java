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

package Patient;		

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

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
		loginButton.setOnAction(new LoginButtonHandler());
		
		createAccountButton = new Button();
		createAccountButton.setText("Create an account");
		createAccountButton.setPrefWidth(180);
		createAccountButton.setOnAction(new CreateButtonHandler());
		
		
		HBox buttonHBox = new HBox(); // HBox that contains all button elements
		buttonHBox.getChildren().addAll(loginButton, createAccountButton);
		buttonHBox.setSpacing(10);
		
		VBox patientGrid = new VBox();
		patientGrid.getChildren().add(welcomeLabel);
		patientGrid.getChildren().add(loginBox);
		patientGrid.getChildren().add(buttonHBox);
		patientGrid.setAlignment(Pos.CENTER);
		patientGrid.setSpacing(50);
		
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(patientGrid);
	}

	private class LoginButtonHandler implements EventHandler<ActionEvent>
    {
		@Override
		public void handle(ActionEvent event) 
		{
			// ***CODE TO EXECUTE UPON PRESSING ADDBUTTON***
			System.out.println("LoginButton pressed");	// Debug breakpoint
			
		}
    	
    }
	
	private class CreateButtonHandler implements EventHandler<ActionEvent>
    {
		@Override
		public void handle(ActionEvent event) 
		{
			// ***CODE TO EXECUTE UPON PRESSING ADDBUTTON***
			System.out.println("CreateAccButton pressed");	// Debug breakpoint
			
		}
    	
    }

}
