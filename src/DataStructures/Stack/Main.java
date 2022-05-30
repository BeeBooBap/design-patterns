package DataStructures.Stack;

public class Main {
    public static void main(String[] args) {
        StackFactory<Integer> stackFactory = new StackFactory<Integer>();
        Stack<Integer> stack = stackFactory.factoryMethod("Other"); // allowing for dynamically changing implementation at runtime

        System.out.println(stack.peek());
        stack.push(1);
        System.out.println(stack.peek());
        stack.push(2);
        System.out.println(stack.peek());
        stack.push(3);
        System.out.println(stack.peek());

        System.out.println("Item removed: " + stack.pop());
        System.out.println("Item removed: " + stack.pop());
        stack.push(4);
        System.out.println(stack.peek());

    }
}
