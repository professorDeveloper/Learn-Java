package module3.lesson.collections.queue;

import java.util.Arrays;

public class SimpleQueue {
    private static int defaultCapacity = 10;
    private Object[] elements;
    private int size = 0;

    public SimpleQueue() {
        this(defaultCapacity);
    }

    public boolean enqueue(Object element) {
        elements[size++] = element;
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public Object dequeue() {
        Object element = elements[0];
        System.arraycopy(elements, 1, elements, 0, size - 1);
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int size() {
        return size;
    }
    public SimpleQueue(int capacity) {
        this.elements = new Object[capacity];
    }

    public static void main(String[] args) {
        var q = new SimpleQueue(10);
        q.enqueue("Hello");
        q.enqueue("World");
        System.out.println(q);
        System.out.println(q.dequeue());
        System.out.println(q);
    }
}
