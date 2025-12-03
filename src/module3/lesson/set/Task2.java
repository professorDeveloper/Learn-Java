package module3.lesson.set;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
        System.out.println(set);
    }
}
