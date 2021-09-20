package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static int gcdIntValue;

    public static void start() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void process() {
        int range = Utils.VALUERANGE;
        int gcdRandomizeFirstValue = (int) (Math.random() * range);
        int gcdRandomizeSecondValue = (int) (Math.random() * range);
        //Большее число поделить на меньшее
        gcdIntValue = surplusFinder(Math.max(gcdRandomizeFirstValue, gcdRandomizeSecondValue),
                Math.min(gcdRandomizeFirstValue, gcdRandomizeSecondValue));
        String answer = Engine.question(resultValue(gcdRandomizeFirstValue, gcdRandomizeSecondValue));
        if (Integer.parseInt(answer) == gcdIntValue) {
            System.out.println("Correct!");
            Engine.setProcessCount(Engine.getProcessCount() + 1);
        } else {
            System.out.println("Incorrect");
            Engine.setProcessCount(-1);
            System.out.println("'" + answer + "'"
                    + " is wrong answer ;(. Correct answer was '"
                    + gcdIntValue + "'. Let's try again, " + App.getName()
                    + "!");
        }
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

    public static String resultValue(int first, int second) {

        return first + " " + second;
    }
}
