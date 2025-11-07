package module_1_2.projects.quiz_app.backend.services;


import module_1_2.projects.quiz_app.backend.domain.Question;
import module_1_2.projects.quiz_app.backend.enums.Result;

public interface QuizService {
    void addQuiz(Question question);

    void updateQuiz(Question question, int questionIndex);

    Result deleteQuiz(Question question);

    Question[] listQuiz();

    Question[] getShuffledQuiz();

}
