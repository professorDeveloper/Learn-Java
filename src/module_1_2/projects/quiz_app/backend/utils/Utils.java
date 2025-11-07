package module_1_2.projects.quiz_app.backend.utils;

import module_1_2.projects.quiz_app.backend.domain.Question;

import java.util.Random;

public class Utils {
    public static Question[] shuffleQuestions(Question[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Question a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;
    }
}
