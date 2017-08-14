package application;

public abstract class Drink extends Product {

	String brand;
	String flavor;
	
	Drink() {
	}
	
	Drink(String name, double price, int quantity, String brand, String flavor) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.flavor = flavor;
	}
	
	Drink(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
		this.quantity = prod.quantity;
	}
	
	Drink(Drink drink) {
		this.name = drink.name;
		this.price = drink.price;
		this.quantity = drink.quantity;
		this.brand = drink.brand;
		this.flavor = drink.flavor;
	}

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getPrice() {
		return this.price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	int getQuantity() {
		return this.quantity;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String Brand) {
		this.brand = Brand;
	}
	
	public String getFlavor() {
		return this.flavor;
	}
	
	public void setFlavor(String Flavor) {
		this.flavor = Flavor;
	}

	@Override
    public String toString(){
    	return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nQuantity: " + this.getQuantity() + "\nBrand: " + this.getBrand() + "\nFlavor: " + this.getFlavor();
    	
    }

}