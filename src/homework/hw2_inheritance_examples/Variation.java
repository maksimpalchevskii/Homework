package homework.hw2_inheritance_examples;

public class Variation {

	static class AutoDealer {

		public void buyCar(String color) {
			System.out.println("Car color " + color);
		}

	}

	static class MultipleModelsCarDealer extends AutoDealer {

		public void buyCar(String model, String color) {
			System.out.println("Car model " + model);
			buyCar(color);
		}

	}

	public static void main (String[] args) {
		MultipleModelsCarDealer dealer = new MultipleModelsCarDealer();
		dealer.buyCar("Lexus", "Red");
	}
}
