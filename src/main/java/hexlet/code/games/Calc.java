package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void process() {
        String[] question = new String[Utils.ATTEMPTS];
        String[] response = new String[Utils.ATTEMPTS];
        questionStringArray(question, response);
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
    public static void questionStringArray(String[] question, String[] response) {
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            int first = Utils.getRandom(Utils.MIN, Utils.MAX);
            int second = (int) (Math.random() * Utils.VALUERANGE);
            char[] operations = {'+', '-', '*'};
            int index = Utils.getRandom(Utils.MIN, Utils.OPERATIONRANGE);
            char operation = operations[index];
            question[i] = first + " " + operation + " " + second;
            response[i] = String.valueOf(resultValue(first, second, operation));
        }
    }
}
