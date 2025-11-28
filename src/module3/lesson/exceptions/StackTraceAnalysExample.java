package module3.lesson.exceptions;

public class StackTraceAnalysExample {
    public static void main(String[] args) {
        System.out.println(factorial(2));
    }

    public static int factorial(int n) {
        System.out.printf("Factorial (%d)%n", n);
        StackWalker.getInstance().forEach(stackFrame -> {
            System.out.println(stackFrame.toString());
        });
        int r = 0;
        if (n <= 1) {
            r = 1;
        } else {
            r = n * factorial(n - 1);
        }
        return r;
    }
}
