package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void process() {
        String[] questions = new String[Engine.ATTEMPTS];
        String[] answers = new String[Engine.ATTEMPTS];
        for (int i = 0; i < Engine.ATTEMPTS; i++) {
            int j = Utils.getRandom(Utils.MIN, Utils.MAX);
            questions[i] = String.valueOf(j);
            answers[i] = j % 2 == 0 ? "yes" : "no";
        }
        Engine.flow(questions, answers, DESCRIPTION);
    }
}
