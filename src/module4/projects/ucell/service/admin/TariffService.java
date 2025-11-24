package module4.projects.ucell.service.admin;

import module4.projects.ucell.domain.Tariff;

import java.util.List;

public interface TariffService {
    Tariff create(String name, double price, String description);

    Tariff update(Tariff tariff);

    boolean delete(String id);

    List<Tariff> getAll();
}