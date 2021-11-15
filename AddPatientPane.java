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

public class AddPatientPane extends VBox
{
	private Label addPatientLabel;
	private Label nameLabel;
	private Label addressLabel;
	private Label pharmaLabel;
	private Label ageLabel;
	
	private TextField nameField;
	private TextField addressField;
	private TextField pharmaField;
	private TextField ageField;
	
	private Button addButton;
	
	private Button backButton = new Button("Back");
	
	public AddPatientPane()
	{
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
		
		addButton = new Button();
		addButton.setText("Add Patient");
		addButton.setPrefWidth(180);
		
		backButton.setPrefWidth(180);
		backButton.setOnAction(new BackButtonHandler());
		
		addButton.setOnAction(new ButtonHandler());
		
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
		btnBox.getChildren().addAll(addButton, backButton);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.setSpacing(10);
		
		VBox addGrid = new VBox();
		addGrid.getChildren().addAll(addPatientLabel, nameBox, addressBox, pharmaBox, ageBox, btnBox);
		addGrid.setAlignment(Pos.CENTER);
		addGrid.setSpacing(50);
		
		this.getChildren().addAll(addGrid);
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
	
	private class BackButtonHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			// ***CODE TO EXECUTE UPON PRESSING BACK***
			System.out.println("BackButton pressed");
		}
	}


}
