package module3.lesson.exceptions;

import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        try (var scanner =new Scanner(System.in)){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a/b);
        }
    }

}
