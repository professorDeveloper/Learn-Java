package module4.lessons.serialization_deserialization;

import java.io.*;

public class SingletonBreakerExample {
    public static void main(String[] args) {
        write();
        read();
    }

    private static void write() {
        try {
            Singleton instance = Singleton.getInstance();
            System.out.println(System.identityHashCode(instance));
            File file = new File("serder/file.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(instance);
            outputStream.flush();
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ignored) {
        }
    }

    private static void read() {
        try {

            File file = new File("serder/file.txt");
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
            Singleton e = (Singleton) inputStream.readObject();
            System.out.println(System.identityHashCode(e));
            System.out.println(e.toString());
        } catch (IOException ignored) {
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
