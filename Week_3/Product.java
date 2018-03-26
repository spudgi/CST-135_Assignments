//class created by Caleb Miller and is his own code.

package application;
//THIS CLASS NEEDS TO IMPLEMENT THE COMPARABLE INTERFACE...

//public abstract class Product implements Comparable<Product> {


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
	
	
	//SO, THIS WOULD SHOW UP AS AN OVERRIDE IF THE CLASS IMPLEMENTED THE COMPARABLE INTERFACE...
	//TRY IT AND SEE.
	
	//compareTo()
    //@Override?
	//ALSO, THIS CODE LOOKS IDENTICAL TO CALEB'S - I NOTICE THAT BECAUSE THE 
	//METHOD YOU'VE CHOSEN HERE IS UNIQUE IN THAT IT UTILIZES THE .EQUALS METHOD
	
	//I DON'T MIND IF YOU COLLABORATE, BUT EACH OF YOU SHOULD CODE YOUR OWN SOLUTION
	
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
