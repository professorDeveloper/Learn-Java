package todo_app.backend;

public class TodoServiceImpl implements TodoService {
    @Override
    public Todo create(Todo todo) {
        return null;
    }

    @Override
    public void delete(String todoID) {

    }

    @Override
    public boolean update(Todo todo) {
        return false;
    }

    @Override
    public Todo get(String todoID) {
        return null;
    }

    @Override
    public Todo[] getAll() {
        return todos;
    }
}
