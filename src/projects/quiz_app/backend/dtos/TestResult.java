package projects.quiz_app.backend.dtos;

public record TestResult(User user, int correctAnswers, int wrongAnswers) {
}
