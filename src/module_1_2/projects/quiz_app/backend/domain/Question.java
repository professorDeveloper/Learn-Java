package module_1_2.projects.quiz_app.backend.domain;

public class Question {
    private final String question;
    private Answer[] answers;

    public Question(String question, Answer[] answers) {
        this.question = question;
        this.answers = answers;
    }

    public Answer[] getAnswers() {
        return answers;
    }


    public String getQuestion() {
        return question;
    }


}