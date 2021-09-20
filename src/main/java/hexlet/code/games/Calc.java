package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static int calcResultIntValue;
    private static String answer;

    public static void start() {
        System.out.println("What is the result of the expression?");
    }

    public static void process() {
        int first = (int) (Math.random() * Utils.VALUERANGE);
        int second = (int) (Math.random() * Utils.VALUERANGE);
        char[] operations = {'+', '-', '*'};
        int index = (int) (Math.random() * Utils.OPERATIONRANGE);
        answer = Engine.question(resultValue(first, second, operations[index]));
        if (Integer.parseInt(answer) == calcResultIntValue) {
            System.out.println("Correct!");
            Engine.setProcessCount(Engine.getProcessCount() + 1);
        } else {
            System.out.println("Incorrect");
            Engine.setProcessCount(-1);
            System.out.println("'" + answer
                    + "'" + " is wrong answer ;(. Correct answer was '"
                    + calcResultIntValue + "'. Let's try again, " + App.getName() + "!");
            Engine.setProcessCount(-1);
        }
    }

    public static String resultValue(int first, int second, char operation) {
        switch (operation) {
            case '+':
                calcResultIntValue = first + second;
                return first + " + " + second;
            case '-':
                calcResultIntValue = first - second;
                return first + " - " + second;
            case '*':
                calcResultIntValue = first * second;
                return first + " * " + second;
            default:
                break;
        }
        return null;
    }
}
