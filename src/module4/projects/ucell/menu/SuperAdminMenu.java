package module4.projects.ucell.menu;


import module4.projects.ucell.domain.User;
import module4.projects.ucell.enums.RoleEnum;
import module4.projects.ucell.repository.UserRepository;
import module4.projects.ucell.repository.impl.UserRepositoryImpl;
import module4.projects.ucell.security.SessionContext;

import java.util.List;
import java.util.Scanner;

public class SuperAdminMenu {

    private final UserRepository userRepo;

    public SuperAdminMenu() {
        this.userRepo = new UserRepositoryImpl();
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==== Super Admin ====");
            System.out.println("1. List all users");
            System.out.println("2. Change user role");
            System.out.println("0. Back");
            System.out.print("Choice");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> listUsers();
                case 2 -> changeRole();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Wrong option.");
            }
        }
    }

    private void listUsers() {
        System.out.println("--- Users List ---");
        List<User> users = userRepo.getAll();

        for (User u : users) {
            if (!SessionContext.getUser().getId().equals(u.getId())) {
                System.out.println(u.getFullName() + " | " + u.getEmail() + " | " + u.getRole());
            }
        }
    }

    private void changeRole() {
        listUsers();
        Scanner scanner = new Scanner(System.in);
        System.out.print("User id:");
        String id = scanner.nextLine();

        User u = userRepo.findById(id);
        if (u == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("\nChoose new role:");
        System.out.println("1.Super Admin");
        System.out.println("2.Admin");
        System.out.println("3.Manager");
        System.out.println("4.User");
        System.out.print("Role:");
        int r = scanner.nextInt();
        RoleEnum newRole = switch (r) {
            case 1 -> RoleEnum.SUPER_ADMIN;
            case 2 -> RoleEnum.ADMIN;
            case 3 -> RoleEnum.MANAGER;
            case 4 -> RoleEnum.USER;
            default -> null;
        };

        if (newRole == null) {
            System.out.println("Wrong role.");
            return;
        }

        u.setRole(newRole);
        userRepo.update(u);
        System.out.println("Role changed to " + newRole);
    }
}
