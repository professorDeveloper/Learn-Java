package projects.quiz_app.frontend.helper;

import projects.quiz_app.backend.dtos.User;
import projects.quiz_app.backend.enums.Role;

public interface AuthRoleListener {
    void onUserAuthenticated(User user);
}
