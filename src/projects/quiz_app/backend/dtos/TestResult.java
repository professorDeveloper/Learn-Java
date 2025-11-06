package projects.quiz_app.backend.dtos;

import java.time.LocalDateTime;

public record TestResult(
        String username,
        int correctAnswers,
        int wrongAnswers,
        QuestionAnswer[] answers
) {
}