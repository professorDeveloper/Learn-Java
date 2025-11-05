package projects.quiz_app.backend.services.impl;

import projects.quiz_app.backend.dtos.User;
import projects.quiz_app.backend.enums.Role;
import projects.quiz_app.backend.services.UserService;

public class UserServiceImpl implements UserService {
    private final User[] users = new User[100];
    private int index = 0;

    @Override
    public boolean login(String username, String password) {

        return false;
    }

    @Override
    public boolean register(String username, String password, Role role) {
        return false;
    }

    @Override
    public boolean changePasscode(String username, String oldPasscode, String newPasscode) {
        return false;
    }

    private User findUser(String username) {
        for (int i = 0; i < index; i++) {
            if (users[i].username().equals(username)) {
                return users[i];
            }
        }
        return null;
    }
}
