package projects.quiz_app.backend.services;

import projects.quiz_app.backend.dtos.User;
import projects.quiz_app.backend.enums.Role;

public interface AuthService {
    User login(String username, String password);

    User register(String username, String password, Role role);

    boolean changePasscode(String username, String oldPasscode, String newPasscode);
}
