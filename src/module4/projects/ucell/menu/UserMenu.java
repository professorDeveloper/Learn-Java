package module4.projects.ucell.menu;

import module4.projects.ucell.domain.PhoneNumber;
import module4.projects.ucell.domain.Tariff;
import module4.projects.ucell.domain.UssdCode;
import module4.projects.ucell.service.user.UserService;
import module4.projects.ucell.service.user.impl.UserServiceImpl;

import java.util.List;
import java.util.Scanner;

public class UserMenu {

    private final UserService userService;

    public UserMenu() {
        this.userService = new UserServiceImpl();
    }

    public void show() {
        while (true) {
            System.out.println("\n---- User Menu----");
            System.out.println("1. View available numbers");
            System.out.println("2. View tariffs");
            System.out.println("3. View USSD menu");
            System.out.println("4. Buy number");
            System.out.println("0. Back");

            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            sc.nextLine();

            switch (c) {
                case 1 -> showAvailableNumbers();
                case 2 -> showTariffs();
                case 3 -> showUssdCodes();
                case 4 -> buyNumber();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }

    private void showAvailableNumbers() {
        List<PhoneNumber> list = userService.getAvailableNumbers();
        System.out.println("\nAvailable Numbers:");

        if (list.isEmpty()) {
            System.out.println("No free numbers available.");
            return;
        }

        for (PhoneNumber p : list) {
            System.out.println(p.getId() + " | " + p.getNumber() + " | " + p.getStatus());
        }
    }

    private void showTariffs() {
        List<Tariff> list = userService.getTariffs();
        System.out.println("\nTariffs:");

        if (list.isEmpty()) {
            System.out.println("No tariffs found.");
            return;
        }

        for (Tariff t : list) {
            System.out.println(
                    t.getId() + " | " + t.getName() +
                            " | " + t.getPrice() + " | " + t.getDescription()
            );
        }
    }

    private void showUssdCodes() {
        List<UssdCode> list = userService.getUssd();
        System.out.println("\nUSSD Codes:");

        if (list.isEmpty()) {
            System.out.println("USSD list is empty.");
            return;
        }

        for (UssdCode u : list) {
            System.out.println(u.getId() + " | " + u.getCode() + " | " + u.getDescription());
        }
    }

    private void buyNumber() {
        showAvailableNumbers();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number ID to buy: ");
        String id = sc.nextLine();

        PhoneNumber n = userService.buyNumber(id);

        if (n == null) {
            System.out.println("Failed to buy number. Maybe it's not free.");
        } else {
            System.out.println("Successfully bought number: " + n.getNumber());
        }
    }
}
