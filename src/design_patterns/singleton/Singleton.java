package design_patterns.singleton;

public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return new Singleton();
    }
}
