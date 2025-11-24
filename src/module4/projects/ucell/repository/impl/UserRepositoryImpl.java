package module4.projects.ucell.repository.impl;

import module4.projects.ucell.domain.User;
import module4.projects.ucell.repository.UserRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private final String FILE = "users.txt";
    private List<User> users = new ArrayList<>();

    public UserRepositoryImpl() {
        readFromFile();
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User findById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User findByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void save(User user) {
        users.add(user);
        writeToFile();
    }

    @Override
    public void update(User updated) {
        writeToFile();
    }

    @Override
    public void delete(String id) {
        users.removeIf(u -> u.getId().equals(id));
        writeToFile();
    }

    @Override
    public void writeToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(users);
        } catch (Exception e) {

        }
    }

    @Override
    public void readFromFile() {
        File file = new File(FILE);
        if (!file.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            List<User> users1 = (List<User>) ois.readObject();
            users = users1;
        } catch (Exception e) {

        }
    }
}
