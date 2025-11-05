package todo_app.frontend;

import todo_app.backend.Priority;
import todo_app.backend.Todo;

public class Web {
    public static void main(String[] args) {
        Todo todo = Todo.builder().setTitle("Watching movies").setPriority(Priority.HIGH).build();
        System.out.println(todo);
    }
}
