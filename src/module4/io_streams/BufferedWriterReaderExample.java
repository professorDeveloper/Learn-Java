package module4.io_streams;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BufferedWriterReaderExample {
    public static void main(String[] args) throws IOException {
        File file = new File("io/readme.txt");
        FileWriter writer = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(writer);
        bWriter.append("\n").append("Accept both compliments and criticism because in order to grow, a flower needs to take both, sun and rain.");
        bWriter.append("\n");
        bWriter.append("Date:").append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        bWriter.close();
        reader(file);
    }

    private static void reader(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        while (reader.ready()) {
            System.out.println(reader.readLine());
        }
    }

    private static void oneWay(BufferedReader reader) throws IOException {
        while (true) {
            String readLine = reader.readLine();
            if (readLine == null) break;
            System.out.println(readLine);
        }
    }
}
