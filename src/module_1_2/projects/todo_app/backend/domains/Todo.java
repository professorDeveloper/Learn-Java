package module_1_2.projects.todo_app.backend.domains;

import module_1_2.projects.todo_app.backend.enums.Category;
import module_1_2.projects.todo_app.backend.enums.Priority;

public class Todo {
    private String id;
    private String title;
    private Priority priority = Priority.LOW;
    private Category category = Category.DEFAULT;
    private boolean isCompleted;

    public Todo() {
    }

    public Todo(String id, String title, Priority priority, Category category, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.category = category;
        this.isCompleted = isCompleted;
    }

    public static TodoBuilder builder() {
        return new TodoBuilder();
    }

    public static class TodoBuilder {
        private String id;
        private String title;
        private Priority priority = Priority.LOW;
        private Category category = Category.DEFAULT;
        private boolean isCompleted;

        public Todo build() {
            return new Todo(this.id, this.title, this.priority, this
                    .category, this.isCompleted);
        }

        public TodoBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public TodoBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public TodoBuilder setPriority(Priority priority) {
            this.priority = priority;
            return this;
        }

        public TodoBuilder setCategory(Category category) {
            this.category = category;
            return this;
        }

        public TodoBuilder setCompleted(boolean completed) {
            isCompleted = completed;
            return this;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public void setTitle(String title) {
        this.title = title;
    }



    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Title: %s | Priority (%s): %s | Category: %s | Completed: %s".formatted(title, priority.name(), priority.getEmoji(), category.getEmoji(), isCompleted);
    }
}
