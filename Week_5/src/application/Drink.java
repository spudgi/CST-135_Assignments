//class originally created by Alexander Verdi and is his own code. Class updated by Stephan Foster.
package application;

public class Drink extends Product {

	String brand;
	String flavor;
	
	Drink() {
	}
	
	Drink(String name, double price, String image, int quantity, String brand, String flavor) {
		super(name,price,image, quantity);
		this.brand = brand;
		this.flavor = flavor;
	}
	
	Drink(Drink drink) {
		super(drink);
		this.brand = drink.brand;
		this.flavor = drink.flavor;
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
    	return "Name: " + this.getName() + "\nImage: " + this.getImage() + "\nPrice: " + this.getPrice() + "\nQuantity: " + this.getQuantity() + "\nBrand: " + this.getBrand() + "\nFlavor: " + this.getFlavor();
    	
    }

}