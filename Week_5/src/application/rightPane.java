package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class rightPane extends VBox {
	public static Button Btn_root = new Button();
	public static Button getBtn_root() {
		return Btn_root;
	}
	public static Button Btn_changePane = new Button();
	public static Button getBtn_changePane() {
		return Btn_changePane;
	}

	public rightPane() {
		this.setStyle("-fx-background-color: rgb(0,0,0)");
		Btn_root.setText("Main View");
		Btn_changePane.setText("Change View");		
		Button closeBtn = new Button("Close");
		closeBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.exit(0);
			}
		});
		this.setSpacing(70);
		this.setPadding(new Insets(20));
		this.getChildren().addAll(Btn_root,Btn_changePane,closeBtn);
	}

	
}
