package controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainController extends Application{
	NumberGuessController numberGuessController;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene(new Pane(), 1080, 600);
		stage.setScene(scene);
		
	}
}
