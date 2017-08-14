package application;

public class Chips extends Snack {

String brand, flavor;
	
	Chips(){
	}

	Chips(String name, double price, int quantity, double height, double weight, double width, String brand, String flavor){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.height = height;
		this.weight = weight;
		this.width = width;
		this.brand = brand;
		this.flavor = flavor;
	}
	
	Chips(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
		this.quantity = prod.quantity;
	}
	
	Chips(Snack snack) {
		this.name = snack.name;
		this.price = snack.price;
		this.quantity = snack.quantity;
		this.height = snack.height;
		this.weight = snack.weight;
		this.width = snack.width;
	}	
	
	Chips(Chips chips) {
		this.name = chips.name;
		this.price = chips.price;
		this.quantity = chips.quantity;
		this.height = chips.height;
		this.weight = chips.weight;
		this.width = chips.width;	
		this.brand = chips.brand;
		this.flavor = chips.flavor;
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
	
	double getHeight() {
		return this.height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	double getWeight() {
		return this.weight;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	double getWidth() {
		return this.width;
	}

	void setWidth(double width) {
		this.width = width;
	}

	String getBrand() {
		return this.brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getFlavor(){
		return this.flavor;
	}
	
	void setFlavor(String flavor){
		this.flavor = flavor;
	}
	
    @Override
    public String toString(){
    	return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nQuantity: " + this.getQuantity() + "\nHeight: " + this.getHeight() + "\nWeight: " + this.getWeight() + "\nWidth: " + this.getWidth() + "\nBrand: " + this.brand + "\nFlavor: " + this.flavor;
    }

}
