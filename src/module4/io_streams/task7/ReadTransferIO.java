package module4.io_streams.task7;

import java.nio.file.Files;
import java.nio.file.Path;

public class ReadTransferIO {
    private Path path;

    public ReadTransferIO(Path filePath) {
        this.path = filePath;
    }

    public void transferToAnotherPath(Path anotherPath) throws Exception {
        if (Files.exists(this.path)) {
            if (Files.exists(anotherPath)) {
                Files.delete(anotherPath);
            }
            Files.copy(this.path, anotherPath);
        } else {
            System.out.println("File not found");
        }
    }

    public void delete() throws Exception {
        if (Files.exists(this.path)) {
            Files.delete(this.path);
        } else {
            System.out.println("File not found");
        }
    }

    public String read() throws Exception {
        if (Files.exists(this.path)) {
            return Files.readString(this.path);
        } else {
            System.out.println("File not found");
            return null;
        }
    }
}
