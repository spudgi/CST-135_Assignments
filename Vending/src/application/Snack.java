package application;

public abstract class Snack extends Product {
	
double height, weight, width;
	
	Snack(){
	}

	Snack(String name, double price, int quantity, double height, double weight, double width){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.height = height;
		this.weight = weight;
		this.width = width;
	}
	
	Snack(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
		this.quantity = prod.quantity;
	}
	
	Snack(Snack snack) {
		this.name = snack.name;
		this.price = snack.price;
		this.quantity = snack.quantity;
		this.height = snack.height;
		this.weight = snack.weight;
		this.width = snack.width;
	}
	
	abstract double getHeight();
	
	abstract void setHeight(double height);

	abstract double getWeight();
	
	abstract void setWeight(double weight);
	
	abstract double getWidth();
	
	abstract void setWidth(double width);
		
    @Override
    public String toString(){
    	return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nQuantity: " + this.getQuantity() + "\nHeight: " + this.getHeight() + "\nWeight: " + this.getWeight() + "\nWidth: " + this.getWidth();
    }
}

