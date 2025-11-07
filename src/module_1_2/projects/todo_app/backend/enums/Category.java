package module_1_2.projects.todo_app.backend.enums;

public enum Category {
    DEFAULT("🚗"),
    WORK("🏢"),
    PERSONAL("👨‍👩‍👦"),
    ;

    private final String emoji;

    Category(String emoji) {
        this.emoji = emoji;
    }

    public String getEmoji() {
        return emoji;
    }
}
