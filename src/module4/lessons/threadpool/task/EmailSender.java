package module4.lessons.threadpool.task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EmailSender {
    private final ExecutorService service;

    public EmailSender() {
        this.service = Executors.newFixedThreadPool(10);
    }

    public void startAnotherTask(Runnable run) {
        service.execute(run);
    }

    public void send(EmailData data) {
        service.submit(() -> {
            System.out.println("Sending email to: " + data.to());
            System.out.println("Subject: " + data.subject());
            System.out.println("Body: " + data.body());

            try {
                Thread.sleep(1500);
            } catch (Exception ignored) {
            }

            System.out.println("Email sent successfully!\n");
        });
    }

    public void shutdown() {
        try {
            service.shutdown();
            if (service.awaitTermination(1, TimeUnit.SECONDS)) {
                System.out.println("Email Sender shut down successfully");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


