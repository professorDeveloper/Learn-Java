package projects.quiz_app.backend.dtos;

import projects.quiz_app.backend.enums.Role;

public record User(String username, String password, Role role) {

}
