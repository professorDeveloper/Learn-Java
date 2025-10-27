package polymorphism.task1;

public class Figure {
    public void perimeter(int a, int b) {
        System.out.printf("Perimeter To`gri tortburchak: %d\n", 2 * (a + b));
    }

    public void perimeter(int a, int b, int c) {
        System.out.printf("Perimeter Uchburchak: %d\n", a + b + c);
    }

    public void perimeter(int a) {
        System.out.printf("Perimeter Kvadrat: %d\n", 4 * a);
    }

    public void perimeter(int a, int b, int c, int d, int e) {
        System.out.printf("Perimeter Beshburchak: %d\n", 2 * (a + b + c + d + e));
    }
}
