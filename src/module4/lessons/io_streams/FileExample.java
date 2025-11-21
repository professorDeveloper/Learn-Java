package module4.lessons.io_streams;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("io", "");
        System.out.println(file.delete());
        System.out.println(file.canExecute());
        System.out.println(file.isFile());
        String directory = "";
        for (int i = 0; i < 100; i++) {
            directory = directory + "/folder" + i;
            File directoryFile = new File("io", directory);
            System.out.println(directoryFile.mkdir());
        }
    }
}
