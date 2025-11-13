package module4.threadpool;

import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {
        registerNewUser();
    }

    private static void registerNewUser() {
        saveUserToDatabase();
        generateTemplate();
        sentMail();
        System.out.println("...........................");
    }

    public static void saveUserToDatabase(/*user data input*/) {
        Runnable r = () -> {
            try {
                System.out.println("Saving data to database...");
                TimeUnit.MILLISECONDS.sleep(1200);
                System.out.println("Data saved");
            } catch (Exception ignored) {

            }
        };

        new Thread(r).start();
    }

    public static void generateTemplate(/*user data input*/) {
        Runnable r = () -> {
            try {
                System.out.println("Generating template...");
                TimeUnit.MILLISECONDS.sleep(300);
                System.out.println("Template generated");
            } catch (Exception ignored) {

            }
        };

        new Thread(r).start();
    }

    public static void sentMail(/*user data input*/) {
        Runnable r = () -> {
            try {
                System.out.println("Connecting to mail server...");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Mail sent");
            } catch (Exception ignored) {

            }
        };

        new Thread(r).start();
    }
}
