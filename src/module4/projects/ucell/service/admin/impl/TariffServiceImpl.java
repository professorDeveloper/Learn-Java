package module4.projects.ucell.service.admin.impl;


import module4.projects.ucell.domain.Tariff;
import module4.projects.ucell.repository.TariffRepository;
import module4.projects.ucell.repository.impl.TariffRepositoryImpl;
import module4.projects.ucell.service.admin.TariffService;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

public class TariffServiceImpl implements TariffService {

    private final TariffRepository repo;
    private static final Logger log = Logger.getLogger(TariffServiceImpl.class.getName());

    public TariffServiceImpl() {
        this.repo = new TariffRepositoryImpl();
    }

    @Override
    public Tariff create(String name, double price, String desc) {
        Tariff t = new Tariff(UUID.randomUUID().toString(), name, price, desc);
        repo.save(t);

        log.info("Tariff created: " + name);
        return t;
    }

    @Override
    public Tariff update(Tariff tariff) {
        boolean update = repo.update(tariff);
        if (!update) {
            System.out.println("Tariff not updated");
            return null;
        }
        else {
            System.out.println("Tariff updated");
            log.info("Tariff updated: " + tariff.getName());
        }
        return tariff;
    }

    @Override
    public boolean delete(String id) {
        boolean delete = repo.delete(id);
        if (delete) {
            System.out.println("Tariff deleted");
            log.warning("Tariff deleted id: " + id);

        } else {
            System.out.println("Tariff not deleted");
            log.warning("Tariff not deleted id: " + id);
        }
        return delete;
    }

    @Override
    public List<Tariff> getAll() {
        return repo.getAll();
    }
}
