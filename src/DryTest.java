public class DryTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Sonlar yig'indisi: " + sum(a, b));
        System.out.println("Sonlar farki: " + minus(a, b));
    }
    public static  int sum(int a, int b) {
        return a + b;
    }
    public static  int minus(int a, int b) {
        return a - b;
    }

}
