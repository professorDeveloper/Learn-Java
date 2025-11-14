package module4.threadpool.task;

public class Main {
    public static void main(String[] args) {
        EmailData data = new EmailData("admin@pdp.uz", "Hello PDP", "i am student PDP university");
        EmailSender senderExecutor = new EmailSender();
        senderExecutor.startAnotherTask(() -> {
            try {
                System.out.println("EmailSender started..");
                Thread.sleep(1000);
                senderExecutor.send(data);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        senderExecutor.shutdown();
    }
}
