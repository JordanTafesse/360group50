/*
 * Joshua Ballecer, Shawn Mian, Jadon O'Neil, Jordan Tafesse, Patrick Walker Jauregui
 * Group 50
 * CSE 360 Tuesday 9:00-10:15
 * Description:
 * 
 * 		This class will display the JavaFX window containing all of the elements for 
 * 		the Patient Login page. It will create a PatientLoginPane that will be created
 * 		in the PatientLoginPane.java class.
 */


package Patient;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CreateAccountTest extends Application
{
	public static final int WINSIZE_X = 600, WINSIZE_Y = 600;
	
	public void start(Stage primaryStage)
	{
		
		CreateAccountPane patPane = new CreateAccountPane();
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
