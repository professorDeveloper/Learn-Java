package module4.threads.daemonthread;

public class ActiveThreadsCountTest {
    public static void main(String[] args) {
        int x = Thread.activeCount();
        Thread[] threads = new Thread[x];
        Thread.enumerate(threads);
        System.out.println(x);
        for (Thread thread : threads) {
            System.out.println(thread);
        }
    }
}
