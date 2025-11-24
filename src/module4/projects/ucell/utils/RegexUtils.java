package module4.projects.ucell.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");


    private static final Pattern PHONE_PATTERN =
            Pattern.compile("^(93|94)[0-9]{7}$");

    public static boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public static boolean isValidPassword(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }
        Pattern pattern = Pattern.compile("^(?=.*[a-z]+)(?=.*[A-Z]+)(?=.*\\d+)(?=.*[@#$<>?!]+).{8,30}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean isValidPhone(String phone) {
        return PHONE_PATTERN.matcher(phone).matches();
    }
}
