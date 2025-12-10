package module3.lesson.legacy_collection.properties;

import java.util.Locale;
import java.util.ResourceBundle;

public class Task2 {
    public static void main(String[] args) {
        Locale locale = new Locale("uz");

        ResourceBundle bundle = ResourceBundle.getBundle(
                "module3.lesson.legacy_collection.lang.messages", locale
        );

        System.out.println("=== Dictionary (" + locale + ") ===");

        bundle.keySet().forEach(key -> {
            String value = bundle.getString(key);
            System.out.println("Uzbek: " + key + " -> English: " + value);
        });

        String word = "olma";
        if (bundle.containsKey(word)) {
            System.out.println("\nTarjima: " + word + " -> " + bundle.getString(word));
        } else {
            System.out.println("\nBunday so‘z topilmadi!");
        }
    }
}
