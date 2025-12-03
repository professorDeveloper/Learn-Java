package module3.lesson.linkedlist.task2;

import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            list.add(rand.nextInt(101));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + " | " + list.get(i));
        }

        int randomIndex = rand.nextInt(list.size());
        int removedValue = list.remove(randomIndex);
        System.out.println(randomIndex);
        System.out.println(removedValue);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + " | " + list.get(i));
        }
    }
}
