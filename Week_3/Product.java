//class created by Caleb Miller and is his own code.

package application;

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
    public String toString(){
    	return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nQuantity: " + this.getQuantity() ;
    }	
	
		
	//compareTo()
    //@Override
	public int compareTo(Product prod) {
		if(prod.equals(this)) {
			return 0;
		}
		else if (prod.name.equals(this.name)) {
			if (prod.price > this.price) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			return prod.name.compareTo(this.name);
		}
	}

	public boolean sellOne() {
		if(this.quantity > 0) {
			this.quantity --;
			return true;
		} 
		return false;
	}
}
