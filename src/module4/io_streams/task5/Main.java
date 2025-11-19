package module4.io_streams.task5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path checkPath = Path.of("new_io", "test.txt");
        File getFileByPath = createGetFileByPath(checkPath);
        BufferIO io = new BufferIO(getFileByPath);
        io.write("\t Learning");
        System.out.println(io.read());
        if (!Files.exists(Path.of("new_io", "folder"))) {
            Files.createDirectory(Path.of("new_io", "folder"));
        }
        File newFilePath = createGetFileByPath(Path.of("new_io", "folder", "test.txt"));
        io.copyFile(getFileByPath, newFilePath);
        io.close();

    }

    private static File createGetFileByPath(Path checkPath) throws IOException {
        if (Files.exists(checkPath)) {
            return checkPath.toFile();
        } else {
            return Files.createFile(checkPath).toFile();
        }
    }
}
