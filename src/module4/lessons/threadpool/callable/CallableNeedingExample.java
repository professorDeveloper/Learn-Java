package module4.lessons.threadpool.callable;

import java.util.concurrent.*;

public class CallableNeedingExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //uzcard to humo
        // sener to  receiver
        // sender check // paralell
        // receiver check // paralell
        //transfer

        ExecutorService service = Executors.newFixedThreadPool(10);
        long begin = System.currentTimeMillis();
        Callable<Boolean> checkUzCardWallet = () -> {
            System.out.println("Checking sender wallet...");
            TimeUnit.SECONDS.sleep(2);
            return true;
        };
        Callable<Boolean> checkHumoWallet = () -> {
            System.out.println("Checking receiver wallet...");
            TimeUnit.SECONDS.sleep(2);
            return true;
        };
        Future<Boolean> receiverCheckResponse = service.submit(checkHumoWallet);
        Future<Boolean> senderCheckResponse = service.submit(checkUzCardWallet);
        System.out.println(receiverCheckResponse.get()); // Get method main threadni bloklaydi. Ya`ni 2 ta get method 1 paytda ishlay olmaydi.
        System.out.println(senderCheckResponse.get());
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - begin));
        service.shutdown();
    }

}
