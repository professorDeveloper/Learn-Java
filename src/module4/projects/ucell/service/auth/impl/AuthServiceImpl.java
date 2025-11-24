package module4.projects.ucell.service.auth.impl;


import module4.projects.ucell.domain.User;
import module4.projects.ucell.dto.UserLoginDTO;
import module4.projects.ucell.dto.UserRegisterDTO;
import module4.projects.ucell.enums.RoleEnum;
import module4.projects.ucell.logging.LoggingService;
import module4.projects.ucell.repository.UserRepository;
import module4.projects.ucell.repository.impl.UserRepositoryImpl;
import module4.projects.ucell.security.SessionContext;
import module4.projects.ucell.service.auth.AuthService;
import module4.projects.ucell.utils.RegexUtils;

import java.time.LocalDateTime;
import java.util.UUID;

public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepo;

    public AuthServiceImpl() {
        this.userRepo = new UserRepositoryImpl();
    }

    @Override
    public User register(UserRegisterDTO dto) {

        try {
            if (!RegexUtils.isValidEmail(dto.getEmail()))
                throw new RuntimeException("Invalid email!");

            if (!RegexUtils.isValidPassword(dto.getPassword()))
                throw new RuntimeException("Invalid password Password should be at least 6 characters!");

            if (userRepo.findByEmail(dto.getEmail()) != null)
                throw new RuntimeException("Email already used!");

            User user = new User(
                    UUID.randomUUID().toString(),
                    dto.getFullName(),
                    dto.getEmail(),
                    dto.getPassword(),
                    RoleEnum.USER,
                    LocalDateTime.now()
            );

            userRepo.save(user);
            return user;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggingService.logger.warning(e.getMessage());
            return null;
        }
    }

    @Override
    public User login(UserLoginDTO dto) {

        User user = userRepo.findByEmail(dto.getEmail());

        if (user == null || !user.getPassword().equals(dto.getPassword()))
            throw new RuntimeException("Invalid credentials!");

        SessionContext.setUser(user);
        return user;
    }

    @Override
    public boolean logout() {
        SessionContext.clear();
        return true;
    }
}
