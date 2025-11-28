package module3.lesson.generics.task3;

public class CustomList<E> {
    private Object[] elementData;
    private int size;
    private int index;

    public CustomList() {
        this.elementData = new Object[10];
        this.size = 10;
    }

    public void add(E e) {
        if (index == size) {
            Object[] newElementData = new Object[elementData.length * 2];
            System.arraycopy(elementData, 0, newElementData, 0, elementData.length);
            elementData = newElementData;
            size *= 2;
        }
        elementData[index++] = e;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public void clear() {
        index = 0;
        size = 10;
        elementData = new Object[10];
    }

    public int getSize() {
        return index;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elementData[index];
    }
}
