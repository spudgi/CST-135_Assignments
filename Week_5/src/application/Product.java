//class originally created by Stephan Foster and is his own code. Class updated by Caleb Miller.

package application;

public abstract class Product implements Comparable<Product> {

	private String name;
	private double price;
	private int quantity;
	private String image;
	
	Product() {
	}
	
	Product(String name, double price, String image, int quantity) {
		this.name = name;
		this.price = price;
		this.image = "images/" + image;
		this.quantity = quantity;
	}
	
	//Overload
	Product(Product prod) {
		this.name = prod.name;
		this.price = prod.price;
		this.image = prod.image;
		this.quantity = prod.quantity;
	}

	
	//getters and setters
	String getImage() {
		return this.image;
	};
	
	void setImage(String image){
		this.image = image;
	};
	
	String getName() {
		return this.name;
	};
	
	void setName(String name){
		this.name = name;
	};

	double getPrice() {
		return this.price;
	};
	
	void setQuantity(int quantity){
		this.quantity = quantity;
	};
	
	double getQuantity() {
		return this.quantity;
	};
	
	void setPrice(double price){
		this.price = price;
	};
	
	//toString
	@Override
    public String toString(){
    	return "Name: " + this.getName() + "\nImage: " + this.getImage() + "\nPrice: " + this.getPrice() + "\nQuantity: " + this.getQuantity() ;
    }	
	
	//Provided by Lydia Fritz
	@Override
	public boolean equals(Object arg0){
		if(arg0 instanceof Product){
		Product p = (Product)arg0;
			if(p.price == this.price && p.name.equals(this.name)){
			return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
		
	//compareTo()
    //@Override?
	public int compareTo(Product prod) {
		if(prod.equals(this)) {
			return 0;
		}
		else if (prod.name.equals(this.name)) {
			if (prod.price > this.price) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			return prod.name.compareTo(this.name);
		}
	}

	public boolean sellOne() {
		if(this.quantity > 0) {
			this.quantity --;
			return true;
		} 
		return false;
	}
}