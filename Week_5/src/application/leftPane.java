//Class Created by Caleb Miller and is his own work
package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class leftPane extends VBox {

	public leftPane() {
		this.setStyle("-fx-background-color: rgb(0,0,0)");
		Button closeBtn = new Button("Close");
		closeBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.exit(0);
			}
		});
		this.setPadding(new Insets(20));
	}
}
