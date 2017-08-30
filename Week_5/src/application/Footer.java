package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Footer extends HBox {
	
	public Footer() {
		Label label = new Label("Created by Stephan Foster and Caleb Miller and is their own work.");
		label.setPrefSize(600, 16);
		label.setStyle("-fx-text-fill: white");
		label.setFont(Font.font("MS Arial", FontWeight.BOLD, 12));
		this.setStyle("-fx-background-color: rgb(0,0,0)");
		this.setPadding(new Insets(20));
		this.getChildren().addAll(label);
	}
}
