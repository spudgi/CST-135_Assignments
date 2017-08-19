//class originally created by Stephan Foster and is his own code. Class updated by Stephan Foster.
package application;

public class Candy extends Snack {

	private String brand, type;
	
	Candy(){
	}

	Candy(String name, double price, int quantity, double height, double weight, double width, String brand, String type){
		super(name,price,quantity,height,weight,width);
		this.brand = brand;
		this.type = type;
	}
	
	Candy(Candy candy) {
		super(candy);
		this.brand = candy.brand;
		this.type = candy.type;
	}
	
	
	String getBrand() {
		return this.brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}
	
	String getType(){
		return this.type;
	}
	
	void setType(String type){
		this.type = type;
	}

    @Override
    public String toString(){
    	return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nQuantity: " + this.getQuantity() + "\nHeight: " + this.getHeight() + "\nWeight: " + this.getWeight() + "\nWidth: " + this.getWidth() + "\nBrand: " + this.brand + "\nType: " + this.type;
    }

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
