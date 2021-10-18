package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void process() {
        String[] question = new String[Utils.ATTEMPTS];
        String[] response = new String[Utils.ATTEMPTS];

        int[] questionInt = new int[Utils.ATTEMPTS];
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            questionInt[i] = Utils.getRandom(Utils.MIN, Utils.VALUE_RANGE);
            question[i] = String.valueOf(questionInt[i]);
        }
        //resultValue(questionInt(question), response);
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            if (isPrime(questionInt[i])) {
                response[i] = ("yes");
            } else {
                response[i] = ("no");
            }
        }
        Engine.flow(question, response, DESCRIPTION);
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
