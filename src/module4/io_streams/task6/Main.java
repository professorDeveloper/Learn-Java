package module4.io_streams.task6;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileIO dirIO = new FileIO("assets");
        dirIO.createDirectory("images");
        dirIO.createFile("images/learn.txt");
        dirIO.writeToFile("images/learn.txt", "Learning");
        System.out.println("Data:" + dirIO.readFromFile("images/learn.txt"));
        dirIO.createDirectory("videos");
        dirIO.createFile("videos/java.txt");
        dirIO.writeToFile("videos/java.txt", "Java Filea IO learning");
        System.out.println(dirIO.readFromFile("videos/java.txt"));
    }
}