package homework.hw2_inheritance_examples;

public class Construction {
	
	static class Freezer {

		int beer;

		public Freezer() {
			beer = 0;
		}

		public void buyBeer() {
			beer++;
		}

		public void checkBeer() {
			System.out.println("Number of beer bottles = " + beer);
		}
	}
	
	public static void main(String[] args) {
		Freezer freezer = new Freezer();
		for (int i = 0; i < 5; i++) freezer.buyBeer();
		freezer.checkBeer();
	}
}
