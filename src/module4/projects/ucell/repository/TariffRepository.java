package module4.projects.ucell.repository;

import module4.projects.ucell.domain.Tariff;

import java.util.List;

public interface TariffRepository {

    List<Tariff> getAll();

    Tariff findById(String id);

    Tariff findByName(String name);

    void save(Tariff tariff);

    boolean update(Tariff tariff);

    boolean delete(String id);

    void writeToFile();

    void readFromFile();
}
