package module_1_2.lessons.oop_learn.interface_lesson.lesson1;

public class Test {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.0, 6.0);
        Shape circle = new Circle(5.0);
        System.out.println(rectangle.square());
        System.out.println(circle.square());
    }
}
