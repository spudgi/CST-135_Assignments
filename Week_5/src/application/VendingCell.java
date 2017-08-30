//Class created by Caleb Miller and is his own work. Modified by Stephan Foster.
package application;

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
	public VendingCell(String prodName, String prodImage, double prodPrice) {
		ImageView productImage = new ImageView(new Image(prodImage,100,100,false,false));
		Button productBtn = new Button("Buy Now");
		Tooltip prodToolTip = new Tooltip(prodName);
		productBtn.setTooltip(prodToolTip);
		Label productPrice = new Label("$" + String.format("%1$,.2f", prodPrice));
		productPrice.setStyle("-fx-text-fill: white");
		productPrice.setFont(Font.font("MS Arial", FontWeight.BOLD, 12));
		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(20));
		this.getChildren().addAll(productImage,productPrice,productBtn);		
	}
}