package module4.threads.synchronized_keyword;

import java.util.Arrays;

public class Bank {
    private final double[] accounts;

    public Bank(int n, double initialBalance) {
        this.accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    public void transfer(int from, int to, double amount) throws InterruptedException {
        synchronized (this) {
            while (accounts[from] < amount) {
                wait();
                System.out.print(Thread.currentThread() + ": ");
                accounts[from] -= amount;
                System.out.printf("%10.2f from %d to %d ", amount, from, to);
                accounts[to] += amount;
                System.out.printf("Total balance: %10.2f%n", getTotalBalance());
                notifyAll();
            }
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
