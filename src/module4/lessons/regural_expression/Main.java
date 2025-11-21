package module4.lessons.regural_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "Hello PDP 12, 2025/11/20";
        int numCount = getNumCountFromString(input);
        System.out.println(numCount);
    }

    public static int getNumCountFromString(String str) {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
