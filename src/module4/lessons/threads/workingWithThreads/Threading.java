package module4.lessons.threads.workingWithThreads;

public class Threading {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(new MyRunnableTask());
        thread.start();
        myTask.start();
        System.out.println("We don`t say Hello world!");
    }

}

