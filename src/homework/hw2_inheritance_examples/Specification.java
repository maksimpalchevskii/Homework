package homework.hw2_inheritance_examples;

public class Specification {

	static abstract class AbstractJob {

		abstract void work();

	}

	static class Developing extends AbstractJob {

		@Override
		void work() {
			System.out.println("Hey buddy, you better write your code right now!");
		}

	}

	public static void main(String[] args) {
		AbstractJob developing = new Developing();
		developing.work();
	}
}