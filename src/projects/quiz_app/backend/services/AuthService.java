package projects.quiz_app.backend.services;

import projects.quiz_app.backend.enums.Role;

public interface AuthService {
    Role login(String username, String password);

    boolean register(String username, String password, Role role);

    boolean changePasscode(String username, String oldPasscode, String newPasscode);
}
