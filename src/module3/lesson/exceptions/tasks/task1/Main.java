package module3.lesson.exceptions.tasks.task1;

public class Main {
    public static void main(String[] args) {
        try {
            ProgrammingLanguage language = new ProgrammingLanguage(null, null, null);
            System.out.println(language.name);
            System.out.println(language.owner);
        } catch (NullPointerException e) {
            System.out.println("Null cant use");
        }
    }
}
