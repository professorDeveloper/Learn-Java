package module3.lesson.collections.linkedlist.task2;

import java.util.LinkedList;
import java.util.Random;

public class Book {
    String name;
    String author;
    int pageCount;
    int price;

    public Book(String name, String author, int pageCount, int price) {
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + author + " (" + pageCount + " pages, $" + price + ")";
    }
}

class Task3 {
    public static void main(String[] args) {

        LinkedList<Book> list1 = new LinkedList<>();
        LinkedList<Book> list2 = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(new Book("Book" + i, "Author" + i, i, i));
        }

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            list2.add(list1.get(random.nextInt(list1.size())));
        }

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        list1.removeAll(list2);

        System.out.println("List1 after removeAll(list2): " + list1);
        System.out.println("List2 stays the same: " + list2);
    }
}
