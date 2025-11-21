package module4.lessons.externalization;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        write();
        read();
    }

    private static void write() {
        try {
            Employee employee = new Employee("Azamov Khan", 123, "+998990001451");
            File file = new File("serder/file.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(employee);
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
            Employee e = (Employee) inputStream.readObject();
            System.out.println(e.toString());
        } catch (IOException ignored) {
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
