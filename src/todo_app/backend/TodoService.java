package todo_app.backend;

public interface TodoService {
    Todo[] todos = new Todo[100];

    Todo create(Todo todo);

    void delete(String todoID);

    boolean update(Todo todo);

    Todo get(String todoID);

    Todo[] getAll();
}
