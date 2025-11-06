package projects.quiz_app.frontend.app;

import projects.quiz_app.backend.dtos.User;
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
    private final Runnable[] studentActions = {studentPage::startQuiz, studentPage::viewHistory, this::systemLogout};

    private LogoutListener listener;
    private final Scanner scanner = new Scanner(System.in);


    public Application() {
        authPage.initTeacher();
    }

    public void runApp() {
        System.out.println("Welcome to the Quiz App!");
        authPage.onUserRoleListener(this::enterDashboard);
        while (true) {
            displayMenu(logRegMenus);
            chooseAction(logRegActions);
        }
    }

    private void studentDashboard() {
        var loggedOut = new boolean[]{false};
        listener = () -> {
            System.out.println("Logout successfully !\n");
            loggedOut[0] = true;
        };
        while (!loggedOut[0]) {
            displayMenu(studentMenus);
            chooseAction(studentActions);
        }
    }

    private void teacherDashboard() {
        var loggedOut = new boolean[]{false};
        listener = () -> {
            System.out.println("Logout successfully !\n");
            loggedOut[0] = true;
        };
        while (!loggedOut[0]) {
            displayMenu(teacherMenus);
            chooseAction(teacherActions);
        }
    }

    private void enterDashboard(User user) {
        if (user.role() == Role.TEACHER) teacherDashboard();
        else if (user.role() == Role.STUDENT) {
            studentPage.setUser(user);
            studentDashboard();
        }
    }

    private void chooseAction(Runnable[] actions) {
        try {
            System.out.println("---------------------------------");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(scanner.nextLine().trim());
            actions[choice - 1].run();
        } catch (Exception e) {
            System.out.println("Something went wrong e:" + e.getMessage());
        }
    }

    private void systemLogout() {
        if (listener != null) listener.logoutCalled();
    }
}