package projects.quiz_app.frontend.helper;

import java.util.Arrays;

public class UiHelper {
    public static final String[] logRegMenus = new String[]{"1 -> Login", "2 -> Register", "3 -> Exit"};
    public static final String[] teacherMenus = new String[]{"1-> Create Quiz", "2 -> Delete Quiz", "3 -> Update Quiz", "4 -> List Quiz", "5 -> Logout"};
    public static final String[] studentMenus = new String[]{"1-> Start Quiz", "2 -> View History", "3 -> Logut"};

    public static void displayMenu(String[] menus) {
        for (String msg : menus) {
            System.out.println(msg);
        }
    }


}
