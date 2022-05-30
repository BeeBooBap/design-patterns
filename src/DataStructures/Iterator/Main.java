package DataStructures.Iterator;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        IteratorImpl iterator = new IteratorImpl(intArray);

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
    }
}
