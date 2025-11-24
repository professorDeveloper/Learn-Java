package module4.projects.ucell.service.user.impl;


import module4.projects.ucell.domain.PhoneNumber;
import module4.projects.ucell.domain.Tariff;
import module4.projects.ucell.domain.UssdCode;
import module4.projects.ucell.enums.NumberStatus;
import module4.projects.ucell.repository.PhoneNumberRepository;
import module4.projects.ucell.repository.TariffRepository;
import module4.projects.ucell.repository.UssdRepository;
import module4.projects.ucell.repository.impl.PhoneNumberRepositoryImpl;
import module4.projects.ucell.repository.impl.TariffRepositoryImpl;
import module4.projects.ucell.repository.impl.UssdRepositoryImpl;
import module4.projects.ucell.security.SessionContext;
import module4.projects.ucell.service.user.UserService;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private final PhoneNumberRepository phoneRepo;
    private final TariffRepository tariffRepo;
    private final UssdRepository ussdRepo;
    private static final Logger log = Logger.getLogger(UserServiceImpl.class.getName());

    public UserServiceImpl() {
        this.phoneRepo = new PhoneNumberRepositoryImpl();
        this.tariffRepo = new TariffRepositoryImpl();
        this.ussdRepo = new UssdRepositoryImpl();
    }

    @Override
    public List<PhoneNumber> getAvailableNumbers() {
        return phoneRepo.getAll().stream()
                .filter(n -> n.getStatus() == NumberStatus.FREE)
                .collect(Collectors.toList());
    }

    @Override
    public List<Tariff> getTariffs() {
        return tariffRepo.getAll();
    }

    @Override
    public List<UssdCode> getUssd() {
        return ussdRepo.getAll();
    }

    @Override
    public PhoneNumber buyNumber(String id) {

        PhoneNumber n = phoneRepo.findById(id);

        if (n == null || n.getStatus() != NumberStatus.FREE)
            return null;

        n.setOwnerId(SessionContext.getUser().getId());
        n.setStatus(NumberStatus.ACTIVE);
        phoneRepo.update(n);

        log.info("User " + SessionContext.getUser().getEmail() +
                " bought number: " + n.getNumber());

        return n;
    }
}
