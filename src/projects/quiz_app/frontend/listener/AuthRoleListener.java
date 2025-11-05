package projects.quiz_app.frontend.listener;

import projects.quiz_app.backend.enums.Role;

public interface AuthRoleListener {
    void onUserAuthenticated(Role role);
}
