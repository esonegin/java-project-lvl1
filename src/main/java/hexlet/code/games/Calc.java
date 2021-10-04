package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String DESCRIPTION = "What is the result of the expression?";
    private static String[] question = new String[Utils.ATTEMPTS];
    private static String[] response = new String[Utils.ATTEMPTS];

    public static void process() {
        questionStringArray();
        Engine.flow(question, response, DESCRIPTION);
    }

    public static int resultValue(int first, int second, char operation) {
        switch (operation) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            default:
                break;
        }
        return 0;
    }

    //Заполняем массив вопросов рандомными примерами
    public static void questionStringArray() {

        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            int first = (int) (Math.random() * Utils.VALUERANGE);
            int second = (int) (Math.random() * Utils.VALUERANGE);
            char[] operations = {'+', '-', '*'};
            int index = (int) (Math.random() * Utils.OPERATIONRANGE);
            char operation = operations[index];
            question[i] = first + " " + operation + " " + second;
            response[i] = String.valueOf(resultValue(first, second, operation));
        }
    }
}
