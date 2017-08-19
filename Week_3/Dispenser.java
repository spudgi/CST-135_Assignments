//class originally created by Caleb Miller and is his own code. Class updated by Stephan Foster.
package application;

import java.util.ArrayList;

public class Dispenser {
	
	public ArrayList<Product> products = new ArrayList<Product>();
	final int CAPACITY = 15;
	// fix sized array
	
	
	Dispenser() {
		products.add(new Candy("Kitkat", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar"));
		products.add(new Chips("Wavy Lay's", .75, 1, 1.23, .98, 1.45, "Lay's", "Sour Cream and Onion"));
		products.add(new Drink("Coke", 1.75, 1, "Coca-cola", "Classic"));
		products.add(new Gum("Juicy Fruit", .89, 1, .55, .75, .98, "Wriggly's", "fruit", 16));
	}

	//ADD PRODUCT
	boolean addProduct(Product prod) {
		if(products.size() < CAPACITY && findProduct(prod) == -1) {
			products.add(prod);
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
    		System.out.println(products.get(i).toString());
    	}
	}
	
	//find product looks for product in array and returns index
	public int findProduct(Product prod){
		for(int x = 0; x < products.size(); x++){
			if(products.get(x).getName() == prod.getName() && products.get(x).getPrice() == prod.getPrice()){
				return x;
			}
		}
		return -1;
	}
	
	//toString()
    public String toString(){
    	return "Number of Items: " + this.products.size() + "\nTotal Capacity: " + this.CAPACITY;
    	
    }

}
