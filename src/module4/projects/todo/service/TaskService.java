package module4.projects.todo.service;

import module4.projects.todo.dto.Todo;

import java.util.List;

public interface TaskService {
    void add(Todo todo);
    void update(Todo todo);
    void delete(Todo todo);
    List<Todo> getAll();
    void startScheduler();
}
