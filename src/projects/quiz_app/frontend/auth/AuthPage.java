package projects.quiz_app.frontend.auth;

import projects.quiz_app.backend.enums.Role;
import projects.quiz_app.backend.services.UserService;
import projects.quiz_app.backend.services.impl.UserServiceImpl;
import projects.quiz_app.frontend.listener.AuthRoleListener;

import java.util.Scanner;

public class AuthPage {
    private final UserService userService = new UserServiceImpl();
    private AuthRoleListener listener;

    public void onUserRoleListener(AuthRoleListener listener) {
        this.listener = listener;
    }

    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username:");
        String username = scanner.nextLine();
        System.out.print("Enter Password:");
        String password = scanner.nextLine();
        var result = userService.register(username, password, Role.STUDENT);
        if (result) {
            System.out.println("User registered successfully !");
            listener.onUserAuthenticated(Role.STUDENT);
        } else {
            System.out.println("Username already exists !");
        }
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username:");
        String username = scanner.nextLine();
        System.out.print("Enter Password:");
        String password = scanner.nextLine();
        var result = userService.login(username, password);
        switch (result) {
            case STUDENT, TEACHER -> {
                listener.onUserAuthenticated(result);
            }
            case NONE -> {
                System.out.println("Username or password wrong !");
            }
            default -> {

            }
        }
    }

}
