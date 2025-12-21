package module3.lesson.i18n;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Properties;

public class Task2 {
    public static void main(String[] args) throws IOException {
        new File("resources").mkdir();


        Properties enProps = new Properties();
        enProps.setProperty("salom", "Hello");
        enProps.setProperty("xayr", "Bye");
        enProps.setProperty("mushuk", "Cat");
        enProps.setProperty("it", "Dog");
        try (FileOutputStream fos = new FileOutputStream("resources/messages_en.properties")) {
            enProps.store(fos, "");
        }

        ResourceBundle rbUz;
        ResourceBundle rbEn;

        try (FileInputStream fisUz = new FileInputStream("resources/messages_uz.properties");
             FileInputStream fisEn = new FileInputStream("resources/messages_en.properties")) {
            rbUz = new PropertyResourceBundle(fisUz);
            rbEn = new PropertyResourceBundle(fisEn);
        }


        System.out.println(rbUz.getString("salom"));
        System.out.println(rbUz.getString("mushuk"));

        System.out.println(rbEn.getString("salom"));
        System.out.println(rbEn.getString("mushuk"));
    }
}
