package application;

public class Candy extends Snack{

String brand, type;
	
	Candy(){
	}

	Candy(String name, double price, int quantity, double height, double weight, double width, String brand, String type){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.height = height;
		this.weight = weight;
		this.width = width;
		this.brand = brand;
		this.type = type;
	}
	
	Candy(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
		this.quantity = prod.quantity;
	}
	
	Candy(Snack snack) {
		this.name = snack.name;
		this.price = snack.price;
		this.quantity = snack.quantity;
		this.height = snack.height;
		this.weight = snack.weight;
		this.width = snack.width;
	}	
	
	Candy(Candy candy) {
		this.name = candy.name;
		this.price = candy.price;
		this.quantity = candy.quantity;
		this.height = candy.height;
		this.weight = candy.weight;
		this.width = candy.width;	
		this.brand = candy.brand;
		this.type = candy.type;
	}
	
	
	String getBrand() {
		return this.brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}
	
	double getHeight() {
		return this.height;
	}

	void setHeight(double height) {
		this.height = height;
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
	
	String getType(){
		return this.type;
	}
	
	void setType(String type){
		this.type = type;
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

    @Override
    public String toString(){
    	return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nQuantity: " + this.getQuantity() + "\nHeight: " + this.getHeight() + "\nWeight: " + this.getWeight() + "\nWidth: " + this.getWidth() + "\nBrand: " + this.brand + "\nType: " + this.type;
    }

}
