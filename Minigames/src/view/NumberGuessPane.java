package view;

import controller.NumberGuessController;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class NumberGuessPane extends VBox {
	private TextField inputField;
	private Button guessButton;
	private Text higherLower;
	private NumberGuessController numberGuessController;
	
	public NumberGuessPane(NumberGuessController numberGuessController) {
		this.numberGuessController = numberGuessController;
		initFields();
	}
	
	private void initFields() {
		inputField = new TextField();
		Button guessButton = new Button("Guess");
		guessButton.setOnAction(e -> numberGuessController.guess(Integer.valueOf(inputField.getText())));
		higherLower = new Text();
		
		getChildren().addAll(inputField, guessButton, higherLower);
	}
	
	public void setText(String text) {
		higherLower.setText(text);
	}
}
