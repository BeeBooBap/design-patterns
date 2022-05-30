package DataStructures.LinkedList;

import java.util.Iterator;

public class ListIterator<T> implements Iterator<T> {

    Node<T> current;

    public ListIterator(List<T> list) {
        current = list.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
