package module_1_2.projects.todo_app_calendar.dto;

import java.time.LocalDateTime;

public class Todo {
    private String title;
    private String description;
    private boolean isCompleted;
    private LocalDateTime taskTime;

    public Todo(String title, String description, boolean isCompleted, LocalDateTime taskTime) {
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
        this.taskTime = taskTime;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public LocalDateTime getTaskTime() {
        return taskTime;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}