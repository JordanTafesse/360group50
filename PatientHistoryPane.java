package Nurse;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class PatientHistoryPane extends VBox
{
	private Label historyLabel;
	private Label immuneLabel;
	private Label allergyLabel;
	private Label previousLabel;
	private Label medsLabel;
	
	private TextField immuneField;
	private TextField allergyField;
	private TextField previousField;
	private TextField medsField;
	
	private Button addButton;
	
	public PatientHistoryPane()
	{
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
		
		addButton = new Button();
		addButton.setText("Save Changes");
		addButton.setPrefWidth(180);
		
		HBox nameBox = new HBox();
		nameBox.getChildren().addAll(immuneLabel, immuneField);
		nameBox.setAlignment(Pos.CENTER);
		
		HBox addressBox = new HBox();
		addressBox.getChildren().addAll(allergyLabel, allergyField);
		addressBox.setAlignment(Pos.CENTER);
		
		HBox pharmaBox = new HBox();
		pharmaBox.getChildren().addAll(previousLabel, previousField);
		pharmaBox.setAlignment(Pos.CENTER);
		
		HBox ageBox = new HBox();
		ageBox.getChildren().addAll(medsLabel, medsField);
		ageBox.setAlignment(Pos.CENTER);
		
		VBox addGrid = new VBox();
		addGrid.getChildren().addAll(historyLabel, nameBox, addressBox, pharmaBox, ageBox, addButton);
		addGrid.setAlignment(Pos.CENTER);
		addGrid.setSpacing(50);
		
		this.getChildren().addAll(addGrid);
	}
}
