package module4.lessons.io_streams.task1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UniversalIO {
    private FileReader reader;
    private FileWriter writer;
    private final File path;

    public UniversalIO(File filePath) throws Exception {
        this.path = filePath;
        if (filePath.exists()) {
            this.reader = new FileReader(filePath);
            this.writer = new FileWriter(filePath, true);
        } else {
            if (filePath.createNewFile()) {
                this.reader = new FileReader(filePath);
                this.writer = new FileWriter(filePath, true);
            }
        }
    }

    public void write(String text) throws Exception {
        writer.write(text);
        writer.flush();
    }

    public void clearAll() throws IOException {
        writer.close();
        writer = new FileWriter(path, false);
    }

    public String read() throws Exception {
        writer.flush();
        reader.close();
        reader = new FileReader(path);
        int i = reader.read();
        StringBuilder sb = new StringBuilder();
        while (i != -1) {
            sb.append((char) i);
            i = reader.read();
        }
        return sb.toString();
    }

    public String getFileAbsolutePath() {
        return path.getAbsolutePath();
    }

    public void append(String str) throws IOException {
        writer.append(str);
        writer.flush();
    }

    public void close() throws Exception {
        writer.close();
        reader.close();
    }
}
