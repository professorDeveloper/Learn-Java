package module4.lessons.threadpool;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceMethodsWhichWorksCallableFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println(Runtime.getRuntime().availableProcessors());
//        System.out.println(Runtime.getRuntime().freeMemory());
//        System.out.println(Runtime.getRuntime().maxMemory());
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Callable<String> call1 = () -> {
            Thread.sleep(100);
            return "Response 1";
        };
        Callable<String> call2 = () -> {
            Thread.sleep(100);
            return "Response 2";
        };
        Callable<String> call3 = () -> {
            Thread.sleep(100);
            return "Response 3";
        };

        /*List<Future<String>> futures = service.invokeAll(List.of(call1, call2, call3));
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }
        */
        String string = service.invokeAny(List.of(call1, call2, call3));
        System.out.println(string);

        service.shutdown();
    }
}
