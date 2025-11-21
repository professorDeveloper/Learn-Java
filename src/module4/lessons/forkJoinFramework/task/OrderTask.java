package module4.lessons.forkJoinFramework.realTask;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class OrderTask extends RecursiveTask<Double> {
    private final List<Order> orders;
    private final int start;
    private final int end;
    private final int limit = 1000;

    public OrderTask(List<Order> orders, int start, int end) {
        this.orders = orders;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        int length = end - start;
        if (length <= limit) {
            double sum = 0.0;
            for (int i = start; i < end; i++) {
                sum += orders.get(i).getAmount();
            }
            return sum;
        } else {
            int mid = start + length / 2;
            OrderTask leftTask = new OrderTask(orders, start, mid);
            OrderTask rightTask = new OrderTask(orders, mid, end);

            invokeAll(leftTask, rightTask);
            double leftResult = leftTask.join();
            double rightResult = rightTask.join();

            return leftResult + rightResult;
        }
    }
}
