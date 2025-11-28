package module3.lesson.generics;

public class CompareMethod {
    public static <T extends Comparable<T>> int compare(T object1, T object2) {
        return object1.compareTo(object2);
    }
}

class GenericMethodTest {
    public static void main(String[] args) {
        int result = CompareMethod.compare(10, 20);
        System.out.println(result);
        System.out.println(CompareMethod.compare(10, 10));
    }
}

