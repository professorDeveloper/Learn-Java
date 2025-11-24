package module4.projects.ucell.service.manager.impl;


import module4.projects.ucell.domain.UssdCode;
import module4.projects.ucell.repository.UssdRepository;
import module4.projects.ucell.repository.impl.UssdRepositoryImpl;
import module4.projects.ucell.service.manager.UssdService;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

public class UssdServiceImpl implements UssdService {

    private final UssdRepository repo;
    private static final Logger log = Logger.getLogger(UssdServiceImpl.class.getName());

    public UssdServiceImpl() {
        this.repo = new UssdRepositoryImpl();
    }

    @Override
    public UssdCode create(String code, String desc) {
        UssdCode u = new UssdCode(UUID.randomUUID().toString(), code, desc);
        repo.save(u);

        log.info("ussd created: " + code);
        return u;
    }

    @Override
    public UssdCode update(UssdCode u) {
        repo.update(u);

        log.info("ussd Updated: " + u.getCode());
        return u;
    }

    @Override
    public boolean delete(String id) {
        boolean delete = repo.delete(id);
        if (delete) {
            System.out.println("Ussd deleted");
            log.info("ussd deleted: " + id);
        } else {
            System.out.println("Ussd not deleted");
            log.info("ussd id not deleted: " + id);
        }
        return delete;
    }

    @Override
    public List<UssdCode> getAll() {
        return repo.getAll();
    }
}
