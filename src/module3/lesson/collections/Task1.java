package module3.lesson.collections;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            list.remove((int) (Math.random() * list.size()));
        }
        System.out.println(list);
    }
}
