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

public class VitalsPane extends VBox
{
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
	private Button backButton = new Button("Back");
	
	public VitalsPane()
	{
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
		
		backButton.setOnAction(new BackButtonHandler());
		
		HBox btnBox = new HBox();
		btnBox.getChildren().addAll(saveButton, updateButton, backButton);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.setSpacing(10);
		
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
		
		VBox addGrid = new VBox();
		addGrid.getChildren().addAll(infoLabel, heightBox, weightBox, tempBox, pressureBox, btnBox);
		addGrid.setAlignment(Pos.CENTER);
		addGrid.setSpacing(30);
		
		this.setSpacing(30);
		this.getChildren().addAll(vitalsLabel, addGrid);
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

	private class UpdateButtonHandler implements EventHandler<ActionEvent>
    {
		@Override
		public void handle(ActionEvent event) 
		{
			// ***CODE TO EXECUTE UPON PRESSING ADDBUTTON***
			System.out.println("UpdateButton pressed");	// Debug breakpoint
			
		}
    	
    }
	
	private class SaveButtonHandler implements EventHandler<ActionEvent>
    {
		@Override
		public void handle(ActionEvent event) 
		{
			// ***CODE TO EXECUTE UPON PRESSING ADDBUTTON***
			System.out.println("SaveButton pressed");	// Debug breakpoint
			
		}
    	
    }
}
