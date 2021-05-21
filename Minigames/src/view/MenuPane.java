package view;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MenuPane extends Pane {
	Button numberGuesserButton;
	
	public MenuPane() {
		numberGuesserButton = new Button("Guess the number");
		getChildren().add(numberGuesserButton);
	}
}
