package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String[] QUESTIONARRAY = new String[Utils.ATTEMPTS];
    private static final String[] EXPECTEDRESPONSEARRAY = new String[Utils.ATTEMPTS];
    private static final String DESCRIPTION = "What is the result of the expression?";


    public static void process() {
        questionStringArray();
        Engine.flow(QUESTIONARRAY, EXPECTEDRESPONSEARRAY, DESCRIPTION);
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
            QUESTIONARRAY[i] = first + " " + operation + " " + second;
            EXPECTEDRESPONSEARRAY[i] = String.valueOf(resultValue(first, second, operation));
        }
    }
}
