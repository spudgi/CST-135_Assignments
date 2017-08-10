package application;

import java.util.ArrayList;

public abstract class Dispenser {
	
	private ArrayList<Product> products;

	Product[] items;
	int numItems = 0;
	final int CAPACITY = 100;
	
	Dispenser() {
	}

	boolean addProduct(Product prod) {
		for(int i = 0; i < items.length; i++) {
			products.add(prod);
    	}
		return false;
		
	}
	
	boolean removeProduct(Product prod) {
		for(int i = 0; i < items.length; i++) {
			products.remove(prod);
    	}
		return false;

	}
	//CHANGE PRICE WOULDNT I NEED TO EMPLEMENT double newPrice()?
	public void changePrice(Product prod, double price) {
		
	}
	//ADD ITEMS
	public void addStock(Product prod, int numToAdd) {
	}
	//ITEMS IN AN ARRAY
	public void displayProducts() {
    	for(int i = 0; i < items.length; i++) {
    		products.get(i).toString();
    	}
    	return;
	}
	//ITS SAYING ITS UNDEFINED, DO I ADD IT AS A STRING?
	public int findProduct(Product prod) {
		if (getName().contains(""));
	}

}
