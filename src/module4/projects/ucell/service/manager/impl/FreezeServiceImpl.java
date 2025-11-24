package module4.projects.ucell.service.manager.impl;


import module4.projects.ucell.domain.PhoneNumber;
import module4.projects.ucell.enums.NumberStatus;
import module4.projects.ucell.repository.PhoneNumberRepository;
import module4.projects.ucell.repository.impl.PhoneNumberRepositoryImpl;
import module4.projects.ucell.service.manager.FreezeService;

import java.util.logging.Logger;

public class FreezeServiceImpl implements FreezeService {

    private final PhoneNumberRepository repo;
    private static final Logger log = Logger.getLogger(FreezeServiceImpl.class.getName());

    public FreezeServiceImpl() {
        this.repo = new PhoneNumberRepositoryImpl();
    }

    @Override
    public boolean freeze(String id) {
        PhoneNumber n = repo.findById(id);
        if (n == null) return false;

        n.setStatus(NumberStatus.FROZEN);
        repo.update(n);

        log.info("Number frozen: " + n.getNumber());
        return true;
    }

    @Override
    public boolean unfreeze(String id) {
        PhoneNumber n = repo.findById(id);
        if (n == null) return false;

        n.setStatus(NumberStatus.ACTIVE);
        repo.update(n);

        log.info("Number unfrozen: " + n.getNumber());
        return true;
    }
}
