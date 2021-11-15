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

public class CurrentAppointmentPane extends VBox
{
	private Label currentLabel = new Label("Current Appointment");
	
	private Label notesLabel = new Label("Physical Notes: ");
	private TextField notesField = new TextField();
	
	private Label medsLabel = new Label("Medication Prescribed: ");
	private TextField medsField = new TextField();
	
	private Label pharmaLabel = new Label("Pharmacy Used: ");
	private TextField pharmaField = new TextField();
	
	private Label historyLabel = new Label("Patient History: ");
	private TextField historyField = new TextField();
	
	private Button saveButton = new Button("Save Changes");
	
	private Button backButton = new Button("Back");
	
	public CurrentAppointmentPane()
	{
		currentLabel.setFont(Font.font(32));
		
		notesField.setPrefSize(300, 50);
		medsField.setPrefSize(200, 50);
		pharmaField.setPrefSize(200, 50);
		historyField.setPrefSize(300, 300);
		
		saveButton.setPrefWidth(180);
		
		backButton.setPrefWidth(180);
		
		saveButton.setOnAction(new ButtonHandler());
		
		backButton.setOnAction(new BackButtonHandler());
		
		VBox notesBox = new VBox(notesLabel, notesField);
		
		VBox medsBox = new VBox(medsLabel, medsField);
		
		VBox pharmaBox = new VBox(pharmaLabel, pharmaField);
		
		VBox historyBox = new VBox(historyLabel, historyField);
		historyBox.setAlignment(Pos.CENTER);
		
		VBox leftBox = new VBox(notesBox, medsBox, pharmaBox, historyBox);
		leftBox.setSpacing(54);
		
		HBox midBox = new HBox(leftBox, historyBox);
		
		HBox btnBox = new HBox(saveButton, backButton);
		btnBox.setSpacing(10);
		
		this.setSpacing(30);
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(currentLabel, midBox, btnBox);
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
