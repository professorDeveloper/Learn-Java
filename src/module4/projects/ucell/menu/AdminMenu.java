package module4.projects.ucell.menu;


import module4.projects.ucell.domain.PhoneNumber;
import module4.projects.ucell.domain.Tariff;
import module4.projects.ucell.service.admin.PhoneNumberService;
import module4.projects.ucell.service.admin.TariffService;
import module4.projects.ucell.service.admin.impl.PhoneNumberServiceImpl;
import module4.projects.ucell.service.admin.impl.TariffServiceImpl;

import java.util.List;
import java.util.Scanner;

public class AdminMenu {

    private final PhoneNumberService phoneService;
    private final TariffService tariffService;

    public AdminMenu() {
        this.phoneService = new PhoneNumberServiceImpl();
        this.tariffService = new TariffServiceImpl();
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n==== ADMIN MENU ====");
            System.out.println("1. Phone numbers CRUD");
            System.out.println("2. Tariffs CRUD");
            System.out.println("0. Back");
            System.out.print("Choice: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> phoneMenu();
                case 2 -> tariffMenu();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Wrong option");
            }
        }
    }

    private void phoneMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- PHONE NUMBER MENU ---");
            System.out.println("1. List");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> listNumbers();
                case 2 -> addNumber();
                case 3 -> deleteNumber();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Wrong option.");
            }
        }
    }

    private void listNumbers() {
        List<PhoneNumber> list = phoneService.getAll();
        System.out.println("\nID | NUMBER | STATUS | OWNER");
        for (PhoneNumber p : list) {
            System.out.println(p.getId() + " | " + p.getNumber() + " | " + p.getStatus() + " | " + p.getOwnerId());
        }
    }

    private void addNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number (93/94xxxxxxx): ");
        String num = scanner.nextLine();
        phoneService.create(num);
        System.out.println("Added");
    }

    private void deleteNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Id:");
        String id = scanner.nextLine();
        phoneService.delete(id);
        System.out.println("Deleted.");
    }

    private void tariffMenu() {
        while (true) {
            System.out.println("\n--- TARIFF MENU ---");
            System.out.println("1. List");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            int option = new Scanner(System.in).nextInt();

            switch (option) {
                case 1 -> listTariffs();
                case 2 -> addTariff();
                case 3 -> deleteTariff();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Wrong option!");
            }
        }
    }

    private void listTariffs() {
        List<Tariff> list = tariffService.getAll();
        for (Tariff t : list) {
            System.out.println(t.getId() + " | " + t.getName() + " | " + t.getPrice() + " | " + t.getDescription());
        }
    }

    private void addTariff() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tariff name: ");
        String name = scanner.nextLine();
        System.out.print("Tariff price: ");
        double price = Double.parseDouble(String.valueOf(scanner.nextInt()));
        System.out.print("Tariff description: ");
        String desc = scanner.nextLine();
        tariffService.create(name, price, desc);
        System.out.println("Tariff added.");
    }

    private void deleteTariff() {
        System.out.print("Tariff id:");
        String id = new Scanner(System.in).nextLine();
        tariffService.delete(id);
        System.out.println("Tariff deleted.");
    }
}
