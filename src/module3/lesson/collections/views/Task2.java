package module3.lesson.collections.views;

import java.util.ArrayList;

class User {
    String name;
    String phone;
    Role role;

    public User(String name, String phone, Role role) {
        this.name = name;
        this.phone = phone;
        this.role = role;
    }
}

enum Role {
    FATHER, MOTHER, CHILD
}

public class Task2 {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("John", "Azamov", Role.FATHER));
        users.add(new User("Jane", "Azamov", Role.MOTHER));
        users.add(new User("Bob", "Azamov", Role.CHILD));

        ArrayList<User> shallowCopies = new ArrayList<User>();
        shallowCopies.addAll(users);

        ArrayList<User> deepCopies = new ArrayList<User>();
        for (User user : users) {
            deepCopies.add(new User(user.name, user.phone, user.role));
        }

    }
}
