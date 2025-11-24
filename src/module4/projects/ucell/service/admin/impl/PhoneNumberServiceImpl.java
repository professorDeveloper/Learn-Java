package module4.projects.ucell.service.admin.impl;


import module4.projects.ucell.domain.PhoneNumber;
import module4.projects.ucell.enums.NumberStatus;
import module4.projects.ucell.logging.LoggingService;
import module4.projects.ucell.repository.PhoneNumberRepository;
import module4.projects.ucell.repository.impl.PhoneNumberRepositoryImpl;
import module4.projects.ucell.service.admin.PhoneNumberService;
import module4.projects.ucell.utils.RegexUtils;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

public class PhoneNumberServiceImpl implements PhoneNumberService {

    private final PhoneNumberRepository repo;

    public PhoneNumberServiceImpl() {
        this.repo = new PhoneNumberRepositoryImpl();
    }

    @Override
    public PhoneNumber create(String number) {

        if (!RegexUtils.isValidPhone(number)) {
            throw new RuntimeException("Invalid phone format. Should be 93xxxxxxx or 94xxxxxxx");
        }

        if (repo.findByNumber(number) != null) {
            throw new RuntimeException("This phone number already exists");
        }

        PhoneNumber p = new PhoneNumber(
                UUID.randomUUID().toString(),
                number,
                NumberStatus.FREE,
                null
        );

        repo.save(p);
        LoggingService.logger.info("Phone number created: " + number);

        return p;
    }

    @Override
    public PhoneNumber update(PhoneNumber pn) {
        repo.update(pn);
        LoggingService.logger.info("Phone number updated: " + pn.getNumber());
        return pn;
    }

    @Override
    public boolean delete(String id) {
        repo.delete(id);
        LoggingService.logger.warning("Phone number deleted: " + id);
        return true;
    }

    @Override
    public List<PhoneNumber> getAll() {
        return repo.getAll();
    }
}
