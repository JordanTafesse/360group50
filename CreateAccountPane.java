package Patient;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class CreateAccountPane extends VBox
{
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
		
		this.setAlignment(Pos.CENTER);
		this.setSpacing(50);
		this.getChildren().addAll(createLabel, midBox, createButton);
	}

}
