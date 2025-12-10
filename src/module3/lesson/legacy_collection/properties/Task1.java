package module3.lesson.legacy_collection.properties;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

public class Task1 {
    public static void main(String[] args) throws IOException {

        HashMap<String, String> dictionaries = new HashMap<>();
        var properties = new Properties();
        var file = new File("config.properties");
        if (!file.exists()) {
            System.out.println(file.createNewFile());
        }
        properties.load(new FileReader(file));
        dictionaries.put("olma", "apple");
        dictionaries.put("ananas", "pineapple");
        dictionaries.put("shaftoli", "strawberry");
        dictionaries.put("yugurmoq", "run");
        dictionaries.put("soch", "hair");

        properties.putAll(dictionaries);
        properties.store(new FileWriter(file), "Dictionary \nLearn Java");

        properties.forEach((k, v) -> {
            System.out.println("Uzbek: " + k + " Eng: " + v);
        });

    }
}
