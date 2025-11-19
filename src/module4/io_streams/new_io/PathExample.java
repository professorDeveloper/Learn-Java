package module4.io_streams.new_io;

import kotlin.io.path.PathsKt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathExample {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("new_io", "readme.txt");
        System.out.println(path.isAbsolute());
        System.out.println(path.getFileName());
        System.out.println(File.createTempFile("test", "hacked.txt").getAbsolutePath());
        Path walkPath = Paths.get("C:\\Users\\azamo\\IdeaProjects\\Learn-Java\\src");
        List<Path> list = Files.walk(walkPath).toList();
        for (Path path1 : list) {
            if (Files.isRegularFile(path1)) {
                System.out.println(path1);
            }
        }
    }
}
