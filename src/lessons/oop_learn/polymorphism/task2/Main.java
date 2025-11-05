package lessons.oop_learn.polymorphism.task2;

public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        System.out.println(myMath.sum(1, 2));
        System.out.println(myMath.sum("1", 2));
        System.out.println(myMath.sum("22", "33"));
    }
}
