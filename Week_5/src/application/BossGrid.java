package application;

import java.util.ArrayList;

import javafx.scene.layout.GridPane;

public class BossGrid extends GridPane {

	public BossGrid() {
		for(int row = 0; row < 3; row++){
			for(int col = 0; col < 5; col++){
				BossCell bc = new BossCell();
				this.add(bc, col, row);
			}
		}	
	}
	public BossGrid(ArrayList<BossCell> products) {
		this.setStyle("-fx-background-color: rgb(0, 0, 0)");
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
					BossCell bc = products.get(productNum);
					this.add(bc, col, row);
					productNum++;					
				}
			}
		}		
	}
}

