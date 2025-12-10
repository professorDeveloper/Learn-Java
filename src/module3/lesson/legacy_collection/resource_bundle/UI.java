package module3.lesson.legacy_collection.resource_bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class UI {
    public static void main(String[] args) {
        var fr = ResourceBundle.getBundle("messages", Locale.FRANCE);
        System.out.println(fr.getString("login"));
        var us = ResourceBundle.getBundle("messages", Locale.forLanguageTag("en"));
        System.out.println(us.getString("login"));
        var uz = ResourceBundle.getBundle("messages", new Locale("uz"));
        System.out.println(uz.getString("login"));
    }
}
