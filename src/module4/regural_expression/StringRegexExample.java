package module4.regural_expression;

import java.util.Arrays;

public class StringRegexExample {
    public static void main(String[] args) {
        String input = "123 wqd df  3 3";
        String[] split = input.split("\\D+");
        System.out.println(Arrays.toString(split));
        System.out.println(input);
    }
}
