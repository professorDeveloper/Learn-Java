package module4.lessons.threads.race_condtion_lock;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private final double[] accounts;
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public Bank(int n, double initialBalance) {
        this.accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    public void transfer(int from, int to, double amount) throws InterruptedException {
        try {
            lock.lock();
            //from =5; 500,  600 so`m otkazish kk pul yoqligi uchun shu shart bajariladi
            while (accounts[from] < amount)
                condition.await();

            System.out.print(Thread.currentThread() + ": ");
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d ", amount, from, to);
            accounts[to] += amount;
            System.out.printf("Total balance: %10.2f%n", getTotalBalance());
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public double getTotalBalance() {
        double sum = 0;
        for (double a : accounts) sum += a;
        return sum;
    }

    public int size() {
        return accounts.length;
    }

}
