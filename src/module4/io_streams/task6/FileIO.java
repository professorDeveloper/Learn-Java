package module4.io_streams.task6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIO {
    private Path currentPath;

    public FileIO(String basePath) {
        this.currentPath = Path.of(basePath);
    }

    public void createDirectory(String dirName) throws IOException {
        Path dirPath = currentPath.resolve(dirName);
        if (Files.exists(dirPath)) {
            System.out.println("Directory already exists: " + dirPath);
            return;
        }
        Files.createDirectories(dirPath);
        System.out.println("Directory created: " + dirPath.toAbsolutePath());
    }

    public void createFile(String fileName) throws IOException {
        Path filePath = currentPath.resolve(fileName);
        if (Files.exists(filePath)) {
            System.out.println("File already exists: " + filePath);
            return;
        }
        Files.createFile(filePath);
        System.out.println("File created: " + filePath.toAbsolutePath());
    }

    public void writeToFile(String fileName, String content) throws IOException {
        Path filePath = currentPath.resolve(fileName);

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
            System.out.println("File created for writing: " + filePath);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))) {
            writer.write(content);
        }
        System.out.println("Successfully written to: " + filePath.toAbsolutePath());
    }

    public String readFromFile(String fileName) throws IOException {
        Path filePath = currentPath.resolve(fileName);

        if (!Files.exists(filePath)) {
            System.out.println("File not found: " + filePath);
            return "";
        }
        if (Files.isDirectory(filePath)) {
            System.out.println("Cannot read directory: " + filePath);
            return "";
        }

        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        System.out.println("Successfully read from: " + filePath.toAbsolutePath());
        return content.toString().trim();
    }

}