package ovningsuppgifter.Week4.Exercise8;

public class Node<T>{
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
