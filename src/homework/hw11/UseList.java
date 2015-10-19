package homework.hw11;

public class UseList {

	public static void main(String[] args) {
	
		MyList<String> list = new MyList<>(3);
		try {
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four"); // ERROR and should return overflow exception
		} catch (MyListExeption e) {
			System.out.println(e.getMessage());
		}
			System.out.println(list);
		}
	
}
