package module3.lesson.collections;

import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> integers = List.of(12, 45, 90);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
