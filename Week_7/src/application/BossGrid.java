//Class created by Caleb Miller and is his own work. Modified by Stephan Foster.
package application;

import java.util.ArrayList;

import javafx.scene.layout.GridPane;

public class BossGrid extends GridPane {

	public BossGrid() {
		for(int row = 0; row < 3; row++){
			for(int col = 0; col < 5; col++){
				VendingCell vc = new VendingCell();
				this.add(vc, col, row);
			}
		}	
	}
	public BossGrid(Dispenser myDispenser) {
		this.setStyle("-fx-background-color: rgb(73,47,146)");
		ArrayList<Product> products = myDispenser.getProducts();
		int rows,col,productNum = 0;
		if(products.size() > 10 && products.size() <= 15){
			rows = 3;
		}
		else if (products.size() > 5 && products.size() <= 10){
			rows = 2;
		}
		else {
			rows = 1;
		}
		for(int row = 0; row < rows; row++){
			for(col = 0; col < 5; col++){
				if(productNum < products.size()){
					BossCell vc = new BossCell(myDispenser,productNum);
					this.add(vc, col, row);
					productNum++;					
				}
			}
		}		
	}
}