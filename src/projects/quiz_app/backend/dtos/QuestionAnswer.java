package projects.quiz_app.backend.dtos;

public record QuestionAnswer(
        String question,
        String[] options,
        int selectedOption,
        int correctOption,
        boolean isCorrect
) {}