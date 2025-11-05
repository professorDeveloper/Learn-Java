package projects.quiz_app.frontend.app;

import projects.quiz_app.backend.enums.Role;
import projects.quiz_app.frontend.auth.AuthPage;
import projects.quiz_app.frontend.helper.LogoutListener;
import projects.quiz_app.frontend.student.StudentPage;
import projects.quiz_app.frontend.teacher.TeacherPage;

import java.util.Scanner;

import static projects.quiz_app.frontend.helper.UiHelper.*;

public class Application {
    private final AuthPage authPage = new AuthPage();
    private final StudentPage studentPage = new StudentPage();
    private final TeacherPage teacherPage = new TeacherPage();
    private final Runnable[] logRegActions = {authPage::login, authPage::register, () -> System.exit(0)};
    private final Runnable[] teacherActions = {teacherPage::createQuiz, teacherPage::deleteQuiz, teacherPage::updateQuiz, teacherPage::listQuiz, this::systemLogout};
    private final Runnable[] studentActions = {studentPage::startQuiz, studentPage::viewRankings, this::systemLogout};

    private LogoutListener listener;
    private final Scanner scanner = new Scanner(System.in);

    public void runApp() {
        authPage.onUserRoleListener(this::enterDashboard);
        while (true) {
            displayMenu(logRegMenus);
            chooseAction(null, logRegActions);
        }
    }

    private void studentDashboard(Role role) {
        var loggedOut = new boolean[]{false};
        listener = () -> {
            System.out.println("Logout successfully !\n");
            loggedOut[0] = true;
        };
        while (!loggedOut[0]) {
            displayMenu(studentMenus);
            chooseAction(role, studentActions);
        }
    }

    private void teacherDashboard(Role role) {
        var loggedOut = new boolean[]{false};
        listener = () -> {
            System.out.println("Logout successfully !\n");
            loggedOut[0] = true;
        };
        while (!loggedOut[0]) {
            displayMenu(teacherMenus);
            chooseAction(role, teacherActions);
        }
    }

    private void enterDashboard(Role role) {
        if (role == Role.TEACHER) teacherDashboard(role);
        else if (role == Role.STUDENT) studentDashboard(role);
    }

    private void chooseAction(Role role, Runnable[] actions) {
        try {
            System.out.println("---------------------------------");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(scanner.nextLine().trim());
            actions[choice - 1].run();
        } catch (Exception e) {
            System.out.println("Invalid choice !");
        }
    }

    private void systemLogout() {
        if (listener != null) listener.logoutCalled();
    }
}