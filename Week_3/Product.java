//class originally created by Caleb Miller and is his own code. Class updated by Stephan Foster.

package application;

public abstract class Product implements Comparable<Product> {

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
		this.price = price;
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
	
	public void bubbleSort(String[] name) {
		boolean needNextPass = true;
		for (int k = 1; k < name.length && needNextPass; k++) {
			needNextPass = false;
			for (int i = 0; i < name.length - k; i++) {
				if (i > compareTo(name[i + 1])) {
					String temp = name[i];
					name[i] = name[i + 1];
					name[i + 1] = temp;
					needNextPass = true;
				}
			}
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
