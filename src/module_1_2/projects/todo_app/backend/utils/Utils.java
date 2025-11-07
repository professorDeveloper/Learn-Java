package module_1_2.projects.todo_app.backend.utils;

import java.util.UUID;

public class Utils {
    public static String generateUniqueID() {
        return UUID.randomUUID().toString();
    }
}
