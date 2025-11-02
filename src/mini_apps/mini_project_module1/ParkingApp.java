package mini_apps.mini_project_module1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author azamov
 * @version v1
 * @description This parking project for learning using programming principles and also learning java
 * @since 10/14/2025
 */
public class ParkingApp {
    public static final String emptySign = "✅";

    public static void main(String[] args) {
        String[][] parking = {
                {emptySign, emptySign, emptySign, emptySign, emptySign},
                {emptySign, emptySign, emptySign, emptySign, emptySign},
                {emptySign, emptySign, emptySign, emptySign, emptySign},
        };
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Choose: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> showParking(parking);
                case "2" -> availableCells(parking);
                case "3" -> notAvailableCells(parking);
                case "4" -> insertCar(parking);
                case "5" -> outCar(parking);
                case "6" -> {
                    System.out.println("Exited");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    /**
     * @description Ushbu usul menyuni aks ettirish uchun ishlatiladi
     */
    private static void displayMenu() {
        for (String s : Arrays.asList("Display Park -> 1", "Available cells count -> 2", "Not Available cells count -> 3", "Insert Car -> 4", "Out-> 5", "Quit -> 6")) {
            System.out.println(s);
        }
    }

    /**
     * @param parking qo'shish uchun
     * @description Ushbu usul chiqarish uchun ishlatiladi
     */
    private static void outCar(String[][] parking) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = scanner.nextInt();
        System.out.print("Enter column: ");
        int column = scanner.nextInt();
        if (row < 0 || row > 2 || column < 0 || column > 4) {
            System.out.println("Invalid row or column");
        } else if (parking[row][column].equals(emptySign)) {
            System.out.println("Cell is empty");
        } else {
            parking[row][column] = emptySign;
            System.out.println("Car out successfully");
        }
    }

    /**
     * @description Ushbu func car  qo'shish uchun ishlatiladi.
     * @param parking bu parking matrix update qilish
     * yani car qo`shilganini update qilish uchun foydalanildi
     ***/
    private static void insertCar(String[][] parking) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = scanner.nextInt();
        System.out.print("Enter column: ");
        int column = scanner.nextInt();
        if (row < 0 || row > 2 || column < 0 || column > 4) {
            System.out.println("Invalid row or column");
        } else if (parking[row][column].equals(emptySign)) {
            parking[row][column] = "🚌";
            System.out.println("Car inserted successfully");
        } else {
            System.out.println("Cell is not empty");
        }
    }

    /**
     * @param parking qancha parkingda emptySign bo`lmagan bo`sh joylar sonini ko`rsatib beradi
     * @description Ushbu func Mavjud bo`lmagan bo`sh joylar sonini ko`rsatib beradi.
     * @author Azamov
     * @since 10/14/2025
     */

    private static void notAvailableCells(String[][] parking) {
        int count = 0;
        count = getCount(parking, count,false);
        System.out.println("Not Available cells count: " + count);
    }

    /**
     * @param parking mavjud bo`lgan bo`sh joylar sonini ko`rsatib beradi
     * @description Ushbu func mavjud bo`lgan bo`sh joylar sonini ko`rsatib beradi
     * @author Azamov
     * @since 10/14/2025
     **/
    private static void availableCells(String[][] parking) {
        System.out.println("---------------------------------------------");
        int count = 0;
        count = getCount(parking, count,true);
        System.out.println("Available cells count: " + count);
        System.out.println("---------------------------------------------");
    }

    private static int getCount(String[][] parking, int count,boolean forAvailable) {
        for (String[] strings : parking) {
            for (String string : strings) {
                if (forAvailable){
                    if (string.equals(emptySign)) {
                        count++;
                    }
                }else {
                    if (!string.equals(emptySign)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }


    /**
     * @param parking chiqarish uchun
     * @description Parkingni chiqarish uchun ishlatiladi
     * @author Azamov
     * @since 10/14/2025
     **/
    private static void showParking(String[][] parking) {
        System.out.println("--------------------------------");
        for (String[] strings : parking) {
            for (String string : strings) {
                System.out.print(string + "|");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
    }
}
