package lessons.oop_learn;

public class PlayWithObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Robinson Crusoe";
        book.author = "Daniel Defoe";
        book.pages = 400;
        book.printInfo();
    }
}

class Book {
    public String title;
    public String author;
    public int pages;

    public void printInfo() {
        System.out.printf("Title: %s\nAuthor: %s\nPages: %d\n", title, author, pages);
    }
}
