package view;

import controller.NumberGuessController;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class NumberGuessSetupPane extends VBox {
	private Button upToTen;
	private Button upToHundred;
	private Button upToThousand;
	private TextField custom;
	private Button confirmCustom;
	private NumberGuessController numberGuessController;
	
	public NumberGuessSetupPane(NumberGuessController numberGuessController) {
		this.numberGuessController = numberGuessController;
		initFields();
	}

	private void initFields() {
		upToTen = new Button("10");
		upToHundred = new Button("100");
		upToThousand = new Button("1000");
		confirmCustom = new Button("Use custom value");
		custom = new TextField();
		
		upToTen.setOnAction( e -> numberGuessController.setNumber(10));
		upToHundred.setOnAction( e -> numberGuessController.setNumber(100));
		upToThousand.setOnAction( e -> numberGuessController.setNumber(1000));
		confirmCustom.setOnAction( e -> numberGuessController.setNumber(Integer.valueOf(custom.getText())));
		
		getChildren().addAll(upToTen, upToHundred, upToThousand, custom, confirmCustom);
		
	}
}
