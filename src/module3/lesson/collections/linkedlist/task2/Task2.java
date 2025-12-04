package module3.lesson.collections.linkedlist.task2;

import java.util.Iterator;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Alice");
        list.add("Azim");
        list.add("Azim");
        list.add("John");
        list.add("Qudrat");
        list.add("Abdurahim");
        list.add("Azam");
        list.add("Azam");
        list.add("Komil");
        list.add("Ahmad");
        list.add("Sulton");
        list.add("Sulton");
        list.add("Bob");

        LinkedList<String> unique = new LinkedList<>();
        for (String name : list) {
            if (!unique.contains(name)) {
                unique.add(name);
            }
        }

        Iterator<String> it = unique.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
