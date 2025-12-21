package module3.lesson.i18n.resource_bundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
//        var fr = ResourceBundle.getBundle("messages", Locale.FRANCE);
//        System.out.println(fr.getString("login"));
//        var us = ResourceBundle.getBundle("messages", Locale.forLanguageTag("en"));
//        System.out.println(us.getString("login"));
//        var uz = ResourceBundle.getBundle("messages", new Locale("uz"));
//        System.out.println(uz.getString("login"));
        while (true) {
            login();
            var us = ResourceBundle.getBundle("messages", Locale.getDefault());
            System.out.println(us.getString("welcome"));
        }
    }

    private static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("username:");
        String username = scanner.nextLine();
        for (User user : User.users) {
            if (user.username().equals(username)) {
                Locale.setDefault(user.locale());
            }
        }
    }
}
