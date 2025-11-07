package module_1_2.lessons.oop_learn.interface_lesson.lesson1;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }
}
