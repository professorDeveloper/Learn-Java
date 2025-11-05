package lessons.oop_learn.polymorphism.overrideing;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(5d);
        circle.area();

        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.area();
    }
}
