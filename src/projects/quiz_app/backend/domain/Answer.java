package projects.quiz_app.backend.domain;

public class Answer {
    private final String answer;
    private final boolean isCorrect;

    public Answer(String answer, boolean isCorrect) {
        this.answer = answer;
        this.isCorrect = isCorrect;
    }

    public String getAnswer() {
        return answer;
    }


    public boolean isCorrect() {
        return isCorrect;
    }


}
