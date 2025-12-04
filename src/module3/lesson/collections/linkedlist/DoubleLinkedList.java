package module3.lesson.collections.linkedlist;

public class DoubleLinkedList<E> {
    private Node<E> tail;
    private int size;

    public boolean add(E element) {
        var l = tail;
        var newNode = new Node<>(element);
        tail = newNode;
        if (l == null) {
            newNode.prev = null;
        } else {
            l.next = newNode;
            newNode.prev = l;
        }
        return false;
    }


    private static class Node<E> {
        Node<E> prev;
        Node<E> next;
        E element;

        public Node(Node<E> prev, Node<E> next, E element) {
            this.prev = prev;
            this.next = next;
            this.element = element;
        }

        public Node(E element) {
            this.element = element;
        }
    }
}
