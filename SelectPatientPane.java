package Nurse;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class SelectPatientPane extends VBox
{
	private Label selectLabel;
	
	private ComboBox<String> patientCombo;
	
	private Button addButton;
	
	public SelectPatientPane()
	{
		selectLabel = new Label();
		selectLabel.setText("Select Patient");
		selectLabel.setFont(Font.font(32));
		
		patientCombo = new ComboBox<String>();
		patientCombo.setPromptText("Select Patient");
		patientCombo.setPrefWidth(300);
		
		addButton = new Button();
		addButton.setText("Add New Patient");
		addButton.setPrefWidth(150);
		
		HBox buttonBox = new HBox();
		buttonBox.getChildren().add(addButton);
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

}
