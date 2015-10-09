package homework.hw2_inheritance_examples;

public class Specialization {

	static class Notebook {

		public void print() {
			System.out.println("Printing " + getClass().getSimpleName());
		}
	}

	static class Paper extends Notebook {

		@Override
		public void print() {
			System.out.println("Writing " + getClass().getSimpleName());
			super.print();
		}
	}

	static class Picture extends Notebook {

		@Override
		public void print() {
			System.out.println("Drawing " + getClass().getSimpleName());
			super.print();
		}
	}

	public static void main(String[] args) {
		Notebook paper = new Paper();
		paper.print();
		Notebook picture = new Picture();
		picture.print();
	}
}
