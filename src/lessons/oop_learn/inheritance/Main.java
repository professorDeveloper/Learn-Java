package lessons.oop_learn.inheritance;

public class Main {
    public static void main(String[] args) {
        Iphone13 iphone13 = new Iphone13("Iphone 13", "Air", "Black", 10, "26", 16, 128);
        Samsung samsung = new Samsung("Samsung", "S10", "Black", 10);

        System.out.printf("Iphone 13: %s\n", iphone13.toString());
        System.out.printf("Samsung: %s\n", samsung.toString());


    }
}
