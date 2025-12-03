package module3.lesson.set;

import java.util.Comparator;
import java.util.TreeSet;

record User(String name, String phone) {

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

class Task3 {
    public static void main(String[] args) {
        TreeSet<User> users = new TreeSet<>(Comparator.comparing(User::name).thenComparing(User::phone));

        users.add(new User("Soli", "+998901234569"));
        users.add(new User("Ali", "+998901234560"));
        users.add(new User("Ali", "+998901234222"));
        users.add(new User("Bekzod", "+998901234561"));

        System.out.println("Users sorted by name and phone:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
