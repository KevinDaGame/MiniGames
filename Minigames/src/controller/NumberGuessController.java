package controller;

import java.util.Random;

import javafx.scene.layout.Pane;
import view.NumberGuessPane;
import view.NumberGuessSetupPane;

public class NumberGuessController {
	private int number;
	private int guesses;
	private MainController mainController;
	private NumberGuessSetupPane numberGuessSetupPane;
	private NumberGuessPane numberGuessPane;
	
	public NumberGuessController(MainController mainController) {
		this.mainController = mainController;
		startSetup();
	}
	
	private void startSetup() {
		numberGuessSetupPane = new NumberGuessSetupPane(this);
		mainController.setPane(numberGuessSetupPane);
	}
	
	private void startGuessing() {
		numberGuessPane = new NumberGuessPane(this);
		mainController.setPane(numberGuessPane);
	}
	
	
	public void setNumber(int bound){
		generateNumber(bound);
		startGuessing();
		
	}
	
	private void generateNumber(int bound) {
		Random random = new Random();
		number = random.nextInt(bound);
	}
	
	public void guess(int number) {
		if(number == getNumber()) {
			numberGuessPane.setText("Correct!");
		}
		else if(number > getNumber()) {
			numberGuessPane.setText("Lower");
		}
		else if(number < getNumber()) {
			numberGuessPane.setText("Higher");
		}
	}
	
	private int getNumber() {
		return number;
	}


}
