package module4.workingWithThreads;

class MyTask extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}
