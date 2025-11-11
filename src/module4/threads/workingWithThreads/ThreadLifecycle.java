package module4.threads.workingWithThreads;

import org.jetbrains.annotations.NotNull;

public class ThreadLifecycle {
    public static void main(String[] args) {
        // NEW -> RUNNABLE
        Thread t = new Thread(() -> { /* run body */ });
        t.start(); // NEW -> RUNNABLE

        // WAITING misol: wait()/notify()
        Object lock = getObject();
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                // Agar t1 hali lock da bo'lsa, t2 BLOCKED bo'ladi lock bo'shaguncha
            }
        });

        // TIMED_WAITING misol
        Thread sleeper = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
            // timeout tugagach RUNNABLE bo'ladi
        });

    }

    @NotNull
    private static Object getObject() {
        Object lock = new Object();
        Thread waiter = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException ignored) {
                }
                // notify() kelgach bu qism bajariladi (RUNNABLE bo'ladi)
            }
        });
        Thread notifier = new Thread(() -> {
            synchronized (lock) {
                lock.notify(); // waiter WAITING -> RUNNABLE
            }
        });

        // BLOCKED misol
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {
                }
            }
        });
        return lock;
    }
}
