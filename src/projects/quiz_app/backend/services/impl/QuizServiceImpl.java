package projects.quiz_app.backend.services.impl;

import kotlin.contracts.Returns;
import projects.quiz_app.backend.domain.Question;
import projects.quiz_app.backend.dtos.User;
import projects.quiz_app.backend.enums.Result;
import projects.quiz_app.backend.services.QuizService;
import projects.quiz_app.backend.utils.Utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class QuizServiceImpl implements QuizService {
    private final Question[] questions = new Question[100];
    private int index = 0;

    @Override
    public void addQuiz(Question question) {
        questions[index++] = question;

    }

    @Override
    public void updateQuiz(Question question) {
        var currentQuestionIndex = getQuestionIndex(question);
        if (currentQuestionIndex != -1) {
            questions[currentQuestionIndex] = question;
        }

    }

    private int getQuestionIndex(Question question) {
        for (int i = 0; i < index; i++) {
            if (questions[i].equals(question)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public Result deleteQuiz(Question question) {
        var currentIndex = getQuestionIndex(question);
        if (currentIndex == -1) {
            return Result.ERROR;
        }
        if (index != questions.length) {
            for (int i = currentIndex; i < index; i++) {
                questions[i] = questions[i + 1];
            }
            index--;
        }
        return Result.SUCCESS;
    }

    @Override
    public Question[] listQuiz() {
        return Arrays.copyOf(questions, index);
    }

    @Override
    public Question[] getShuffledQuiz() {
        if (listQuiz().length != 0) {
            return Utils.shuffleQuestions(listQuiz());
        }
        return null;
    }
}
