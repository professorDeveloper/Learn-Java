package module4.lessons.threadpool.task3;

import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        DownloadManager manager = new DownloadManager();
        Future<String> file1 = manager.download("song.mp3");
        Future<String> file2 = manager.download("video.mp4");
        Future<String> file3 = manager.download("image.png");
        while (!file1.isDone() || !file2.isDone() || !file3.isDone()) {
            Thread.sleep(300);
            System.out.println("Files are downloading...");
        }
        System.out.println("All files are downloaded!");
        System.out.println(file1.get());
        System.out.println(file2.get());
        System.out.println(file3.get());
        manager.shutdown();

    }


}
