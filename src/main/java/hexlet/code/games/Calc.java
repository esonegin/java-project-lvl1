package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"+", "-", "*"};

    public static void process() {
        String[] questions = new String[Engine.ATTEMPTS];
        String[] answers = new String[Engine.ATTEMPTS];
        for (int i = 0; i < Engine.ATTEMPTS; i++) {
            int first = Utils.getRandom(Utils.MIN, Utils.MAX);
            int second = Utils.getRandom(Utils.MIN, Utils.MAX);
            int index = Utils.getRandom(Utils.MIN, OPERATIONS.length - 1);
            String operation = OPERATIONS[index];
            questions[i] = first + " " + operation + " " + second;
            answers[i] = switch (operation) {
                case ("+") -> String.valueOf(first + second);
                case ("-") -> String.valueOf(first - second);
                default -> String.valueOf(first * second);
            };
        }
        Engine.flow(questions, answers, DESCRIPTION);
    }
}
