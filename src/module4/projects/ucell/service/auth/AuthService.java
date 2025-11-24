package module4.projects.ucell.service.auth;

import module4.projects.ucell.domain.User;
import module4.projects.ucell.dto.UserLoginDTO;
import module4.projects.ucell.dto.UserRegisterDTO;

public interface AuthService {

    User register(UserRegisterDTO dto);

    User login(UserLoginDTO dto);

    boolean logout();
}