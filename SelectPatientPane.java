package Nurse;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class SelectPatientPane extends VBox
{
	private Label selectLabel;
	
	private ComboBox<String> patientCombo;
	
	private Button addButton;
	
	private Button backButton = new Button("Back");	
	
	public SelectPatientPane()
	{
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
		
		addButton = new Button();
		addButton.setText("Add New Patient");
		addButton.setPrefWidth(150);
		addButton.setOnAction(new ButtonHandler());
		
		backButton.setPrefWidth(100);
		backButton.setOnAction(new BackButtonHandler());
		
		HBox buttonBox = new HBox();
		buttonBox.getChildren().addAll(addButton, backButton);
		buttonBox.setSpacing(20);
		buttonBox.setAlignment(Pos.CENTER_RIGHT);
		
		VBox selectBox = new VBox();
		selectBox.getChildren().addAll(selectLabel, patientCombo);
		selectBox.setPrefHeight(400);
		selectBox.setSpacing(50);
		selectBox.setAlignment(Pos.CENTER);
		
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(buttonBox, selectBox);
	}
	
	private class ButtonHandler implements EventHandler<ActionEvent>
    {
		@Override
		public void handle(ActionEvent event) 
		{
			// ***CODE TO EXECUTE UPON PRESSING ADDBUTTON***
			System.out.println("AddButton pressed");	// Debug breakpoint
			
		}
    	
    }
	
	private class BackButtonHandler implements EventHandler<ActionEvent>
    {
		@Override
		public void handle(ActionEvent event) 
		{
			// ***CODE TO EXECUTE UPON PRESSING ADDBUTTON***
			System.out.println("BackButton pressed");	// Debug breakpoint
			
		}
    	
    }
	
	private class ComboBoxHandler implements EventHandler<ActionEvent> 
	{
		@Override
		public void handle(ActionEvent e) 
		{
			// CODE TO EXECUTE UPON SELECTING PATIENT
			
		}

	}

}
