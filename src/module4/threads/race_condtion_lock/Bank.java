package module4.threads.race_condtion_lock;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private final double[] accounts;
    private final Lock lock = new ReentrantLock();

    public Bank(int n, double initialBalance) {
        this.accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    public void transfer(int from, int to, double amount) {
        if (accounts[from] < amount) return;
        try {
            lock.lock();
            System.out.print(Thread.currentThread() + ": ");
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d ", amount, from, to);
            accounts[to] += amount;
            System.out.printf("Total balance: %10.2f%n", getTotalBalance());
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
