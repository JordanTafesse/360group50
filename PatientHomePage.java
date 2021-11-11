package Patient;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class PatientHomePage extends HBox
{
	public static final int WINSIZE_X = 600, WINSIZE_Y = 600;
	
	private Label welcomeLabel;
	private Label homePageLabel;
	private Label destinationLabel;
	
	private Button contactInfoButton;
	private Button visitHistoryButton;
	private Button contactDoctorButton;
	
	public PatientHomePage()
	{
		welcomeLabel = new Label();
		welcomeLabel.setText("Welcome!");
		welcomeLabel.setFont(Font.font(32));
		
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
		
		VBox homeVBox = new VBox();
		homeVBox.getChildren().addAll(homePageLabel, destinationLabel);
		homeVBox.setSpacing(20);
		homeVBox.setAlignment(Pos.CENTER);
		
		VBox buttonVBox = new VBox();
		buttonVBox.getChildren().addAll(contactInfoButton, visitHistoryButton, contactDoctorButton);
		buttonVBox.setSpacing(20);
		buttonVBox.setAlignment(Pos.CENTER);
		
		VBox homeGrid = new VBox();
		homeGrid.getChildren().addAll(welcomeLabel, homeVBox, buttonVBox);
		homeGrid.setAlignment(Pos.CENTER);
		homeGrid.setSpacing(50);
		
		
		this.getChildren().addAll(homeGrid);
	}
}









