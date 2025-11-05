package lessons.oop_learn.polymorphism.overrideing;

public class Rectangle extends Shape {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void area() {
        System.out.printf("Rectangle area: %d", a * b);
    }
}
