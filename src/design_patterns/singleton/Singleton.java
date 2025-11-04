package design_patterns.singleton;

public class Singleton {
    //    private static Singleton instance = new Singleton(); eager initialization
    private static Singleton instance = null; // lazy initialization

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance; //lazy initialization
    }
}
