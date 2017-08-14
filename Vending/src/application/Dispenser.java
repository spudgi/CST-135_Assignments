package application;

import java.util.ArrayList;
import java.util.List;

public class Dispenser {
	
	private ArrayList<Product> products;

	Product[] items;
	int numItems = 0;
	final int CAPACITY = 100;
	
	Dispenser() {
	}

	//ADD PRODUCT
	boolean addProduct(Product prod) {
		for(int i = 0; i < items.length; i++) {
			((List<Product>) prod).add(prod);
    	}
		return false;
		
	}
	
	//REMOVE PRODUCT
	boolean removeProduct(Product prod) {
		for(int i = 0; i < items.length; i++) {
			((List<Product>) prod).remove(prod);
    	}
		return false;

	}
	
	//CHANGE PRICE 
	public void changePrice(Product prod, double price) {
			prod.price = price;
	}
	
	//ADD ITEMS
	public void addStock(Product prod, int numToAdd) {
		for(int i = 0; i < items.length; i++) {
			((List<Product>) prod).add(numToAdd, prod);
    	}
		return;
	}

	//ITEMS IN AN ARRAY
	public void displayProducts(Product prod) {
    	for(int i = 0; i < items.length; i++) {
    		((List<Product>) prod).get(i).toString();
    	}
    	return;
	}
	
	//FIND PRODUCTS
	public int findProduct(Product prod) {
		if (prod.getName().contains(""));
		return CAPACITY;
	}
	
	//toString()
    public String toString(){
    	return "Name: " + products.getClass().getName() + ":\n" + products.toString() + "\n\n";
    	
    }

}
