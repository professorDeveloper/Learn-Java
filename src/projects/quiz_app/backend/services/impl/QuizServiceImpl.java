package projects.quiz_app.backend.services.impl;

import projects.quiz_app.backend.domain.Question;
import projects.quiz_app.backend.enums.Result;
import projects.quiz_app.backend.services.QuizService;
import projects.quiz_app.backend.utils.Utils;

import java.util.Arrays;

public class QuizServiceImpl implements QuizService {
    private static final Question[] questions = new Question[100];
    private int index = 0;
    private static QuizServiceImpl instance = null;

    private QuizServiceImpl() {
    }

    public static QuizServiceImpl getInstance() {
        if (instance == null) {
            instance = new QuizServiceImpl();
        }
        return instance;
    }

    @Override
    public void addQuiz(Question question) {
        questions[index++] = question;

    }

    @Override
    public void updateQuiz(Question question, int updateIndex) {
        questions[updateIndex] = question;
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
        var qList = Arrays.copyOf(questions, index);
        if (qList.length != 0) {
            return Utils.shuffleQuestions(qList);
        }
        System.out.println(Arrays.toString(qList));
        return null;
    }
}
