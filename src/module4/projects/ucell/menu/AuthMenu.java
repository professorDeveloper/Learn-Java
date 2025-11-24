package module4.projects.ucell.menu;

import module4.projects.ucell.domain.User;
import module4.projects.ucell.dto.UserLoginDTO;
import module4.projects.ucell.dto.UserRegisterDTO;
import module4.projects.ucell.security.SessionContext;
import module4.projects.ucell.service.auth.AuthService;
import module4.projects.ucell.service.auth.impl.AuthServiceImpl;

import java.util.Scanner;

public class AuthMenu {
    private final AuthService authService;

    public AuthMenu() {
        this.authService = new AuthServiceImpl();
    }

    public void show() {
        while (true) {
            if (SessionContext.isLoggedIn()) {
                return;
            }

            System.out.println("\n=== Authentication ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("Choice: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> register();
                case 2 -> {
                    boolean ok = login();
                    if (ok) return;
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }

    private void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Register ---");
        System.out.print("Full name: ");
        String full = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Password: ");
        String pass = sc.nextLine();

        UserRegisterDTO dto = new UserRegisterDTO(full, email, pass);
        User user = authService.register(dto);

        if (user != null) {
            System.out.println("Registered: " + user.getEmail());
        }
    }

    private boolean login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Login ---");
        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Password: ");
        String pass = sc.nextLine();

        UserLoginDTO dto = new UserLoginDTO(email, pass);
        User user = authService.login(dto);
        if (user != null) {
            System.out.println("Welcome, " + user.getFullName());
        }
        return false;
    }
}
