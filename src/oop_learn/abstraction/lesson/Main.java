package oop_learn.abstraction.lesson;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(5.0, 6.0);
//        Shape shape =new Shape();
        System.out.println(circle.square());
        System.out.println(rectangle.square());

    }
}
