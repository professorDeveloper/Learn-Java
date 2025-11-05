package projects.quiz_app.frontend.app;

import projects.quiz_app.backend.enums.Role;
import projects.quiz_app.backend.services.UserService;
import projects.quiz_app.backend.services.impl.UserServiceImpl;
import projects.quiz_app.frontend.auth.AuthPage;
import projects.quiz_app.frontend.student.StudentPage;
import projects.quiz_app.frontend.teacher.TeacherPage;

import java.util.Scanner;


public class Application {
    private final AuthPage authPage = new AuthPage();
    private final StudentPage studentPage = new StudentPage();
    private final TeacherPage teacherPage = new TeacherPage();
    private final String[] logRegMenus = new String[]{"1 -> Login", "2 -> Register", "3 -> Exit"};
    private final String[] teacherMenus = new String[]{"1-> Create Quiz", "2 -> Delete Quiz", "3 -> Update Quiz", "4 -> List Quiz", "5 -> Exit"};
    private final String[] studentMenus = new String[]{"1-> Start Quiz", "2 -> View Rankings", "3 -> Exit"};
    private final Runnable[] logRegActions = new Runnable[]{authPage::login, authPage::register, this::systemExit};

    private void systemExit() {
        System.out.println("Exited..");
        System.exit(0);
    }

    private final Runnable[] teacherActions = new Runnable[]{teacherPage::createQuiz, teacherPage::deleteQuiz, teacherPage::updateQuiz, teacherPage::listQuiz, this::systemExit};
    private final Runnable[] studentActions = new Runnable[]{studentPage::startQuiz, studentPage::viewRankings, this::systemExit};

    public void runApp() {
        for (;;) {
            displayMenu(logRegMenus);
            chooseActions(null);
            authPage.onUserRoleListener(this::listenerDashboard);
        }
    }


    private void studentDashboard(Role role) {
        for (;;) {

            displayMenu(studentMenus);
            chooseActions(role);
        }
    }

    private void teacherDashboard(Role role) {
        for (;;) {
            displayMenu(teacherMenus);
            chooseActions(role);

        }
    }

    private void listenerDashboard(Role role) {
        if (role.equals(Role.TEACHER)) {
            teacherDashboard(role);
        } else if (role.equals(Role.STUDENT)) {
            studentDashboard(role);
        }
    }

    private void chooseActions(Role role) {
        try{
            if (role == null) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Choose:");
                String choose = scanner.nextLine();
                logRegActions[Integer.parseInt(choose) - 1].run();
            } else {
                if (role.equals(Role.TEACHER)) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Choose:");
                    String choose = scanner.nextLine();
                    teacherActions[Integer.parseInt(choose) - 1].run();
                } else if (role.equals(Role.STUDENT)) {
                    System.out.println("....");

                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid choice !");
        }
    }


    private void displayMenu(String[] menus) {
        for (String msg : menus) {
            System.out.println(msg);
        }
    }

}
