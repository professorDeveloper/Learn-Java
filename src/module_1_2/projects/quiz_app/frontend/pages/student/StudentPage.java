package module_1_2.projects.quiz_app.frontend.pages.student;

import module_1_2.projects.quiz_app.backend.domain.Answer;
import module_1_2.projects.quiz_app.backend.dtos.QuestionAnswer;
import module_1_2.projects.quiz_app.backend.dtos.TestResult;
import module_1_2.projects.quiz_app.backend.dtos.User;
import module_1_2.projects.quiz_app.backend.services.QuizService;
import module_1_2.projects.quiz_app.backend.services.StudentService;
import module_1_2.projects.quiz_app.backend.services.impl.QuizServiceImpl;
import module_1_2.projects.quiz_app.backend.services.impl.StudentServiceImpl;

import java.util.Scanner;

public class StudentPage {

    private final QuizService quizService = QuizServiceImpl.getInstance();
    private final StudentService studentService = StudentServiceImpl.getInstance();

    private User user;


    public void viewHistory() {
        var testResults = studentService.getTestResultsByUser(user.username());
        if (testResults.length == 0) {
            System.out.println("No history found!");
            return;
        }
        for (int i = 0; i < testResults.length; i++) {
            TestResult result = testResults[i];
            var numI = i + 1;
            System.out.println("========== Test #" + (numI) + " ==========");
            System.out.println("Correct: " + result.correctAnswers() + " | Wrong: " + result.wrongAnswers());
            System.out.println("---------------------------------------");

            QuestionAnswer[] answers = result.answers();
            for (int j = 0; j < answers.length; j++) {
                var numJ = j + 1;
                QuestionAnswer questionAnswer = answers[j];
                System.out.println("Q" + (numJ) + ": " + questionAnswer.question());

                for (int f = 0; f < questionAnswer.options().length; f++) {
                    var num = f + 1;
                    if (f == questionAnswer.correctOption()) {
                        var mark = " Correct ";
                        System.out.println("\t" + num + ". " + questionAnswer.options()[f] + mark);
                    } else {
                        System.out.println("\t" + num + ". " + questionAnswer.options()[f]);
                    }
                }

                System.out.println("\tYour answer:" + (questionAnswer.isCorrect() ? "Correct" : "Wrong"));
                System.out.println();
            }
            System.out.println("=======================================\n");
        }
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        var qList = quizService.getShuffledQuiz();
        if (qList == null || qList.length == 0) {
            System.out.println("Quiz is empty! \nStay in app. teacher will add questions");
            return;
        }

        int correctAnswers = 0;
        int wrongAnswers = 0;
        QuestionAnswer[] answers = new QuestionAnswer[qList.length];

        for (int i = 0; i < qList.length; i++) {
            System.out.println("----------------- Question " + (i + 1) + " ----------------");
            System.out.println("The question is: " + qList[i].getQuestion());
            var options = qList[i].getAnswers();

            for (int j = 0; j < options.length; j++) {
                System.out.println("\t" + (j + 1) + ". " + options[j].getAnswer());
            }

            int option = -1;
            while (option < 0) {
                System.out.print("Enter correct option number (1-4): ");
                int input = scanner.nextInt();
                if (input >= 1 && input <= options.length) {
                    option = input - 1;
                } else {
                    System.out.println("Invalid number! Try again.");
                }
            }

            boolean isCorrect = options[option].isCorrect();
            if (isCorrect) correctAnswers++;
            else wrongAnswers++;

            int correctOption = getCorrectOption(options);

            String[] optionTexts = new String[options.length];
            for (int j = 0; j < options.length; j++) {
                optionTexts[j] = options[j].getAnswer();
            }
            answers[i] = new QuestionAnswer(qList[i].getQuestion(), optionTexts, option, correctOption, isCorrect);
        }

        studentService.addTestResult(new TestResult(user.username(), correctAnswers, wrongAnswers, answers));

        System.out.println("---------------------------------------");
        System.out.println("Test completed!");
        System.out.println("Correct answers: " + correctAnswers);
        System.out.println("Wrong answers: " + wrongAnswers);
        System.out.println("---------------------------------------");
    }

    private int getCorrectOption(Answer[] options) {
        int correctOption = 0;
        for (int j = 0; j < options.length; j++) {
            if (options[j].isCorrect()) {
                correctOption = j;
                break;
            }
        }
        return correctOption;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
