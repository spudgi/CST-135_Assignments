package application;

public class Tester {

	public static void main(String[] args) {
		printTest(new Candy());
		printTest(new Chips());
		printTest(new Gum());

	}
	public static void printTest(Product prod) {
		System.out.print(prod.getClass().getName() + ":\n" + prod.toString() + "\n\n");
	}
}
