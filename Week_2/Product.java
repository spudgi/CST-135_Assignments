package application;

public abstract class Product {

	String name;
	double price;
	int quantity;
	
	Product() {
	}
	
	Product(String name, String type, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	Product(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
		this.quantity = prod.quantity;
	}

	
	//getters and setters
	abstract String getName();
	
	abstract void setName(String name);

	abstract double getPrice();
	
	abstract void setPrice(double price);
	
	abstract int getQuantity();
	
	abstract void setQuantity(int quantity) ;
	
	//toString
	@Override
	public String toString() {
		return this.getClass().getName() + '@' + Integer.toHexString((int) getPrice());
	}
	
	//boolean
	private boolean sellOne(double price) {
		while (this.price != price)
			return false;
		return true;
	}
}
