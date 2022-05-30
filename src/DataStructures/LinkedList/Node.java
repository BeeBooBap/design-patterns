package DataStructures.LinkedList;

public class Node<T> {
    public T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }

    public T getData(){
        return this.data;
    }

    public Node<T> getNext() {
        return this.next;
    }
}
