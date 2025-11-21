package module4.lessons.serialization_deserialization;

import java.io.Serializable;

public class Singleton implements Serializable {
    private volatile static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


    public Object readResolve() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(System.identityHashCode(instance2));
        System.out.println(System.identityHashCode(instance1));
    }
}
