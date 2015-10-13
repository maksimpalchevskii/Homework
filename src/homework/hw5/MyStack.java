package homework.hw5;

/**
 * Created by Maksim_Palchevskii on 10/13/2015.
 */
public class MyStack<T> {

    class Node {
        T data;
        Node next;
    }

    Node top;

    public void add(T data) {
        Node node = new Node();
        node.data = data;
        node.next = top;
        top = node;
    }

    public T get() {
        Node node = top;
        top = node.next;
        return node.data;
    }

    @Override
    public String toString() {

        String s = "[";

        Node current = top;

        while (current != null) {
            s += current.data + " ";
            current = current.next;
        }

        return s + "]";
    }
}
