package todo_app.backend.services.impl;

import todo_app.backend.domains.Todo;
import todo_app.backend.dtos.TodoDTO;
import todo_app.backend.utils.Utils;
import todo_app.backend.services.TodoService;

import java.util.Arrays;

public class TodoServiceImpl implements TodoService {
    private int index = 0;

    @Override
    public Todo create(Todo todo) {
        todo.setId(Utils.generateUniqueID());
        todos[index++] = todo;
        return todo;
    }

    @Override
    public boolean delete(String todoID) {
        int deleteIndex = getTodoDeleteIndex(todoID);
        if (deleteIndex == -1) {
            return false;
        }
        for (int i = deleteIndex; i < index; i++) {
            todos[i] = todos[i + 1];
        }
        index--;
        return true;
    }

    @Override
    public boolean update(TodoDTO dto) {
        String todoId = dto.id();
        int todoIndex = getTodoDeleteIndex(todoId);
        if (todoIndex != -1) {
            Todo todoUp = todos[todoIndex];
            todoUp.setTitle(dto.title());
            todoUp.setCategory(dto.category());
            todoUp.setPriority(dto.priority());
            todoUp.setCompleted(dto.isCompleted());

            todos[todoIndex] = todoUp;
            return true;
        }
        return false;

    }


    @Override
    public Todo get(String todoID) {
        int todoIndex = getTodoDeleteIndex(todoID);
        if (todoIndex != -1) {
            return todos[todoIndex];
        }
        return null;
    }


    @Override
    public Todo[] getAll() {
        return Arrays.copyOf(todos, index);
    }

    private int getTodoDeleteIndex(String todoID) {
        int deleteIndex = -1;
        for (int i = 0; i < todos.length; i++) {
            if (todos[i].getId().equals(todoID)) {
                deleteIndex = i;
                break;
            }
        }
        return deleteIndex;
    }

}
