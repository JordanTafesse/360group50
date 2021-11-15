package Nurse;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class NurseLoginPane extends HBox
{
	private Label welcomeLabel;	// Displays login text
	private Label loginLabel;
	
	private TextField usernameTextField;
	private Label userLabel;
	
	private TextField passwordTextField;
	private Label passLabel;
	
	private Button loginButton;		// Patient will click this to log in
	
	public NurseLoginPane()
	{
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
		
		loginButton.setOnAction(new ButtonHandler());
		
		VBox patientGrid = new VBox();
		patientGrid.getChildren().add(welcomeLabel);
		patientGrid.getChildren().add(loginBox);
		patientGrid.getChildren().add(loginButton);
		patientGrid.setAlignment(Pos.CENTER);
		patientGrid.setSpacing(50);
		
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(patientGrid);
	}
	
	private class ButtonHandler implements EventHandler<ActionEvent>
    {
		@Override
		public void handle(ActionEvent event) 
		{
			// ***CODE TO EXECUTE UPON PRESSING ADDBUTTON***
			System.out.println("Button pressed");	// Debug breakpoint
			
		}
    	
    }

}
