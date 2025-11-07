package module_1_2.lessons.oop_learn.abstraction.lesson;

public class Rectangle  extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return 0;
    }
}
