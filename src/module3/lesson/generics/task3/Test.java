package module3.lesson.generics.task3;

public class Test {
    public static void main(String[] args) {
        CustomList<String> list = new CustomList<>();
        list.add("Test");
        list.add("123");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.getSize());
    }
}
