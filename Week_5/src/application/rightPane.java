package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class rightPane extends VBox {

	public rightPane() {
		this.setStyle("-fx-background-color: rgb(0,0,0)");
		Button btn1 = new Button("Place Holder");
		Button btn2 = new Button("Place Holder");
		Button btn3 = new Button("Place Holder");
		Button btn4 = new Button("Place Holder");
		Button btn5 = new Button("Place Holder");
		Button closeBtn = new Button("Close");
		closeBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.exit(0);
			}
		});
		this.setSpacing(70);
		this.setPadding(new Insets(20));
		this.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,closeBtn);
	}
}
