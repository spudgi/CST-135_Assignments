//Class originaly made by Caleb Miller and is his own work
package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class rightPane extends VBox {
	
	public static Button closeBtn = new Button("Shutdown");
	public static Button getcloseBtn() {
		return closeBtn;
	}
	public static Button Btn_root = new Button();
	public static Button getBtn_root() {
		return Btn_root;
	}
	public static Button Btn_changePane = new Button();
	public static Button getBtn_changePane() {
		return Btn_changePane;
	}
	
	public static Image cart = new Image("images/shoppingcart.jpg",60,60,false,false);
	public static Button sc = new Button();
	public static Button getBtn_sc() {
		return sc;
	}

	public rightPane() {
		this.setStyle("-fx-background-color: rgb(0,0,0)");
		Btn_root.setText("Shop");
		Btn_root.setOpacity(.1);
		Btn_changePane.setText("Boss View");
		Btn_changePane.setOpacity(.1);
		closeBtn.setOpacity(0);
		closeBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.exit(0);
			}
		});
		
		sc.setGraphic(new ImageView(cart));
		sc.setStyle("-fx-background-color: rgb(0,0,0)");
		
		this.setSpacing(70);
		this.setPadding(new Insets(20));
		this.getChildren().addAll(Btn_root,Btn_changePane,closeBtn,sc);
	}
	
}
