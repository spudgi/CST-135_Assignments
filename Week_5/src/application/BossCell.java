//Class created by Caleb Miller and is his own work. Modified by Stephan Foster.
package application;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class BossCell extends VBox {
	public BossCell(Dispenser myDispenser, int i){
		ArrayList<Product> products = myDispenser.getProducts();
		Product product = products.get(i);
		Label nameLabel = new Label("Name");
		TextField productName = new TextField(product.getName());
		Label priceLabel = new Label("Price");
		TextField productPrice = new TextField(product.getPrice() + "");
		Label quantityLabel = new Label("Quantity");
		TextField productQuantity = new TextField(product.getQuantity() + "");
		Button productBtn = new Button("Update");
		productBtn.setOnAction(e -> {
			product.setName(productName.getText());
			product.setPrice(Double.parseDouble(productPrice.getText()));
			product.setQuantity(Integer.parseInt(productQuantity.getText()));
		});	
		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(20));
		this.getChildren().addAll(nameLabel,productName,priceLabel,productPrice,quantityLabel,productQuantity,productBtn);			
	}
	
}