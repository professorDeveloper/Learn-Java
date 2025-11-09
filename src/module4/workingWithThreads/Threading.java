package module4.workingWithThreads;

public class Threading {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        myTask.run();
        System.out.println("We don`t say Hello world!");
    }
}

class MyTask extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            System.out.println();
            System.out.println(Thread.currentThread().getName() + " -> "+i);
        }
    }
}