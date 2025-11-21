package module4.lessons.threads.atomicity;

public class Counter {
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public synchronized int incrementAndGet() {
        counter = counter + 1;
        return counter;
    }

}
