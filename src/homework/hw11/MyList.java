package homework.hw11;

/*public class MyList<T> {
	Node<T> first;
	Node<T> last;

	public void add(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;
		if (first == null) {
			first = node;
		}
		if (last == null) {
			last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	@Override
	public String toString() {
		
		String s = "[";
		
		Node temp = first;
		
		while (temp != null) {
			s += temp.data;
			s += ", ";
			temp = temp.next;
		}
		
		return s + "]";
	}

} */


import java.util.Iterator;

public class MyList<T> implements Iterable<T>{

	Node<T> first;
	Node<T> last;
	int next;
	int maxSize;

	public MyList(int size) {
		maxSize = size;
	}

	public void add(T data) throws MyListExeption {
		if (next == maxSize)
			throw new MyListExeption("Size overflow: " + next);
		if(first == null) {
			Node<T> node = new Node<T>();
			node.data = data;
			first = node;
			last = first;
		} else {
			Node<T> node = new Node<T>();
			node.data = data;
			last.next = node;
			last = last.next;
		}
		++next;
	}

	@Override
	public String toString() {

		String s = "[";

		Node<T> temp = first;

		while (temp != null) {
			s += temp.data;
			s += ", ";
			temp = temp.next;
		}

		return s + "]";
	}

	class MyIterator implements Iterator<T> {


		Node<T> current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			T data = (T) current.data;
			current = current.next;
			return data;
		}

		@Override
		public void remove() {
		}

	}

	@Override
	public Iterator<T> iterator() {
		return new MyIterator();

	}
}