package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static int evenRandomizeIntValue = resultInt();
    private static String answer;
    private static String result;

    public static void start() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public static void process() {

        setEvenRandomizeIntValue(resultInt());
        answer = Engine.question(String.valueOf(getEvenRandomizeIntValue()));
        result = resultValue(getEvenRandomizeIntValue());

        if (result.equals("yes") && answer.equals("yes")) {
            System.out.println("Correct!");
            Engine.setProcessCount(Engine.getProcessCount() + 1);
        } else if (result.equals("no") && answer.equals("no")) {
            System.out.println("Correct!");
            Engine.setProcessCount(Engine.getProcessCount() + 1);
        } else {
            System.out.println("Incorrect");
            Engine.setProcessCount(-1);
            System.out.println("'" + Even.getEvenAnswer()
                    + "'" + " is wrong answer ;(. Correct answer was '"
                    + Even.getEvenResult() + "'. Let's try again, " + App.getName() + "!");
            Engine.setProcessCount(-1);
        }
    }

    public static String resultValue(int randomValue) {
        if (randomValue % 2 == 0) {
            result = ("yes");
        } else {
            result = ("no");
        }
        return result;
    }

    public static int resultInt() {
        return (int) (Math.random() * Utils.VALUERANGE);
    }

    public static int getEvenRandomizeIntValue() {
        return evenRandomizeIntValue;
    }

    public static String getEvenAnswer() {
        return answer;
    }

    public static String getEvenResult() {
        return result;
    }

    public static void setEvenRandomizeIntValue(int value) {
        evenRandomizeIntValue = value;
    }

}
