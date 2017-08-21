//class created by Caleb Miller and is his own code.

package application;

public abstract class Main {

	public static void main(String[] args) {
		Dispenser testDispenser = new Dispenser();
		testDispenser.displayProducts();
		//display the Dispenser toString()
		System.out.println(testDispenser.toString());
		//added test products
		Candy testProd1 = new Candy("Snickers", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar");
		Candy testProd2 = new Candy("Twix", 1.75, 1, .6, 1.00, 1.00, "Mars", "chocolate bar");
		Candy testProd3 = new Candy("Almond Joy", 1.75, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar");
		Candy testProd4 = new Candy("Almond Joy", 1.50, 1, .6, 1.00, 1.00, "Hersey's", "chocolate bar");
		Candy testProd5 = new Candy("Butter Finger", 1.75, 1, .6, 1.00, 1.00, "Nestle", "chocolate bar");
		//tester of compareTo()
		printTest("\n" + testProd1.compareTo(testProd2) + "\n");
		printTest(testProd2.compareTo(testProd3) + "\n");
		printTest(testProd2.compareTo(testProd4) + "\n");
		printTest(testProd4.compareTo(testProd5) + "\n");
	}

	public static void printTest(String t){
		System.out.println(t);
	}
}
