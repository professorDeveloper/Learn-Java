package module4.lessons.regural_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public static final Pattern VALID_PHONE_NUMBER_PATTERN = Pattern.compile("(\\+998)((71|88|9[01349])(\\d{7}))$");

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null) {
            throw new IllegalArgumentException("Phone number cannot be null");
        }
        Matcher matcher = VALID_PHONE_NUMBER_PATTERN.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean isValidEmailAddress(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }
        Pattern pattern = Pattern.compile("(\\w+)@([\\w-]+)\\.(\\w{2,4})");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isStrongPassword(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }
        Pattern pattern = Pattern.compile("^(?=.*[a-z]+)(?=.*[A-Z]+)(?=.*\\d+)(?=.*[@#$<>?!]+).{8,30}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static List<String> getWords(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        List<String> words = new ArrayList<>();
        String regex = "[a-zA-z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }
    
}
