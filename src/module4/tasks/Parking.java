package module4.tasks;

import static java.lang.Thread.sleep;

public class Parking {
    private final int capacity;
    private int free;

    public Parking(int capacity) {
        this.capacity = capacity;
        this.free = capacity;
    }

    public synchronized void enter(String carName) {
        if (free <= 0) {
            System.out.println(carName + "keldi lekin joy yo`q | bo`sh: " + free);
        } else {
            System.out.println(carName + "parking ga joylashmoqda | free=" + free);
            sleep(50);
            free--;
            System.out.println(carName + " parkingga joylashdi | free: " + free);

        }
    }

    public synchronized void exit(String carName) {
        sleep(30);
        if (free < capacity) {
            free++;
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

    public int getCapacity() {
        return capacity;
    }

    public int getFree() {
        return free;
    }
}

class ParkingApp {
    public static void main(String[] args) throws InterruptedException {
        Parking lot = new Parking(3);
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
            int f = lot.getFree();
            int cap = lot.getCapacity();
            if (f < 0 || f > cap) {
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
