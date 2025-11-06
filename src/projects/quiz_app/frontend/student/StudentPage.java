package projects.quiz_app.frontend.student;

import projects.quiz_app.backend.dtos.TestResult;
import projects.quiz_app.backend.dtos.User;
import projects.quiz_app.backend.services.QuizService;
import projects.quiz_app.backend.services.StudentService;
import projects.quiz_app.backend.services.impl.QuizServiceImpl;
import projects.quiz_app.backend.services.impl.StudentServiceImpl;

import java.util.Scanner;

public class StudentPage {

    private final QuizService quizService = new QuizServiceImpl();
    private final StudentService studentService = new StudentServiceImpl();

    private User user;


    public void viewHistory() {

    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        var qList = quizService.getShuffledQuiz();
        if (qList != null) {
            for (int i = 0; i < qList.length; i++) {
                System.out.println("----------------- Question " + (i + 1) + " ----------------");
                System.out.println(("The question is: " + qList[i].getQuestion()));
                for (int j = 0; j < 4; j++) {
                    System.out.println("\t" + (j + 1) + ". " + qList[i].getAnswers()[j].getAnswer());
                }
                int option = -1;
                while (option < 0 || option >= qList[i].getAnswers().length) {
                    System.out.print("Enter correct option number (1-4): ");
                    int input = scanner.nextInt();
                    if (input >= 1 && input <= qList[i].getAnswers().length) {
                        option = input - 1;
                    } else {
                        System.out.println("Invalid number! Try again.");
                    }
                }

                if (qList[i].getAnswers()[option - 1].isCorrect()) {
                    System.out.println("Correct answer!");
                } else {
                    System.out.println("Wrong answer!");
                }

            }
        } else {
            System.out.println("Quiz is empty ! \nStay in app. teacher will add questions");
        }
    }

    public void setUser(User user) {
        this.user = user;
    }
}
