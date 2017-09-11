//Class created by Caleb Miller and is his own work. Modified by Stephan Foster.
package application;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class VendingCell extends VBox {
	
	//null constructor. Should be depreciated
	public VendingCell() {
		ImageView productImage = new ImageView(new Image("images/mms2_1.jpg",200,100,true,true));
		Button productBtn = new Button("Buy Now");
		Label productPrice = new Label("$1.00");
		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(20));
		this.getChildren().addAll(productImage,productPrice,productBtn);
	}
	public VendingCell(Dispenser myDispenser, int i){
		ArrayList<Product> products = myDispenser.getProducts();
		Product product = products.get(i);
		ImageView productImage = new ImageView(new Image(product.getImage(),100,100,false,false));
		Label productPrice = new Label("$" + String.format("%1$,.2f", product.getPrice()));
		Label productQuantity = new Label("Remaining: " + product.getQuantity());
		productPrice.setStyle("-fx-text-fill: white");
		productPrice.setFont(Font.font("MS Arial", FontWeight.BOLD, 12));
		productQuantity.setStyle("-fx-text-fill: white");
		productQuantity.setFont(Font.font("MS Arial", FontWeight.BOLD, 12));
		Button productBtn = new Button("Buy Now");
		productBtn.setOnAction(e -> {
			products.get(i).sellOne();
			if(product.getQuantity() < 1){
				this.setVisible(false);	
			}
			else {
				productQuantity.setText("Remaining: " + product.getQuantity());
			}
		});
		Tooltip prodToolTip = new Tooltip(product.getName());
		productBtn.setTooltip(prodToolTip);		
		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(20));
		if(product.getQuantity() > 0){
			this.getChildren().addAll(productImage,productPrice,productQuantity,productBtn);
			} 			
	}
}
