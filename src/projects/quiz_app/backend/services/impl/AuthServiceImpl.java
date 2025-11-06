package projects.quiz_app.backend.services.impl;

import projects.quiz_app.backend.dtos.User;
import projects.quiz_app.backend.enums.Role;
import projects.quiz_app.backend.services.AuthService;

public class AuthServiceImpl implements AuthService {
    private final User[] users = new User[100];
    private int index = 0;


    @Override
    public User login(String username, String password) {
        User user = this.findUser(username);
        if (user != null && user.password().equals(password)) {
            return user;
        }
        return null;
    }

    @Override
    public User register(String username, String password, Role role) {
        var checkUser = findUser(username);
        if (checkUser == null) {
            User user = new User(username, password, role);
            this.users[this.index++] = user;
            return user;
        } else {
            return null;
        }
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
