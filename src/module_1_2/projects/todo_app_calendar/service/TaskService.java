package module_1_2.projects.todo_app_calendar.service;

import module_1_2.projects.todo_app_calendar.dto.Todo;

import java.util.List;

public interface TaskService {
    void add(Todo todo);
    void update(Todo todo);
    void delete(Todo todo);
    List<Todo> getAll();
    void startScheduler();
}
