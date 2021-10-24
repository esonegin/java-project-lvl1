package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void process() {
        String[] questions = new String[Engine.ATTEMPTS];
        String[] answers = new String[Engine.ATTEMPTS];
        for (int i = 0; i < Engine.ATTEMPTS; i++) {
            int j = Utils.getRandom(Utils.MIN, Utils.MAX);
            questions[i] = String.valueOf(j);
            answers[i] = isPrime(j) ? "yes" : "no";
        }
        Engine.flow(questions, answers, DESCRIPTION);
    }

    public static boolean isPrime(final int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return (n > 1);
    }
}
