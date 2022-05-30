package DataStructures.Stack;

import java.util.ArrayList;

public class OtherStackImplementation<T> implements Stack<T> {

    private ArrayList<T> t;

    public OtherStackImplementation(ArrayList<T> t) {
        this.t = t;
    }

    @Override
    public boolean isEmpty() {
        return t.size() == 0;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return t.get(0);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        var top = peek();
        t.remove(0);
        return top;
    }

    @Override
    public void push(T item) {
        t.add(0, item);
    }
}
