package module4.lessons.threadpool.task3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DownloadManager {
    private final ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public Future<String> download(String url) {
        return service.submit(() -> {
            System.out.println("Downloading " + url);
            Thread.sleep(1000);
            return "Downloaded " + url;
        });
    }

    public void shutdown() {
        service.shutdown();
    }
}
