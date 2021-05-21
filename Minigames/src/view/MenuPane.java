package view;

import controller.MainController;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MenuPane extends Pane {
	Button numberGuesserButton;
	MainController mainController;
	
	public MenuPane(MainController mainController) {
		numberGuesserButton = new Button("Guess the number");
		numberGuesserButton.setOnAction(e -> {mainController.goToNumberGuesser();});
		getChildren().add(numberGuesserButton);
	}
}
