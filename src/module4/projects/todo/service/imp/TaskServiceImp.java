package module4.projects.todo.service.imp;

import module4.projects.todo.dto.Todo;
import module4.projects.todo.service.TaskService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Logger;

public class TaskServiceImp implements TaskService {

    private static final Logger logger = Logger.getLogger(TaskServiceImp.class.getName());

    private final List<Todo> todoList = new ArrayList<>();

    @Override
    public void add(Todo todo) {
        todoList.add(todo);
        logger.info("Added new todo: " + todo.getTitle());
    }

    @Override
    public void update(Todo todo) {
        int index = todoList.indexOf(todo);
        if (index != -1) {
            todoList.set(index, todo);
            logger.info("Updated todo: " + todo.getTitle());
        } else {
            logger.warning("Todo not found for update: " + todo.getTitle());
        }
    }

    @Override
    public void delete(Todo todo) {
        todoList.remove(todo);
        logger.info("Deleted todo: " + todo.getTitle());
    }


    @Override
    public List<Todo> getAll() {
        logger.info("Fetched all todos. Count = " + todoList.size());
        return todoList;
    }

    @Override
    public void startScheduler() {
        logger.info("Scheduler started ...");
        CompletableFuture.runAsync(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (Exception ignored) {
                }
                LocalDateTime now = LocalDateTime.now();
                for (Todo t : todoList) {
                    if (!t.isCompleted() && t.getTaskTime().isBefore(now)) {
                        logger.warning("TASK TIME REACHED: " + t.getTitle());
                        System.out.println("\nTask Time: " + t.getTitle());
                        t.setCompleted(true);
                    }
                }
            }
        });
    }
}
