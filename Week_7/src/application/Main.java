//class originally created by Caleb Miller and is his own code. Class updated by Stephan Foster.

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	Dispenser myDispenser = new Dispenser();
	VendingTitle vt = new VendingTitle();
	Footer footer = new Footer();
	leftPane lp = new leftPane();
	rightPane rp = new rightPane();
	VendingGrid vg = new VendingGrid(myDispenser);
	BorderPane root = new BorderPane();
	BossGrid bg = new BossGrid(myDispenser);
	
	@Override
	public void start(Stage primaryStage) {
			root.setLeft(lp);
			root.setRight(rp);
			root.setCenter(vg);
			setButton();
			root.setTop(vt);
			root.setBottom(footer);
			
			Scene scene = new Scene(root,900,900);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Vending Machine");
			primaryStage.show();
	}
	
	private void setButton() {
		Button closeBtn = rightPane.getcloseBtn();
		Button Btn_root = rightPane.getBtn_root();
		Button Btn = rightPane.getBtn_changePane();
		Btn.setOnAction(e-> {
			BossGrid bg = new BossGrid(myDispenser);
			closeBtn.setOpacity(1);
			Btn_root.setOpacity(1);
			root.setCenter(bg);
		});
		Button Btn1 = rightPane.getBtn_root();
		Btn1.setOnAction(e-> {
			VendingGrid vg = new VendingGrid(myDispenser);
			closeBtn.setOpacity(0);
			Btn_root.setOpacity(.1);
			root.setCenter(vg);
		});
		Button Btn2 = rightPane.getBtn_sc();
		Btn2.setOnAction(e-> {
			ShoppingCart shc = new ShoppingCart(myDispenser);
			Btn_root.setOpacity(1);
			root.setCenter(shc);
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}