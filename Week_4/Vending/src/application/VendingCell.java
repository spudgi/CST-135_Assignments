//Class created by Caleb Miller and is his own work
package application;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class VendingCell extends VBox {
	
	public VendingCell() {
		ImageView snickers = new ImageView(new Image("/images/SnickersVM.png",200, 120, true, true));
		Button btn = new Button();
		btn.setText("Buy Now");
		this.getChildren().addAll(snickers, btn);
		
		ImageView butterfinger = new ImageView(new Image("/images/ButterFingerVM.png",200, 120, true, true));
		Button btn1 = new Button();
		btn1.setText("Buy Now");
		this.getChildren().addAll(butterfinger, btn1);
		
		ImageView twix = new ImageView(new Image("/images/TwixVM.png",120, 40, true, true));
		Button btn2 = new Button();
		btn2.setText("Buy Now");
		this.getChildren().addAll(twix, btn2);
		
		ImageView heath = new ImageView(new Image("/images/HeathVM.png",200, 100, true, true));
		Button btn3 = new Button();
		btn3.setText("Buy Now");
		this.getChildren().addAll(heath, btn3);
	}
}
