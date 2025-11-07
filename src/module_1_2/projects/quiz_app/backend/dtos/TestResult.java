package module_1_2.projects.quiz_app.backend.dtos;

public record TestResult(
        String username,
        int correctAnswers,
        int wrongAnswers,
        QuestionAnswer[] answers
) {
}