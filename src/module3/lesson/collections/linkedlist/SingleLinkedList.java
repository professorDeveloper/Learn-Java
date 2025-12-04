package module3.lesson.collections.linkedlist;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringJoiner;

public class SingleLinkedList<E>  implements Iterable<E> {
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

    @NotNull
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E element =current.element;
                current =current.next;
                return element;
            }
        };
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }

    }

    public E get(int index) {
        Objects.checkIndex(index, size);
        if (index == 0) {
            return this.head.element;
        } else {
            var current = this.head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.element;
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

    public int size() {
        return this.size;

    }

    public boolean remove(Object o) {
        if (this.head == null) return false;
        Node<E> prev = null;
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(o)) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    public E remove(int index) {
        Objects.checkIndex(index, size);
        if (index == 0) {
            return removeFromBeginning();
        }
        var current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        var element = current.next.element;
        current.next = current.next.next;
        size--;
        return element;
    }

    public void set(int index, E element) {
        Objects.checkIndex(index, size);
        var current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.element = element;
    }

    public E removeFromBeginning() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        var element = head.element;
        head = head.next;
        size--;
        return element;
    }

    public boolean addAtBeginning(E element) {
        var newNode = new Node<>(element);
        newNode.next = this.head;
        this.head = newNode;
        size++;
        return true;
    }

    public static void main(String[] args) {
        SingleLinkedList<String> stringSingleLinkedList = new SingleLinkedList<>();
        stringSingleLinkedList.add("Java");
        stringSingleLinkedList.add("Scala");
        System.out.println(stringSingleLinkedList);
        System.out.println(stringSingleLinkedList.size());
        System.out.println(stringSingleLinkedList.get(1));
        System.out.println(stringSingleLinkedList.addAtBeginning("Hello"));
        System.out.println(stringSingleLinkedList);
    }
}


