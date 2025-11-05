package todo_app.backend.dtos;

import todo_app.backend.enums.Category;
import todo_app.backend.enums.Priority;

public record TodoDTO(String id, String title, Priority priority, Category category, boolean isCompleted) {
}
