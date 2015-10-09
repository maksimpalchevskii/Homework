package homework.hw2_inheritance_examples;

public class Extension {

	static class Building {

	}

	static class Gym extends Building {

		public void trainBody() {
			System.out.println("training muscles, go hard!");
		}
	}
		static class BoxingHall extends Gym {

			public void fight() {
				System.out.println("get in here and fight!");
			}
		}

		public static void main(String[] args) {
			BoxingHall boxingHall = new BoxingHall();
			boxingHall.trainBody();
			boxingHall.fight();
		}
	}

