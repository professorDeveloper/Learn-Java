package module4.time_date.tasks.task5.service;

import module4.time_date.tasks.task5.dto.Todo;

import java.util.List;

public interface TaskService {
    void add(Todo todo);
    void update(Todo todo);
    void delete(Todo todo);
    List<Todo> getAll();
    void startScheduler();
}
