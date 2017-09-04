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
	VendingGrid vg = new VendingGrid(myDispenser.displayProducts());
	BorderPane root = new BorderPane();
	BossGrid bg = new BossGrid();
	
	@Override
	public void start(Stage primaryStage) {
		try {	
			root.setLeft(lp);
			root.setRight(rp);
			root.setCenter(vg);
			setButton();
			root.setTop(vt);
			root.setBottom(footer);
			
			//Create and show()
			Scene scene = new Scene(root,900,800);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Vending Machine");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	private void setButton() {
		Button Btn = rightPane.getBtn_changePane();
		Btn.setOnAction(e-> {
			root.setCenter(bg);
		});
		Button Btn1 = rightPane.getBtn_root();
		Btn1.setOnAction(e-> {
			root.setCenter(vg);
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}