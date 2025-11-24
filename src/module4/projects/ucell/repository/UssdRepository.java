package module4.projects.ucell.repository;

import module4.projects.ucell.domain.UssdCode;

import java.util.List;

public interface UssdRepository {
    List<UssdCode> getAll();

    UssdCode findById(String id);

    UssdCode findByCode(String code);

    void save(UssdCode code);

    void update(UssdCode code);

    boolean delete(String id);

    void writeToFile();

    void readFromFile();
}
