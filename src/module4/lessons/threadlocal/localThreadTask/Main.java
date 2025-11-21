package module4.lessons.threadlocal.localThreadTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final ThreadLocal<ShoppingCart> threadLocalCart =
            ThreadLocal.withInitial(ShoppingCart::new);

    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);
        Runnable user1 = () -> {
            threadLocalCart.get().addItem("Laptop");
            threadLocalCart.get().addItem("Mouse");
            System.out.println("User1 cart = " + threadLocalCart.get().getItems());
        };

        Runnable user2 = () -> {
            threadLocalCart.get().addItem("Phone");
            threadLocalCart.get().addItem("Charger");
            System.out.println("User2 cart = " + threadLocalCart.get().getItems());
        };

        Runnable user3 = () -> {
            threadLocalCart.get().addItem("TV");
            System.out.println("User3 cart = " + threadLocalCart.get().getItems());
        };
        service.execute(user1);
        service.execute(user2);
        service.execute(user3);

    }
}