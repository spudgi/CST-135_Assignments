//class originally created by Stephan Foster and is his own code. Class updated by Stephan Foster.
package application;

public class Chips extends Snack{

	String brand, flavor;
	
	Chips(){
	}

	Chips(String name, double price, String image, int quantity, double height, double weight, double width, String brand, String flavor){
		super(name,price,image,quantity,height,weight,width);
		this.brand = brand;
		this.flavor = flavor;
	}	
	
	Chips(Chips chips) {
		super(chips);
		this.brand = chips.brand;
		this.flavor = chips.flavor;
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
    	return "Name: " + this.getName() + "\nImage: " + this.getImage() + "\nPrice: " + this.getPrice() +  "\nQuantity: " + this.getQuantity() + "\nHeight: " + this.getHeight() + "\nWeight: " + this.getWeight() + "\nWidth: " + this.getWidth() + "\nBrand: " + this.brand + "\nFlavor: " + this.flavor;
    }

}
