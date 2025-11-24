package module4.projects.ucell.app;

import module4.projects.ucell.config.LoggerConfig;
import module4.projects.ucell.domain.User;
import module4.projects.ucell.enums.RoleEnum;
import module4.projects.ucell.logging.LoggingService;
import module4.projects.ucell.menu.*;
import module4.projects.ucell.repository.UserRepository;
import module4.projects.ucell.repository.impl.UserRepositoryImpl;
import module4.projects.ucell.service.admin.PhoneNumberService;
import module4.projects.ucell.service.admin.TariffService;
import module4.projects.ucell.service.admin.impl.PhoneNumberServiceImpl;
import module4.projects.ucell.service.admin.impl.TariffServiceImpl;
import module4.projects.ucell.service.auth.AuthService;
import module4.projects.ucell.service.auth.impl.AuthServiceImpl;
import module4.projects.ucell.service.manager.FreezeService;
import module4.projects.ucell.service.manager.UssdService;
import module4.projects.ucell.service.manager.impl.FreezeServiceImpl;
import module4.projects.ucell.service.manager.impl.UssdServiceImpl;
import module4.projects.ucell.service.user.UserService;
import module4.projects.ucell.service.user.impl.UserServiceImpl;

import java.time.LocalDateTime;
import java.util.UUID;

public class UcellApplication {
    public static void main(String[] args) {

        LoggerConfig.load();

        AuthMenu authMenu = new AuthMenu();
        SuperAdminMenu superAdminMenu = new SuperAdminMenu();
        AdminMenu adminMenu = new AdminMenu();
        ManagerMenu managerMenu = new ManagerMenu();
        UserMenu userMenu = new UserMenu();
        UserRepository userRepo = new UserRepositoryImpl();
        boolean hasSuperAdmin = isHasSuperAdmin(userRepo);

        if (!hasSuperAdmin) {
            User sa = new User(
                    UUID.randomUUID().toString(),
                    "Super Admin",
                    "super@ucell.uz",
                    "super123",
                    RoleEnum.SUPER_ADMIN,
                    LocalDateTime.now()
            );
            userRepo.save(sa);
            LoggingService.logger.info("Default SUPER_ADMIN created.");
            System.out.println("Default SUPER_ADMIN created: super@ucell.uz : super123");
        }
        MainMenu mainMenu = new MainMenu(
                authMenu,
                superAdminMenu,
                adminMenu,
                managerMenu,
                userMenu
        );

        mainMenu.start();
    }

    private static boolean isHasSuperAdmin(UserRepository userRepo) {
        var isHasSuperAdmin = false;
        for (User u : userRepo.getAll()) {
            if (u.getRole() == RoleEnum.SUPER_ADMIN) {
                isHasSuperAdmin = true;
                break;
            }
        }
        return isHasSuperAdmin;
    }
}
