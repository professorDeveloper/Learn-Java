package module3.lesson;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleAlgorithm {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 60 - 32));
        }
        System.out.println(numbers);
        Integer min = Collections.min(numbers);
        System.out.println("Min:" + min);
        Integer max = Collections.max(numbers);
        System.out.println("Max:" + max);

        numbers.removeIf(n -> n > min);
    }

}
