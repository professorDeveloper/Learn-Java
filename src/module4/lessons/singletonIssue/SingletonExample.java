package module4.lessons.singletonIssue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 1500; i++) {
            service.execute(()-> System.out.println(System.identityHashCode(Singleton.getInstance())));
        }
    }
}
