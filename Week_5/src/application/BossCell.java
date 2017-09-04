package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class BossCell extends VBox {

	String name;
	int quantity;
	
	public BossCell() {
		ImageView productImage = new ImageView(new Image("images/SnickersVM.png",100,100,false,false));
		ObservableList<String> cb = FXCollections.observableArrayList("1","2","3");
			ComboBox comboBox = new ComboBox(cb);
		Button addBtn = new Button("Add");
		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(20));
		this.getChildren().addAll(productImage,comboBox,addBtn);	

	}
	public BossCell(String prodName, String prodImage, int quantity, double price) {
		ImageView productImage = new ImageView(new Image(prodImage,100,100,false,false));
		ObservableList<String> cb = FXCollections.observableArrayList("1","2","3");
			ComboBox comboBox = new ComboBox(cb);
		Button addBtn = new Button("Add");
		Label productPrice = new Label();
		productPrice.setStyle("-fx-text-fill: white");
		productPrice.setFont(Font.font("MS Arial", FontWeight.BOLD, 12));
		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(20));
		this.getChildren().addAll(productImage,comboBox,addBtn);		
	}
}
