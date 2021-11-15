package Patient;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class VisitHistoryPane extends VBox
{
	private Label historyLabel = new Label ("Visit History");
	private TextArea visitBox = new TextArea();
	private Button backButton = new Button();
	
	public VisitHistoryPane()
	{
		historyLabel.setFont(Font.font(32));
		historyLabel.setAlignment(Pos.TOP_RIGHT);
		
		backButton.setText("Back");
		backButton.setPrefWidth(100);
		
		visitBox.setPrefWidth(400);
		visitBox.setPrefHeight(400);
		
		ScrollPane visitScroll = new ScrollPane(visitBox);
		
		this.setSpacing(10);
		this.getChildren().addAll(historyLabel, visitScroll, backButton);
	}
}
