package Patient;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VisitHistoryTest extends Application
{
public static final int WINSIZE_X = 600, WINSIZE_Y = 600;
	
	public void start(Stage primaryStage)
	{
		
		VisitHistoryPane patPane = new VisitHistoryPane();
		patPane.setPrefSize(WINSIZE_X, WINSIZE_Y);
		
		Scene scene = new Scene(patPane, WINSIZE_X, WINSIZE_Y);
		primaryStage.setTitle("Patient UI");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}
