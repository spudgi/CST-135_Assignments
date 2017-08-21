//class created by Caleb Miller and is his own code.

package application;

//THIS CLASS SHOULD IMPLEMENT THE COMPARABLE INTERFACE

//public abstract class Product implements Comparable<Product>

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
	
	//Provided by Lydia Fritz
	@Override
	public boolean equals(Object arg0){
		if(arg0 instanceof Product){
		Product p = (Product)arg0;
			if(p.price == this.price && p.name.equals(this.name)){
			return true;
			}
		else {
			return false;
			}
		}
		else {
			return false;
		}
	}
		
	
//THE OVERRIDE NOTATION WOULD SHOW UP IF THE IMPLEMENTS COMPARABLE WAS
	//PART OF THE CLASS DECLARATION.
	
	//compareTo()
    //@Override?
	public int compareTo(Product prod) {
		//NICE!
		if(prod.equals(this)) {
			return 0;
		}
		//WELL DONE - LOGIC SEEMS TO HOLD UP HERE.
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
