//class originally created by Caleb Miller and is his own code. Class updated by Stephan Foster.

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	Dispenser myDispenser = new Dispenser();
	BorderPane root = new BorderPane();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			VendingGrid vg = new VendingGrid(myDispenser.displayProducts());	
			VendingTitle vt = new VendingTitle();
			Footer footer = new Footer();
			leftPane lp = new leftPane();
			rightPane rp = new rightPane();
			
			root.setLeft(lp);
			root.setRight(rp);
			root.setCenter(vg);
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
	
	public static void main(String[] args) {
		launch(args);
	}
}