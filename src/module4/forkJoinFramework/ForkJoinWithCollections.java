package module4.forkJoinFramework;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinWithCollections {
    public static void main(String[] args) {
        int size = 500_000_000;
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Math.random();
        }
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        CounterRecursiveTask counterRecursiveTask = new CounterRecursiveTask(arr, 0, size);
        long begin = System.currentTimeMillis();
        forkJoinPool.invoke(counterRecursiveTask);
        Integer join = counterRecursiveTask.join();
        long end = System.currentTimeMillis();
        System.out.println(join + "::" + (end - begin));
        begin = System.currentTimeMillis();
        join = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0.2) {
                join++;
            }
        }
        end = System.currentTimeMillis();
        System.out.println(join + "::" + (end - begin));
    }
}
