package module3.lesson.collections.views;

import java.util.ArrayList;
import java.util.List;

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
        /*User classi name, phone, Role Enum fieldlaridan iborat
        Role Enum classi -> FATHER, MOTHER ,CHILD qiymatlardan iborat
        2 ta list yarating shallowCopies and deepCopies degan
        shallowCopies ni user clasining shallow copy lari bilan to'ldiring
        deepCopies ni user clasining deep copy lari bilan to'ldiring
        ListIterator dan foydanalib 2 tomonlama aylanib elementlarni ekranga chizing
*/
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
