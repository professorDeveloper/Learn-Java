package module_1_2.lessons.oop_learn.polymorphism.task2;

public class MyMath {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(String a, int b) {
        return Integer.parseInt(a) + b;
    }

    public int sum(String a, double b) {
        return (int) (Integer.parseInt(a) + b);
    }

    public int sum(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public int sum(double a, double b) {
        return (int) (a + b);
    }

    public int sum(double a, int b) {
        return (int) (a + b);
    }

}
