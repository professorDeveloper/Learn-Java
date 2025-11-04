package module1.mini_apps.mini_app_in_oop;

import java.util.Arrays;
import java.util.Scanner;

public class AndroidUI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parking parking = new Parking();
        int rowCount = 5;
        int cellCount = 6;
        parking.buildPark(rowCount, cellCount);
        while (true) {
            displayMenu();
            System.out.print("Choose: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> displayPark(parking);
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

    private static void outCar(Parking parking) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = scanner.nextInt();
        System.out.print("Enter column: ");
        int column = scanner.nextInt();
        parking.outCar(row, column);
    }

    private static void insertCar(Parking parking) {
        Scanner scanner = new Scanner(System.in);
        String registerNum = readConsole("Enter register number: ");
        String carType = readConsole("Enter Car Type \n (POLICE, FIRE, AMBULANCE, TAXI, BUS): ");
        System.out.print("Enter row: ");
        int row = scanner.nextInt();
        System.out.print("Enter column: ");
        int column = scanner.nextInt();
        Car car = new Car(registerNum, carType);
        parking.park(car, row, column);
    }

    private static String readConsole(String hint) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(hint);
        return scanner.nextLine();
    }

    private static void availableCells(Parking parking) {
        parking.availableCells();
    }

    private static void notAvailableCells(Parking parking) {
        parking.notAvailableCells();
    }

    private static void displayPark(Parking parking) {
        parking.showParking();
    }

    private static void displayMenu() {
        for (String s : Arrays.asList("Display Park -> 1", "Available cells count -> 2", "Not Available cells count -> 3", "Insert Car -> 4", "Out-> 5", "Quit -> 6")) {
            System.out.println(s);
        }
    }
}
