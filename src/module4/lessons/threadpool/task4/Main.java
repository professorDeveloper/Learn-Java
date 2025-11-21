package module4.lessons.threadpool.task4;

public class Main {
    public static void main(String[] args) {

        EmailService service = new EmailService();
        String response = service.sendMessageEmail("azamov@gmail.com","hello PDP");
        System.out.println("Service Response: " + response);

        service.sendNotification( "pdp@example.com");
    }
}
