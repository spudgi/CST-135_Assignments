//class originally created by Caleb Miller and is his own code. Class updated by Stephan Foster.

package application;

import java.util.ArrayList;

public abstract class Product {

	private String name;
	private double price;
	private int quantity;
	
	Product() {
	}
	
	Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Overload
	Product(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
		this.quantity = prod.quantity;
	}

	
	//getters and setters
	String getName() {
		return this.name;
	};
	
	void setName(String name){
		this.name = name;
	};

	double getPrice() {
		return this.price;
	};
	
	void setQuantity(int quantity){
		this.quantity = quantity;
	};
	
	double getQuantity() {
		return this.quantity;
	};
	
	void setPrice(double price){
		this.price = price;
	};
	
	//toString
	@Override
    public String toString(){
    	return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nQuantity: " + this.getQuantity() ;
    }
	
	public void bubbleSort(ArrayList<Product> products) {
		for (int x = 0; x < products.size(); x++) {
			for (int y = 0; y <= x; y++){
				if(products.get(y).getName().compareTo(products.get(x).getName()) > 0) {
					Product temp1 = products.get(x);
					Product temp2 = products.get(y);
					products.set(x, temp2);
					products.set(y,temp1);
				}
			}
		}
		for(int x = 0; x < products.size(); x++){
			System.out.println(products.get(x).getName());
		}
	}
	
	public int compareTo(String prod) {
		if(this.name.charAt(0) == name.charAt(0))
			return 0;
		else if (this.name.charAt(0) < name.charAt(0))
			return 1;
		else
			return -1;
	}

	public boolean sellOne() {
		if(this.quantity > 0) {
			this.quantity --;
			return true;
		} 
		return false;
	}
}
