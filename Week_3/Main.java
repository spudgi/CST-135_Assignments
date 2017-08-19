//class originally created by Caleb Miller and is his own code. Class updated by Stephan Foster.

package application;

import java.util.ArrayList;

public abstract class Main implements Comparable<Candy>{
	
	public static void main(String[] args) {
		ArrayList<Candy> products = new ArrayList<Candy>();
		products.add(new Candy("Snickers", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar"));
		products.add(new Candy("Twix", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar"));
		products.add(new Candy("Almond Joy", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar"));
		products.add(new Candy("Butter Finger", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar"));
		Product.bubbleSort(products);
	}
}
