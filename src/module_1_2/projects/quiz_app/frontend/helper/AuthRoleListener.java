package module_1_2.projects.quiz_app.frontend.helper;

import module_1_2.projects.quiz_app.backend.dtos.User;

public interface AuthRoleListener {
    void onUserAuthenticated(User user);
}
