package module3.lesson.linkedlist;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
/*
        Ikkita LinkedList dan foydalanib list yarting. Birinchi listga 10 tacha, ikkinchisiga 5 tacha ism bilan to'diring.
        birinchi listdagi elementlarni ikkinchi listga qoshing 15 ta element bo'ladi jami.
        Ikkinchi listning firinchisiga va oxirgisiga o'z ismingizni qo'shing
        Iterator orqali elementlarni chop eting
*/
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list1.add("Name" + i);
        }
        for (int i = 0; i < 5; i++) {
            list2.add("Name" + i);
        }
        list2.addFirst("Azamov");
        list2.addLast("Azamov");
        list2.addAll(list1);
        for (String name : list2) {
            System.out.println(name);
        }
    }
}
