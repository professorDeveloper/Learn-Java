package lessons.oop_learn.interface_lesson.lesson1;

public class Rectangle implements Shape {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return a * b;
    }
}
