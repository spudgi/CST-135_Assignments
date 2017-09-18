//Created by Caleb Miller and modified by Stephan Foster
package application;

import java.util.ArrayList;
import javafx.scene.layout.GridPane;

public class ShoppingCart extends GridPane {
	
	
	public ShoppingCart(Dispenser myDispenser) {
			this.setStyle("-fx-background-color: rgb(73,47,146)");
			ArrayList<Product> products = myDispenser.getShoppingCart();
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
						ShoppingCell sc = new ShoppingCell(myDispenser,productNum);
						this.add(sc, col, row);
						productNum++;					
					}
				}
			}		
		}

}
