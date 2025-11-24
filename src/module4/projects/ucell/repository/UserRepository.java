package module4.projects.ucell.repository;

import module4.projects.ucell.domain.User;

import java.util.List;

public interface UserRepository {

    List<User> getAll();

    User findById(String id);

    User findByEmail(String email);

    void save(User user);

    void update(User user);

    void delete(String id);

    void writeToFile();

    void readFromFile();
}
