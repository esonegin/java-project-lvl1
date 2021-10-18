package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void process() {
        String[] question = new String[Utils.ATTEMPTS];
        String[] response = new String[Utils.ATTEMPTS];
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            int first = Utils.getRandom(Utils.MIN, Utils.MAX);
            int second = (int) (Math.random() * Utils.VALUE_RANGE);
            char[] operations = {'+', '-', '*'};
            int index = Utils.getRandom(Utils.MIN, operations.length - 1);
            char operation = operations[index];
            question[i] = first + " " + operation + " " + second;
            if (operation == '+') {
                response[i] = String.valueOf(first + second);
            } else if (operation == '-') {
                response[i] = String.valueOf(first - second);
            } else {
                response[i] = String.valueOf(first * second);
            }
        }
        Engine.flow(question, response, DESCRIPTION);
    }
}
