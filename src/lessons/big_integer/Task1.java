package lessons.big_integer;

import java.math.BigInteger;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinchi sonni kiriting:");
        String num1Str = scanner.nextLine();
        System.out.println("Ikkinchi sonni kiriting:");
        String num2Str = scanner.nextLine();

        BigInteger  num1 = new BigInteger(num1Str);
        BigInteger num2 = new BigInteger(num2Str);

        System.out.println("Amalni tanlang: (+, -, *, /)");
        String operation = scanner.nextLine();

        BigInteger result;

        switch (operation) {
            case "+":
                result = num1.add(num2);
                break;
            case "-":
                result = num1.subtract(num2);
                break;
            case "*":
                result = num1.multiply(num2);
                break;
            case "/":
                if (!num2.equals(BigInteger.ZERO)) {
                    result = num1.divide(num2);
                } else {
                    System.out.println("Xato: nolga bo‘lish mumkin emas!");
                    return;
                }
                break;
            default:
                System.out.println("Noto‘g‘ri amal tanlandi!");
                return;
        }

        System.out.println("Natija: " + result);
    }
}
