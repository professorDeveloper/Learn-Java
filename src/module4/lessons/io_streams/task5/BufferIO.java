package module4.lessons.io_streams.task5;

import java.io.*;

public class BufferIO {
    private BufferedReader reader;
    private BufferedWriter writer;
    private File file;


    public BufferIO(File file) throws IOException {
        this.file = file;
        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(file, true);
        this.reader = new BufferedReader(fileReader);
        this.writer = new BufferedWriter(fileWriter);
    }

    public String getFileAbsolutePath() throws IOException {
        return file.getAbsolutePath();
    }

    public String read() throws IOException {
        writer.flush();
        reader.close();
        reader = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            sb.append(reader.readLine());
        }
        if (!sb.isEmpty()) {
            return sb.toString();
        } else {
            return null;
        }
    }

    public void copyFile(File sourceFile, File targetFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile));
        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }


    public void clearAll() throws IOException {
        writer.flush();
    }

    public void close() throws IOException {
        reader.close();
        writer.close();
    }

    public void write(String text) throws IOException {
        writer.write(text);
    }
}
