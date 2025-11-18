package module4.time_date.tasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task3 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        while (true) {
            service.execute(() -> {
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                LocalDateTime now = LocalDateTime.now();
                System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            });
        }

    }
}
