package oop_learn.lesson_encapsulation;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Robinson Crusoe");
        System.out.print(book.getTitle());
        book.setTitle("Tom Sawyer");
        System.out.print(book.getTitle());
    }
}
