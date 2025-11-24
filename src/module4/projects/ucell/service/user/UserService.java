package module4.projects.ucell.service.user;

import module4.projects.ucell.domain.PhoneNumber;
import module4.projects.ucell.domain.Tariff;
import module4.projects.ucell.domain.UssdCode;

import java.util.List;

public interface UserService {
    List<PhoneNumber> getAvailableNumbers();

    List<Tariff> getTariffs();

    List<UssdCode> getUssd();

    PhoneNumber buyNumber(String numberId);
}