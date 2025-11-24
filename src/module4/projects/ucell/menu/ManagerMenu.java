package module4.projects.ucell.menu;


import module4.projects.ucell.domain.PhoneNumber;
import module4.projects.ucell.domain.UssdCode;
import module4.projects.ucell.service.admin.PhoneNumberService;
import module4.projects.ucell.service.admin.impl.PhoneNumberServiceImpl;
import module4.projects.ucell.service.manager.FreezeService;
import module4.projects.ucell.service.manager.UssdService;
import module4.projects.ucell.service.manager.impl.FreezeServiceImpl;
import module4.projects.ucell.service.manager.impl.UssdServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ManagerMenu {

    private final FreezeService freezeService;
    private final UssdService ussdService;
    private final PhoneNumberService phoneService;

    public ManagerMenu() {
        this.freezeService = new FreezeServiceImpl();
        this.ussdService = new UssdServiceImpl();
        this.phoneService = new PhoneNumberServiceImpl();
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n---- Manager Panel ----");
            System.out.println("1. Freeze/Unfreeze numbers");
            System.out.println("2. USSD CRUD");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> freezeMenu();
                case 2 -> ussdMenu();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Wrong option");
            }
        }
    }

    private void freezeMenu() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n--- Freeze Menu ---");
            System.out.println("1. List numbers");
            System.out.println("2. Freeze");
            System.out.println("3. Unfreeze");
            System.out.println("0. Back");
            System.out.print("Choose: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> listNumbers();
                case 2 -> freeze();
                case 3 -> unfreeze();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Wrong option.");
            }
        }
    }

    private void listNumbers() {
        List<PhoneNumber> list = phoneService.getAll();
        for (PhoneNumber p : list) {
            System.out.println(p.getId() + " | " + p.getNumber() + " | " + p.getStatus());
        }
    }

    private void freeze() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        String id = scanner.nextLine();
        if (freezeService.freeze(id)) System.out.println("Frozen!");
        else System.out.println("Failed");
    }

    private void unfreeze() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("id: ");
        String id = scanner.nextLine();
        if (freezeService.unfreeze(id)) System.out.println("Unfrozen");
        else System.out.println("Failed");
    }

    private void ussdMenu() {
        while (true) {
            System.out.println("\n--- Ussd Menu ---");
            System.out.println("1. List");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("0. Back");


            System.out.print("Choose: ");
            int option = new Scanner(System.in).nextInt();
            switch (option) {
                case 1 -> listUssd();
                case 2 -> addUssd();
                case 3 -> deleteUssd();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Wrong option!");
            }
        }
    }

    private void listUssd() {
        List<UssdCode> list = ussdService.getAll();
        for (UssdCode u : list) {
            System.out.println(u.getId() + " | " + u.getCode() + " | " + u.getDescription());
        }
    }

    private void addUssd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Code: ");
        String code = scanner.nextLine();
        System.out.print("Description: ");
        String desc = scanner.nextLine();
        ussdService.create(code, desc);
        System.out.println("USSD added!");
    }

    private void deleteUssd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        String id = scanner.nextLine();
        ussdService.delete(id);
        System.out.println("Deleted!");
    }
}
