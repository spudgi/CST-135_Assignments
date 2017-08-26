//Class created by Caleb Miller and is his own work
package application;

import javafx.scene.layout.GridPane;

public class VendingGrid extends GridPane {

	public VendingGrid() {
		VendingCell vc = new VendingCell();
		this.getChildren().add(vc);
	}
}
