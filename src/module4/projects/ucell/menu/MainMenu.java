package module4.projects.ucell.menu;


import module4.projects.ucell.domain.User;
import module4.projects.ucell.security.SessionContext;

import java.util.Scanner;

public class MainMenu {

    private final AuthMenu authMenu;
    private final SuperAdminMenu superAdminMenu;
    private final AdminMenu adminMenu;
    private final ManagerMenu managerMenu;
    private final UserMenu userMenu;

    public MainMenu(AuthMenu authMenu,
                    SuperAdminMenu superAdminMenu,
                    AdminMenu adminMenu,
                    ManagerMenu managerMenu,
                    UserMenu userMenu) {

        this.authMenu = authMenu;
        this.superAdminMenu = superAdminMenu;
        this.adminMenu = adminMenu;
        this.managerMenu = managerMenu;
        this.userMenu = userMenu;
    }

    public void start() {

        while (true) {

            if (!SessionContext.isLoggedIn()) {
                System.out.println("\n=== Ucell App ===");
                System.out.println("1. Authentication");
                System.out.println("0. Exit");
                Scanner sc = new Scanner(System.in);
                System.out.print("Choice:");
                int option = sc.nextInt();

                if (option == 1) {
                    authMenu.show();
                } else if (option == 0) {
                    System.out.println("System closed.");
                    return;
                } else {
                    System.out.println("Invalid option");
                }

                continue;
            }

            User user = SessionContext.getUser();
            System.out.println("\nLogged in as: " + user.getEmail() + " | ROLE: " + user.getRole());

            switch (user.getRole()) {

                case SUPER_ADMIN -> superAdminMenu.show();
                case ADMIN -> adminMenu.show();
                case MANAGER -> managerMenu.show();
                case USER -> userMenu.show();

                default -> System.out.println("Unknown role");
            }
        }
    }
}
