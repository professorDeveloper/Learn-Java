package module4.regural_expression;

import kotlin.text.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("e.{2}");
        Matcher matcher = compile.matcher("Hello PDP text");
        while (matcher.find()) {
            System.out.println("Start: " + matcher.start());
            System.out.println("End: " + matcher.end());

            System.out.println(matcher.group());
        }
    }

    public static int getNumCountFromString(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
