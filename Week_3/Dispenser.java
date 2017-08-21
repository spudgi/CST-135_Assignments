//class created by Caleb Miller and is his own code.
package application;

import java.util.ArrayList;

public class Dispenser {
	
	private ArrayList<Product> products = new ArrayList<Product>();
	final int CAPACITY = 15;
	// fix sized array
	
	
	Dispenser() {
		this.addProduct(new Candy("Snickers", 1.75, 1, .6, 1.00, 1.00, "Mars", "chocolate bar"));
		this.addProduct(new Candy("Twix", 1.75, 1, .6, 1.00, 1.00, "Mars", "chocolate bar"));
		this.addProduct(new Candy("Almond Joy", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar"));
		this.addProduct(new Candy("Almond Joy", 1.50, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar"));
		this.addProduct(new Candy("Butter Finger", 1.75, 1, .6, 1.00, 1.00, "Nestle", "chocolate bar"));
		this.addProduct(new Candy("Kitkat", 1.75, 1, .6, 1.00, 1.00, "Nestle", "chocolate bar"));
		this.addProduct(new Chips("Wavy Lay's", .75, 1, 1.23, .98, 1.45, "Frito-Lay", "Sour Cream and Onion"));
		this.addProduct(new Chips("Cheetos", .75, 1, 1.23, .98, 1.45, "Frito-Lay", "Flamin' Hot"));
		this.addProduct(new Drink("Coke", 1.75, 1, "Coca-cola", "Classic"));
		this.addProduct(new Drink("Dr. Pepper", 1.75, 1, "Coca-cola", "Classic"));
		this.addProduct(new Gum("Juicy Fruit", .89, 1, .55, .75, .98, "Wriggly's", "fruit", 16));
	}

	//ADD PRODUCT
	boolean addProduct(Product prod) {
		if(products.size() < CAPACITY && findProduct(prod) == -1) {
			products.add(prod);
			this.bubbleSort(this.products);
			return true;			
		}
		return false;	
	}
	
	//REMOVE PRODUCT
	//rewrite to find product in array and pop it out
	boolean removeProduct(Product prod) {
		if(findProduct(prod) != -1) {
			products.remove(prod);
			return true;
		}
			return false;
		}
	
	//CHANGE PRICE 
	//find product in array and update price
	
	public void changePrice(Product prod, double price) {
			int x = findProduct(prod);
			products.get(x).setPrice(price);
	}

	//add stock back in  find item and update quantity

	//ITEMS IN AN ARRAY
	public void displayProducts(){
    	for(int i = 0; i < products.size(); i++) {
    		System.out.println(products.get(i).toString() + "\n");
    	}
	}
	
	//find product looks for product in array and returns index
	public int findProduct(Product prod){
		for(int h = 0; h < products.size(); h++){
			if(products.get(h).getName() == prod.getName() && products.get(h).getPrice() == prod.getPrice()){
				return h;
			}
		}
		return -1;
	}
	
	//bubbleSort Had to call upon Stephan for a little help, 
	
	//for (int h = 0; h < products.size() && needNextPass; h++) {
	//needNextPass = false;
	//for (int i = 0; i < products.size(); i++) {
	//if (list[i] > list[i + 1]) {
	// Swap list[i] with list[i + 1]
	//int temp = list[i];
	//list[i] = list[i + 1];
	//list[i + 1] = temp;
	//needNextPass = true;
	
	public static void bubbleSort(ArrayList<Product> products) {
		for (int i = 0; i < products.size(); i++) {
			for (int h = 0; h <= i; h++) {
				if(products.get(h).getName().compareTo(products.get(i).getName()) > 0) {
					Product type = products.get(i);
					Product type1 = products.get(h);
					products.set(i, type1);
					products.set(h, type);
				}
			}
		}
	}
	
	//toString()
    public String toString(){
    	return "Number of Items: " + this.products.size() + "\nTotal Capacity: " + this.CAPACITY;
    	
    }

}
