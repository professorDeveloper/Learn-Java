package todo_app.backend;

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
}
