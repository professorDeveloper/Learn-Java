package module3.lesson.legacy_collection.properties;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        var properties = new Properties();
        FileInputStream inputStream = new FileInputStream("src/module3/lesson/legacy_collection/config.xml");
        properties.loadFromXML(inputStream);
        properties.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
        //        readFromProperties();
    }

    private static void readFromProperties() throws IOException {
        var properties = new Properties();
        FileReader reader = new FileReader("src/module3/lesson/legacy_collection/config.properties");
        properties.load(reader);
        System.out.println(properties.getProperty("message"));
        System.out.println(Collections.list(properties.elements()));
    }
}
