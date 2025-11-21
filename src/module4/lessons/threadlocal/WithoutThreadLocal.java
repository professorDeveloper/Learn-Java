package module4.lessons.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WithoutThreadLocal {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int i = 0; i < 1000; i++) {
            service.execute(() -> {
                a(new Date());
            });
        }
    }

    private static void a(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Thread: " + Thread.currentThread().getName() + " Date: " + simpleDateFormat.format(date));
    }
}
