package module4.workingWithThreads;

public class DownloadManager implements Runnable {
    private final String fileName;

    public DownloadManager(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            for (int step = 1; step <= 3; step++) {
                System.out.println(Thread.currentThread().getName() + " processing " + fileName + " (step " + step + ")");
                Thread.sleep(300);
            }
            System.out.println(Thread.currentThread().getName()
                    + " finished " + fileName);
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class MainTest {
    public static void main(String[] args) {
        DownloadManager downloadManager = new DownloadManager("Java-Threads.pdf");
        Thread thread = new Thread(downloadManager);
        thread.start();
    }
}