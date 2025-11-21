package module4.lessons.io_streams;

import java.io.*;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
//        output();
        FileInputStream fileInputStream = new FileInputStream("io/dataOutputStream.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        System.out.println("readDouble=" + dataInputStream.readDouble());
        System.out.println("readLong=" + dataInputStream.readLong());
        System.out.println("readInt=" + dataInputStream.readInt());
    }

    private static void output() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("io/dataOutputStream.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeDouble(12.2);
        dataOutputStream.writeLong(12L);
        dataOutputStream.writeInt(133);
        dataOutputStream.writeBytes("ddddd qwdqd");
        fileOutputStream.close();
        dataOutputStream.close();
    }
}
