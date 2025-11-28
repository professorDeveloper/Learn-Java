package module3.lesson.exceptions.tasks.task2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter number arr[%d]: ", i);
            int num = scanner.nextInt();
            if (num > 0 && num <= 10) {
                arr[i] = num;
            } else {
                throw new NoFoundNumberException();
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
