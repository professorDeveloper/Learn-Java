package module3.lesson.collections.generics.task3;

import java.util.Arrays;

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


    public static void main(String[] args) {
        //buuble sort
        int[] list =new int[]{6,2,9,11};
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    list[i]=list[i] - list[j];
                    list[i] =list[i] + list[j];
                    list[i] = list[i] - list[j];
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }

    private static void fillArray(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ++count;
            }
        }
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

