package module3.lesson.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            set.add(String.valueOf(c));
        }
        set.forEach(System.out::println);
    }
}
