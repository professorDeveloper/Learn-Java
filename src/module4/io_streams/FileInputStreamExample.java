package module4.io_streams;

import java.io.*;
import java.util.Arrays;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("io/readme2.txt");
        InputStream is = new FileInputStream("io/readme.txt");
        InputStream is2 = new FileInputStream("io/readme2.txt");
        String data = new String(is2.readAllBytes());
        System.out.println("Before=" + data);
        is.transferTo(os);
        String afterData = new String(is2.readAllBytes());
        System.out.println("After=" + afterData);
        os.close();
        is.close();
        is2.close();
//        inputStream();
    }

    private static void inputStream() throws IOException {
        InputStream inputStream = new FileInputStream("io/readme2.txt");
        System.out.println(inputStream.available());
        String data = new String(inputStream.readAllBytes());
        System.out.println("data= " + data);
        inputStream.close();
    }
}
