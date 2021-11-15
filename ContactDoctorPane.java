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

public class ContactDoctorPane extends VBox
{
	private Label contactLabel = new Label("Contact Doctor");
	
	private TextField nameField = new TextField("Doctor Name");
	private TextField subjectField = new TextField("Subject Title");
	private TextField messageField = new TextField("Type Message Here");
	
	private Button submitButton = new Button("Submit");
	
	private Button backButton = new Button("Back");
	
	public ContactDoctorPane()
	{
		contactLabel.setFont(Font.font(32));
		contactLabel.setAlignment(Pos.CENTER);
		
		nameField.setPrefWidth(180);
		
		subjectField.setPrefWidth(360);
		messageField.setPrefSize(400, 200);
		
		submitButton.setPrefWidth(100);
		submitButton.setOnAction(new SubmitButtonHandler());
		
		backButton.setPrefWidth(100);
		backButton.setOnAction(new BackButtonHandler());
		
		HBox btnBox = new HBox(submitButton, backButton);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.setSpacing(10);
		
		this.setAlignment(Pos.CENTER_LEFT);
		this.setSpacing(10);
		this.getChildren().addAll(contactLabel, nameField, subjectField, messageField, btnBox);
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

	private class SubmitButtonHandler implements EventHandler<ActionEvent>
    {
		@Override
		public void handle(ActionEvent event) 
		{
			// ***CODE TO EXECUTE UPON PRESSING ADDBUTTON***
			System.out.println("SubmitButton pressed");	// Debug breakpoint
			
		}
    	
    }

}
