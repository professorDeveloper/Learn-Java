package module3.lesson.linkedlist;

import java.util.StringJoiner;

public class SingleLinkedList<E> {
    private Node<E> head;
    private int size;

    public boolean add(E element) {
        var newNode = new Node<>(element);
        if (this.head == null) {
            this.head = newNode;
        } else {
            var current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;

        }
        size++;
        return true;

    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }

    }

    @Override
    public String toString() {
        var current = this.head;
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        while (current != null) {
            sj.add(String.valueOf(current.element));
            current = current.next;
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        SingleLinkedList<String> stringSingleLinkedList = new SingleLinkedList<>();
        stringSingleLinkedList.add("Java");
        stringSingleLinkedList.add("Scala");
        System.out.println(stringSingleLinkedList);
    }
}


