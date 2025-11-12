package module4.threads.atomicity;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class Parking {
    private final AtomicInteger capacity;
    private AtomicInteger free;

    public Parking(AtomicInteger capacity) {
        this.capacity = capacity;
        this.free = capacity;
    }

    public void enter(String carName) {
        if (free.get() <= 0) {
            System.out.println(carName + "keldi lekin joy yo`q | bo`sh: " + free);
        } else {
            System.out.println(carName + "parking ga joylashmoqda | free=" + free);
            sleep(50);
            free.decrementAndGet();
            System.out.println(carName + " parkingga joylashdi | free: " + free);

        }
    }

    public synchronized void exit(String carName) {
        sleep(30);
        if (free.get() < capacity.get()) {
            free.incrementAndGet();
            System.out.println(carName + "chiqdi bo`sh joylar: " + free);
        } else {
            System.out.println(carName + "parking allaqachon bo`sh !");
        }
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {
        }
    }

    public AtomicInteger getCapacity() {
        return capacity;
    }

    public AtomicInteger getFree() {
        return free;
    }
}

class ParkingApp {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        Parking lot = new Parking(atomicInteger);
        Thread carAThread = new Thread(() -> {
            int i = 1;
            while (true) {
                lot.enter("Car-A" + (i++));
                sleep(20);
            }
        }, "Thread1");

        Thread carBThread = new Thread(() -> {
            int i = 1;
            while (true) {
                lot.enter("Car-B" + (i++));
                sleep(25);
            }
        }, "Thread2");

        Thread carXThread = new Thread(() -> {
            int i = 1;
            while (true) {
                lot.exit("Car-X" + (i++));
                sleep(60);
            }
        }, "Thread3");

        Thread bugChecker = new Thread(new BugChecker(lot), "BugChecker");

        carAThread.start();
        carBThread.start();
        carXThread.start();
        bugChecker.start();

        while (true) {
            sleep(1000);
        }
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {
        }
    }
}

class BugChecker implements Runnable {
    private final Parking lot;

    BugChecker(Parking lot) {
        this.lot = lot;
    }

    @Override
    public void run() {
        while (true) {
            AtomicInteger f = lot.getFree();
            AtomicInteger cap = lot.getCapacity();
            if (f.get() < 0 || f.get() > cap.get()) {
                System.out.println("Race Condition Detected  free=" + f + ", capacity=" + cap);
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
