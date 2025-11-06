package projects.quiz_app.frontend.pages.teacher;

import projects.quiz_app.backend.domain.Answer;
import projects.quiz_app.backend.domain.Question;
import projects.quiz_app.backend.enums.Result;
import projects.quiz_app.backend.services.QuizService;
import projects.quiz_app.backend.services.impl.QuizServiceImpl;

import java.util.Scanner;

public class TeacherPage {
    QuizService service = QuizServiceImpl.getInstance();
    Question[] qList;

    public void addInitQuestions() {
        service.addQuiz(new Question("Java nima?",
                new Answer[]{
                        new Answer("Dasturlash tili", true),
                        new Answer("Kofe turi", false),
                        new Answer("Operatsion tizim", false),
                        new Answer("Matn muharriri", false)
                }));

        service.addQuiz(new Question("JVM nima qiladi?",
                new Answer[]{
                        new Answer("Kod yozadi", false),
                        new Answer("Bytecode ishga tushiradi", true),
                        new Answer("Kompyuterni o'chiradi", false),
                        new Answer("Internetga ulanadi", false)
                }));

        service.addQuiz(new Question("OOPning asosiy tamoyillaridan biri nima?",
                new Answer[]{
                        new Answer("Inkapsulyatsiya", true),
                        new Answer("Kompilyatsiya", false),
                        new Answer("Interpretatsiya", false),
                        new Answer("Debugging", false)
                }));
    }

    public void createQuiz() {

        Question question = makeQuestionFromScanner();
        service.addQuiz(question);
        System.out.println("Question added successfully!");
    }

    private Question makeQuestionFromScanner() {
        final int optionCount = 4;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter question: ");
        String questionTxt = scanner.nextLine();

        String[] options = new String[optionCount];
        for (int i = 0; i < optionCount; i++) {
            System.out.printf("Enter option %d: ", i + 1);
            options[i] = scanner.nextLine();
        }

        int correctIndex = -1;
        while (correctIndex < 0 || correctIndex >= optionCount) {
            System.out.print("Enter correct option number (1-4): ");
            int input = scanner.nextInt();
            if (input >= 1 && input <= optionCount) {
                correctIndex = input - 1;
            } else {
                System.out.println("Invalid number! Try again.");
            }

        }

        Answer[] answers = new Answer[optionCount];
        for (int i = 0; i < optionCount; i++) {
            answers[i] = new Answer(options[i], i == correctIndex);
        }

        return new Question(questionTxt, answers);
    }


    public void deleteQuiz() {
        qList = service.listQuiz();
        var questionIndex = questionChooseByListWithNum("Enter question number:");
        if (questionIndex != -1) {
            var question = qList[questionIndex];
            Result r = service.deleteQuiz(question);
            if (r.equals(Result.SUCCESS)) {
                System.out.println("Question deleted successfully!");
            } else {
                System.out.println("something went wrong");
            }
        }
    }

    public void updateQuiz() {
        var questionIndex = questionChooseByListWithNum("Enter question number for update:");
        if (questionIndex != -1) {
            Question updatedQuestion = makeQuestionFromScanner();
            service.updateQuiz(updatedQuestion, questionIndex);
            System.out.println("Question updated successfully !");
        }
    }

    private int questionChooseByListWithNum(String message) {
        qList = service.listQuiz();
        for (int i = 0; i < qList.length; i++) {
            System.out.println((i + 1) + ". " + qList[i].getQuestion());
        }
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        int questionNumber = scanner.nextInt();
        if (questionNumber > 0 && questionNumber <= qList.length) {
            return questionNumber - 1;
        } else {
            System.out.println("Invalid question number!");
        }
        return -1;
    }

    public void listQuiz() {
        System.out.println("--------------------------------");
        var quizList = service.listQuiz();
        for (int i = 0; i < quizList.length; i++) {
            System.out.println("----------------- Question " + (i + 1) + " ----------------");
            System.out.println(("The question is: " + quizList[i].getQuestion()));
            for (int j = 0; j < 4; j++) {
                System.out.println("\t" + (j + 1) + ". " + quizList[i].getAnswers()[j].getAnswer());
            }
            System.out.println("--------------------------------");
        }

    }

}
