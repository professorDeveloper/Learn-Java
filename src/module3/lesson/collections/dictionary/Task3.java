package module3.lesson.collections.dictionary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Map<String, List<String>> dictionary = new HashMap<>();
        initDict(dictionary);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word (uz->eng):");
        String word = scanner.nextLine();
        findWordFromDict(dictionary, word);

    }

    private static void findWordFromDict(Map<String, List<String>> dictionary, String word) {
        for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
            if (entry.getKey().equals(word)) {
                System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
            if (entry.getValue().contains(word)) {
                System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
            }
        }
    }

    public static void initDict(Map<String, List<String>> dictionary) {
        dictionary.put("olma", List.of("fruit", "dont take", "apple", "orange"));
        dictionary.put("kiyim", List.of("shoes", "t-shirt"));

    }
}
