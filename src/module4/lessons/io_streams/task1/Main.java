package module4.lessons.io_streams.task1;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("io", "readme.txt");
        UniversalIO io = new UniversalIO(file);
        io.clearAll();
        io.write("Test");
        System.out.println(io.read());
        io.clearAll();
        io.write("Hello World");
        System.out.println(io.getFileAbsolutePath());
    }
}
