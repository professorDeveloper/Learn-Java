package polymorphism.overloading;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, double b) {
        return a + (int) b;
    }
}
