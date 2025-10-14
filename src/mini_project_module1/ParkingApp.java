package mini_project_module1;

import java.util.Scanner;

/**
 * @version v1
 * */
public class ParkingApp {

    public static void main(String[] args) {
        String[][] parking = {

                {"✅", "✅", "✅", "✅", "✅"},
                {"✅", "✅", "✅", "✅", "✅"},
                {"✅", "✅", "✅", "✅", "✅"},
        };
        Scanner scanner = new Scanner(System.in);
        while (true){
            displayMenu();
            System.out.print("Choose: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> {
                    System.out.println("---------------------------------");
                    showParking(parking);
                    System.out.println("---------------------------------");
                }
                case "2" -> {
                    availableCells(parking);
                }
                case "3" -> {
                    notAvailableCells(parking);
                }
                case "4" -> {
                    insertCar(parking);
                }
                case "5" -> {
                    outCar(parking);
                }
                case "6" -> {
                    System.out.println("Exited");
                    System.exit(0);
                }
            }
        }
    }

    /**
     * @description Ushbu usul menyuni aks ettirish uchun ishlatiladi
     */
    private static void displayMenu() {
        System.out.println("Display Park -> 1");
        System.out.println("Available cells count -> 2");
        System.out.println("Not Available cells count -> 3");
        System.out.println("Insert Car -> 4");
        System.out.println("Out-> 5");
        System.out.println("Quit -> 6");
    }

    /**
     * @description Ushbu usul chiqarish uchun ishlatiladi
     * @param parking qo'shish uchun
     */
    private static void outCar(String[][] parking) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = scanner.nextInt();
        System.out.print("Enter column: ");
        int column = scanner.nextInt();
        String emptySign = "✅";
        if (row < 0 || row > 2 || column < 0 || column > 4) {
            System.out.println("Invalid row or column");
        } else if (parking[row][column].equals(emptySign)) {
            System.out.println("Cell is empty");
        } else {
            parking[row][column] = emptySign;
            System.out.println("Car out successfully");
        }
    }

    /***
     * @description Ushbu func car  qo'shish uchun ishlatiladi.
     * @param parking bu parking matrix update qilish yani car qo`shilganini update qilish uchun foydalanildi
     * */
    private static void insertCar(String[][] parking) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = scanner.nextInt();
        System.out.print("Enter column: ");
        int column = scanner.nextInt();
        String emptySign = "✅";
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
         * @description Ushbu func Mavjud bo`lmagan bo`sh joylar sonini ko`rsatib beradi.
         * @param parking qancha parkingda emptySign bo`lmagan bo`sh joylar sonini ko`rsatib beradi
         * @author Azamov
         * @since 10/14/2025
         */

    private static void notAvailableCells(String[][] parking) {
        String emptySign = "✅";
        int count = 0;
        for (String[] strings : parking) {
            for (String string : strings) {
                if (!string.equals(emptySign)) {
                    count++;
                }
            }
        }
        System.out.println("Not Available cells count: " + count);
    }

    /**
     * @description Ushbu func mavjud bo`lgan bo`sh joylar sonini ko`rsatib beradi
     * @param parking mavjud bo`lgan bo`sh joylar sonini ko`rsatib beradi
     * @author Azamov
     * @since 10/14/2025
     * **/
    private static void availableCells(String[][] parking) {
        System.out.println("---------------------------------------------");
        String emptySign = "✅";
        int count = 0;
        for (String[] strings : parking) {
            for (String string : strings) {
                if (string.equals(emptySign)) {
                    count++;
                }
            }
        }
        System.out.println("Available cells count: " + count);
        System.out.println("---------------------------------------------");
    }


    /**
     * @description Parkingni chiqarish uchun ishlatiladi
     * @param parking chiqarish uchun
     * @author Azamov
     * @since 10/14/2025
     * **/
    private static void showParking(String[][] parking) {
        for (String[] strings : parking) {
            for (String string : strings) {
                System.out.print(string + "|");
            }
            System.out.println();
        }
    }
}
