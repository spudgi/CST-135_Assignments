//class created by Caleb Miller and is his own code.

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	BorderPane root = new BorderPane();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			VendingGrid vg = new VendingGrid();
			
			HBox display = new HBox();

			
			display.setStyle("-fx-background-color: black");
			
			
			root.setCenter(vg);		
			root.setTop(display);
			
			//Create and show()
			Scene scene = new Scene(root,700,800);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Topic 4 DQ 1");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

//Dispenser testDispenser = new Dispenser();
//testDispenser.displayProducts();
//display the Dispenser toString()
//System.out.println(testDispenser.toString());
//added test products
//Candy testProd1 = new Candy("Snickers", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar");
//Candy testProd2 = new Candy("Twix", 1.75, 1, .6, 1.00, 1.00, "Mars", "chocolate bar");
//Candy testProd3 = new Candy("Almond Joy", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar");
//Candy testProd4 = new Candy("Almond Joy", 1.50, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar");
//Candy testProd5 = new Candy("Butter Finger", 1.75, 1, .6, 1.00, 1.00, "Nestle", "chocolate bar");
//tester of compareTo()
//printTest("\n" + testProd1.compareTo(testProd2) + "\n");
//printTest(testProd2.compareTo(testProd3) + "\n");
//printTest(testProd2.compareTo(testProd4) + "\n");
//printTest(testProd4.compareTo(testProd5) + "\n");
///}

//public static void printTest(String t){
///System.out.println(t);
//}
