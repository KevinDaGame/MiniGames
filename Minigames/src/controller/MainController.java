package controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import view.MenuPane;

public class MainController extends Application{
	NumberGuessController numberGuessController;
	MenuPane menuPane;
	Scene scene;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		scene = new Scene(new Pane(), 1080, 600);
		stage.setScene(scene);
		stage.show();
		goToMenu();
		
	}
	
	public void goToMenu() {
		menuPane = new MenuPane(this);
		setPane(menuPane);
	}
	
	public void goToNumberGuesser() {
		numberGuessController = new NumberGuessController(this);
	}
	
	public void setPane(Pane p) {
		scene.setRoot(p);
	}
}
