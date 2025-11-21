package module4.projects.todo.service.imp;

import module4.projects.todo.dto.Todo;
import module4.projects.todo.service.TaskService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class TaskServiceImp implements TaskService {

    private final List<Todo> todoList = new ArrayList<>();

    @Override
    public void add(Todo todo) {
        todoList.add(todo);
    }

    @Override
    public void update(Todo todo) {
        int index = todoList.indexOf(todo);
        if (index != -1) {
            todoList.set(index, todo);
        }
    }

    @Override
    public void delete(Todo todo) {
        todoList.remove(todo);
    }

    @Override
    public List<Todo> getAll() {
        return todoList;
    }

    @Override
    public void startScheduler() {
        System.out.println("Task scheduler started...");
        CompletableFuture.runAsync(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (Exception ignored) {
                }
                LocalDateTime now = LocalDateTime.now();
                for (Todo t : todoList) {
                    if (!t.isCompleted() && t.getTaskTime().isBefore(now)) {
                        System.out.println();
                        System.out.println("Task Time: " + t.getTitle());
                        t.setCompleted(true);
                    }
                }
            }
        });
    }
}
