package module_1_2.projects.quiz_app.backend.services;

import module_1_2.projects.quiz_app.backend.dtos.User;
import module_1_2.projects.quiz_app.backend.enums.Role;

public interface AuthService {
    User login(String username, String password);

    User register(String username, String password, Role role);

}
