package module4.lessons.threads.race_with_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class ThreadSafeCollection {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list = new ArrayList<>();
        var safedList = Collections.synchronizedList(list);
        Runnable r1 = () -> {
            for (int i = 0; i < 100; i++) {
                try {
                    TimeUnit.MILLISECONDS.sleep(5);
                    safedList.add("Name " + i);
                    System.out.println(Thread.currentThread().getName() + " -> " + safedList.size());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 100; i++) {
                try {
                    TimeUnit.MILLISECONDS.sleep(5);
                    safedList.remove("Name " + i);
                    System.out.println(Thread.currentThread().getName() + " -> " + safedList.size());

                } catch (Exception ignored) {

                }
            }
        };
        Thread t1 = new Thread(r1, "Thread1");
        Thread t2 = new Thread(r2, "Thread2");
        t1.start();
        t2.start();
        TimeUnit.SECONDS.sleep(2);
        System.out.println(safedList.size());
    }
}
