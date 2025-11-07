package module_1_2.projects.quiz_app.backend.dtos;

import module_1_2.projects.quiz_app.backend.enums.Role;

public record User(String username, String password, Role role) {
    public User copy(String password) {
        return new User(this.username, password, this.role);
    }
}
