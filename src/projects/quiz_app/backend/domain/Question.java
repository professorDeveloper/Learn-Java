package projects.quiz_app.backend.domain;

public class Question {
    private String question;
    private Answer[] answers = new Answer[4];

    public Question(String question, Answer[] answers) {
        this.question = question;
        this.answers = answers;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}