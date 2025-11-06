package projects.quiz_app.frontend.auth;

import projects.quiz_app.backend.enums.Role;
import projects.quiz_app.backend.services.AuthService;
import projects.quiz_app.backend.services.impl.AuthServiceImpl;
import projects.quiz_app.frontend.helper.AuthRoleListener;

import java.util.Scanner;

import static projects.quiz_app.backend.enums.Role.TEACHER;

public class AuthPage {
    private final AuthService authService = new AuthServiceImpl();
    private AuthRoleListener listener;

    public void initTeacher() {
        authService.register("teacher", "teacher", TEACHER);

    }

    public void onUserRoleListener(AuthRoleListener listener) {
        this.listener = listener;
    }

    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username:");
        String username = scanner.nextLine();
        System.out.print("Enter Password:");
        String password = scanner.nextLine();
        var result = authService.register(username, password, Role.STUDENT);
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
        var result = authService.login(username, password);
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
