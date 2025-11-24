package module4.projects.ucell.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ChatMessage implements Serializable {

    private String id;
    private String userId;
    private String message;
    private LocalDateTime createdAt;

    public ChatMessage() {}

    public ChatMessage(String id, String userId, String message, LocalDateTime createdAt) {
        this.id = id;
        this.userId = userId;
        this.message = message;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
