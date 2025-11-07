package module_1_2.projects.todo_app.backend.dtos;

import module_1_2.projects.todo_app.backend.enums.Category;
import module_1_2.projects.todo_app.backend.enums.Priority;

public record TodoDTO(String id, String title, Priority priority, Category category, boolean isCompleted) {
}
