package homework.hw5;

/**
 * Created by Maksim_Palchevskii on 10/13/2015.
 */
public class UseStack {

    public static void main(String[] args) {

        MyStack<String> stack = new MyStack<>();

        stack.add("1");
        stack.add("2");
        stack.add("3");
        stack.add("4");

        System.out.println(stack);
        System.out.println(stack.get() + " element");
        System.out.println(stack);
        System.out.println(stack.get() + " element");
        System.out.println(stack);
        System.out.println(stack.get() + " element");
        System.out.println(stack);
        System.out.println(stack.get() + " element");
        System.out.println(stack);
    }
}