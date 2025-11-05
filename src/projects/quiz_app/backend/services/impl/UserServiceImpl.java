package projects.quiz_app.backend.services.impl;

import projects.quiz_app.backend.dtos.User;
import projects.quiz_app.backend.enums.Role;
import projects.quiz_app.backend.services.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class UserServiceImpl implements UserService {
    private final User[] users = new User[100];
    private int index = 0;


    @Override
    public Role login(String username, String password) {
        User user = this.findUser(username);
        if (user != null && user.password().equals(password)) {
            return user.role();
        }
        return Role.NONE;
    }

    @Override
    public boolean register(String username, String password, Role role) {
        var checkUser = findUser(username);
        if (checkUser == null) {
            User user = new User(username, password, Role.STUDENT);
            this.users[this.index++] = user;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean changePasscode(String username, String oldPasscode, String newPasscode) {
        var checkUser = this.findUser(username);
        if (checkUser != null && Objects.equals(oldPasscode, checkUser.password())) {
            var getUserIndex = this.getUserIndex(username);
            users[getUserIndex] = checkUser.copy(newPasscode);
            return true;
        }
        return false;
    }

    private int getUserIndex(String username) {
        for (int i = 0; i < index; i++) {
            if (username.equals(users[i].username())) {
                return i;
            }
        }
        return -1;
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
