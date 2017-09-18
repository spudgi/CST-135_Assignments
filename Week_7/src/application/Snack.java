//class originally created by Stephan Foster and is his own code. Class updated by Stephan Foster.
package application;

public abstract class Snack extends Product{
	private double height, weight, width;
	
	Snack(){
	}

	Snack(String name, double price, String image, int quantity, double height, double weight, double width){
		super(name,price,image, quantity);
		this.height = height;
		this.weight = weight;
		this.width = width;
	}
	
	Snack(Snack snack) {
		super(snack);
		this.height = snack.height;
		this.weight = snack.weight;
		this.width = snack.width;
	}
	
	double getHeight(){
		return this.height;
	}
	
	void setHeight(double height){
		this.height = height;
	}

	double getWeight(){
		return this.weight;
	}
	
	void setWeight(double weight){
		this.weight = weight;
	}
	
	double getWidth(){
		return this.width;
	}
	
	void setWidth(double width){
		this.width = width;
	}
		
    @Override
    public String toString(){
    	return "Name: " + this.getName() + "\nImage: " + this.getImage() + "\nPrice: " + this.getPrice() + "\nQuantity: " + this.getQuantity() + "\nHeight: " + this.getHeight() + "\nWeight: " + this.getWeight() + "\nWidth: " + this.getWidth();
    }
}
