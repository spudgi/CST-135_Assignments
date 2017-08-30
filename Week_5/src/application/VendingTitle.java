package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;


public class VendingTitle extends HBox {

	public VendingTitle() {
		ImageView title = new ImageView(new Image("images/VendoGCUVM.PNG",400,200,true,true));
		this.setStyle("-fx-background-color: rgb(0,0,0)");
		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(5));
		this.getChildren().add(title);
	}
}
