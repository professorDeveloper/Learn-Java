package module4.lessons.io_streams.task7;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {
        Path path = Path.of("assets", "learn.txt");
        Files.createDirectory(path.getParent());
        Files.createFile(path);
        Files.write(path, "Hello Java PDP online".getBytes());
        ReadTransferIO io = new ReadTransferIO(path);
        System.out.println(io.read());
        io.transferToAnotherPath(Path.of("assets", "learn2.txt"));
    }
}
