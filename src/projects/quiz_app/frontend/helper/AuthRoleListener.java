package projects.quiz_app.frontend.helper;

import projects.quiz_app.backend.dtos.User;

public interface AuthRoleListener {
    void onUserAuthenticated(User user);
}
