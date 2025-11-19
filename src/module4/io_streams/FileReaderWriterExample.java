package module4.io_streams;

import java.io.*;

public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("io/readme.txt", true);
        writer.append("Hello");
        writer.close();
        readerExample();
    }

    private static void readerExample() throws IOException {
        FileReader reader = new FileReader("io/readme.txt");
        StringBuilder a = new StringBuilder();
        int i;
        while ((i = reader.read()) != -1) {
            a.append((char) i);
        }
        System.out.println(a);
        reader.close();
    }
}
