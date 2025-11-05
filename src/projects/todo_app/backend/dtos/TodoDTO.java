package projects.todo_app.backend.dtos;

import projects.todo_app.backend.enums.Category;
import projects.todo_app.backend.enums.Priority;

public record TodoDTO(String id, String title, Priority priority, Category category, boolean isCompleted) {
}
