package module4.projects.ucell.service.manager;

import module4.projects.ucell.domain.UssdCode;

import java.util.List;

public interface UssdService {
    UssdCode create(String code, String desc);

    UssdCode update(UssdCode ussd);

    boolean delete(String id);

    List<UssdCode> getAll();
}