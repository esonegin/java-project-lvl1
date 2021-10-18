package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void process() {
        String[] question = new String[Utils.ATTEMPTS];
        String[] response = new String[Utils.ATTEMPTS];
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            int first = Utils.getRandom(Utils.MIN, Utils.VALUE_RANGE);
            int second = Utils.getRandom(Utils.MIN, Utils.VALUE_RANGE);
            int gcdIntValue = surplusFinder(Math.max(first, second),
                    Math.min(first, second));
            question[i] = first + " " + second;
            response[i] = String.valueOf(gcdIntValue);
        }
        Engine.flow(question, response, DESCRIPTION);
    }

    public static int surplusFinder(int first, int second) {
        int surplus1 = first % second;
        //Если остаток 0, то НОД - меньшее число
        if (surplus1 == 0) {
            return second;
        } else {
            surplus1 = surplusFinder(second, surplus1);
        }
        return surplus1;
    }
}
