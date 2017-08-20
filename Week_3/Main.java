//class originally created by Caleb Miller and is his own code. Class updated by Stephan Foster.

package application;

import java.util.ArrayList;

public abstract class Main {
	
	private static ArrayList<Product> products;
	
	public static void main(String[] args) {
		Product.bubbleSort(products);
	}

}
