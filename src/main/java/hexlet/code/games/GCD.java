package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final String[] QUESTIONARRAY = new String[Utils.ATTEMPTS];
    private static final String[] EXPECTEDRESPONSEARRAY = new String[Utils.ATTEMPTS];
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void process() {
        questionStringArray();
        Engine.flow(QUESTIONARRAY, EXPECTEDRESPONSEARRAY, DESCRIPTION);
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

    //Заполняем массив вопросов рандомными примерами
    public static void questionStringArray() {
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            int range = Utils.VALUERANGE;
            int first = (int) (Math.random() * range);
            int second = (int) (Math.random() * range);
            int gcdIntValue = surplusFinder(Math.max(first, second),
                    Math.min(first, second));
            QUESTIONARRAY[i] = first + " " + second;
            EXPECTEDRESPONSEARRAY[i] = String.valueOf(gcdIntValue);
        }
    }
}
