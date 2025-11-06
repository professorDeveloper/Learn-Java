package projects.quiz_app.backend.services;


import projects.quiz_app.backend.domain.Question;
import projects.quiz_app.backend.enums.Result;

public interface QuizService {
    Question addQuiz(Question question);

    Result updateQuiz(Question question);

    Result deleteQuiz(Question question);

    Question[] listQuiz();

}
