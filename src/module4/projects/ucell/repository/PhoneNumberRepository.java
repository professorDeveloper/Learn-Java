package module4.projects.ucell.repository;

import module4.projects.ucell.domain.PhoneNumber;

import java.util.List;

public interface PhoneNumberRepository {

    List<PhoneNumber> getAll();

    PhoneNumber findById(String id);

    PhoneNumber findByNumber(String number);

    void save(PhoneNumber number);

    void update(PhoneNumber number);

    void delete(String id);

    void writeToFile();

    void readFromFile();
}
