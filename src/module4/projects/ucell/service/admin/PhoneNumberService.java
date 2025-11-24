package module4.projects.ucell.service.admin;

import module4.projects.ucell.domain.PhoneNumber;

import java.util.List;

public interface PhoneNumberService {
    PhoneNumber create(String number);

    PhoneNumber update(PhoneNumber pn);

    boolean delete(String id);

    List<PhoneNumber> getAll();
}