//class originally created by Stephan Foster and is his own code. Class updated by Stephan Foster.

package application;

public class Gum extends Snack{

	private String brand, flavor;
	private int pieces;
	
	Gum(){
	}

	Gum(String name, double price, int quantity, double height, double weight, double width, String brand, String flavor, int pieces){
		super(name,price,quantity,height,weight,width);
		this.brand = brand;
		this.flavor = flavor;
		this.pieces = pieces;
	}
	
	
	Gum(Gum gum) {
		super(gum);
		this.brand = gum.brand;
		this.flavor = gum.flavor;
		this.pieces = gum.pieces;
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

	int getPieces(){
		return this.pieces;
	}
	
	void setPieces(int pieces){
		this.pieces = pieces;
	}
	
    @Override
    public String toString(){
    	return "Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nHeight: " + this.getHeight() + "\nQuantity: " + this.getQuantity() + "\nWeight: " + this.getWeight() + "\nWidth: " + this.getWidth() + "\nBrand: " + this.brand + "\nFlavor: " + this.flavor + "\nPieces: " + this.pieces;
    }

}
