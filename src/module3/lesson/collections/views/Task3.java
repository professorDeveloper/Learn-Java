package module3.lesson.collections.views;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Map<String, List<String>> translations = new HashMap<>();
        translations.put("Salom", Arrays.asList("Hello", "Hi"));
        translations.put("Bog'lanish", Arrays.asList("Join", "Connect"));
        translations.put("Yaxshi", Arrays.asList("Good", "Well"));
        translations.put("Qiziqish", Arrays.asList("Finish", "End"));
        Scanner scanner = new Scanner(System.in);
        String word;
        while (true) {
            System.out.println("1.Find Word");
            System.out.println("2.Add Word");
            System.out.println("3.Quit");
            System.out.print("Choose option:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter word for find (eng or uz):");
                    word = scanner.nextLine();
                    findWordFromDict(translations, word);
                    break;
                case 2:
                    System.out.print("Enter word to add (eng and uz):");
                    word = scanner.nextLine();
                    System.out.print("Enter translation:");
                    String translation = scanner.nextLine();
                    translations.computeIfAbsent(word, k -> new ArrayList<>()).add(translation);
                    break;
                case 3:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private static void findWordFromDict(Map<String, List<String>> dictionary, String word) {
        for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
            if (entry.getKey().toLowerCase().equals(word.toLowerCase())) {
                System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
            if (entry.getValue().stream().map(String::toLowerCase).toList().contains(word.toLowerCase())) {
                System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
            }
        }
    }
}
