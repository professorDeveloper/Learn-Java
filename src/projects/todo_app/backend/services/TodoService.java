package projects.todo_app.backend.services;

import projects.todo_app.backend.domains.Todo;
import projects.todo_app.backend.dtos.TodoDTO;

public interface TodoService {
    Todo[] todos = new Todo[100];
    Todo create(Todo todo);

    boolean delete(String todoID);

    boolean update(TodoDTO todo);

    Todo get(String todoID);

    Todo[] getAll();
}
