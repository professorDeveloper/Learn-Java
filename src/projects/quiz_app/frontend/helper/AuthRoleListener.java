package projects.quiz_app.frontend.helper;

import projects.quiz_app.backend.enums.Role;

public interface AuthRoleListener {
    void onUserAuthenticated(Role role);
}
