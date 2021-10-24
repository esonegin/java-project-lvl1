package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void process() {
        String[] questions = new String[Engine.ATTEMPTS];
        String[] answers = new String[Engine.ATTEMPTS];
        for (int i = 0; i < Engine.ATTEMPTS; i++) {
            int first = Utils.getRandom(Utils.MIN, Utils.MAX);
            int second = Utils.getRandom(Utils.MIN, Utils.MAX);
            int gcdIntValue = findGcd(Math.max(first, second),
                    Math.min(first, second));
            questions[i] = first + " " + second;
            answers[i] = String.valueOf(gcdIntValue);
        }
        Engine.flow(questions, answers, DESCRIPTION);
    }

    public static int findGcd(int first, int second) {
        int surplus = first % second;
        //Если остаток 0, то НОД - меньшее число
        if (surplus == 0) {
            return second;
        }
        return findGcd(second, surplus);
    }
}
