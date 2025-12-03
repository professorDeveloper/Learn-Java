package module3.lesson.set;

import java.util.HashSet;
import java.util.Set;

public class ObjectCreating {
    public static void main(String[] args) {
/*
        a dan z gacha bo'lgan harflarni saqlovchi set yarating forEach orqali ekranga chop eting
*/
        Set<String> set = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            set.add(String.valueOf(c));
        }
        set.forEach(System.out::println);
    }
}
