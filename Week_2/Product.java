package application;

public class Product {

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
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
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
