package module3.lesson.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
/*
        Ismlar listini yarating 20 tacha ismlar qoshing dublikat ismlarni ham bo'lsin.
        dublikat ismlarni listdan o'chirib tashlang
        Itirator method orqali list elementlarini ekranga chiqaring
*/
        ArrayList<String> list = new ArrayList<>();
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
        list.removeIf((item) -> list.indexOf(item) != list.lastIndexOf(item));
        System.out.println(list);

    }
}
