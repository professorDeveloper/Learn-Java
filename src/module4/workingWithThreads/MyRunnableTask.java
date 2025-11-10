package module4.workingWithThreads;

class MyRunnableTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}

class MainRun {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnableTask());
        thread.start();
        System.out.println("We don`t say Hello world!");
    }
}
