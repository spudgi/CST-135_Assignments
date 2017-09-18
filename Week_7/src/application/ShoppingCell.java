//Created by Caleb Miller and modified by Stephan Foster
package application;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ShoppingCell extends VBox {
	
	public ShoppingCell() {
		ImageView productImage = new ImageView(new Image("images/mms2_1.jpg",200,100,true,true));
		Button productBtn = new Button("Buy Now");
		Label productPrice = new Label("$1.00");
		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(20));
		this.getChildren().addAll(productImage,productPrice,productBtn);
	}
	
	public ShoppingCell(Dispenser myDispenser, int i){
		ArrayList<Product> products = myDispenser.getShoppingCart();
		Product product = products.get(i);
		ImageView productImage = new ImageView(new Image(product.getImage(),100,100,false,false));
		Label productName = new Label(product.getName());
		Label productPrice = new Label("$" + String.format("%1$,.2f", product.getPrice()));
		productPrice.setStyle("-fx-text-fill: white");
		productPrice.setFont(Font.font("MS Arial", FontWeight.BOLD, 12));
		productName.setStyle("-fx-text-fill: white");
		productName.setFont(Font.font("MS Arial", FontWeight.BOLD, 12));
		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(20));
		this.getChildren().addAll(productName,productImage,productPrice);			
	}

}
