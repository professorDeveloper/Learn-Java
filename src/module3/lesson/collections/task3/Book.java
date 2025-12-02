package module3.lesson.collections.task3;

import java.util.ArrayList;
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
}

class Task3 {
    public static void main(String[] args) {
        ArrayList<Book> list1 = new ArrayList<>();
        ArrayList<Book> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(new Book("Book" + i, "Author" + i, i, i));
        }
        for (int i = 0; i < 5; i++) {
            list2.add(list1.get(new Random().nextInt(list1.size())));
        }
        System.out.println(list1);
        System.out.println(list2);
        list1.removeAll(list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}