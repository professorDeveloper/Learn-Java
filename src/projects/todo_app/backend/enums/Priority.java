package projects.todo_app.backend.enums;

public enum Priority {
    LOW("\uD83D\uDFE2"),
    MEDIUM("🟡"),
    HIGH("🔴"),;
    private final String emoji ;

    Priority(String emoji) {
        this.emoji = emoji;
    }

    public String getEmoji() {
        return emoji;
    }
}
