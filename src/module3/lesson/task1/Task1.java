package module3.lesson.task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {


        String[] names = new String[]{"Abror", "Olim", "Said", "Komil"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        Collections.shuffle(list);
        Optional<List<String>> optionalList = list.isEmpty()
                ? Optional.empty()
                : Optional.of(list.stream().sorted().toList());
        optionalList.ifPresent(collection -> collection.forEach(System.out::println));

    }
}
