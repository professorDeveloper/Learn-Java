package module4.threadpool.task4;

import java.util.concurrent.Callable;

public class EmailService {
    private final TaskExecutor executor = new TaskExecutor();

    public String sendMessageEmail(String email, String message) {

        Callable<String> task = () -> {
            Thread.sleep(1500);
            return message + " to : " + email;
        };

        return executor.executeTask(task);
    }

    public void sendNotification(String email) {

        Callable<String> t1 = () -> {
            Thread.sleep(700);
            return "Notification sent to: " + email;
        };

        System.out.println(executor.executeTask(t1));
    }
}
