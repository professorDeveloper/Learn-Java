package module4.lessons.forkJoinFramework;

import java.util.concurrent.RecursiveTask;

public class CounterRecursiveTask extends RecursiveTask<Integer> {
    double[] numbers;
    private int from;
    private int to;

    private int limit = 1000;

    public CounterRecursiveTask(double[] numbers, int from, int to) {
        this.numbers = numbers;
        this.from = from;
        this.to = to;
    }

    @Override
    protected Integer compute() {
        if (this.to - this.from < limit) {
            int count = 0;
            for (int i = this.from; i < this.to; i++) {
                if (numbers[i] > 0.3) {
                    count++;
                }
            }
            return count;
        } else {
            int middle = this.from + (this.to - this.from) / 2;
            CounterRecursiveTask first = new CounterRecursiveTask(numbers, this.from, middle);
            CounterRecursiveTask second = new CounterRecursiveTask(numbers, middle, this.to);
            invokeAll(first, second);
            return first.join() + second.join();
        }
    } // Compute methodi task qachon bo`linishi kerak va qahcon bo`linmasligi kerak degan algorithm yozish kk
}
