package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void process() {
        String[] question = new String[Utils.ATTEMPTS];
        String[] response = new String[Utils.ATTEMPTS];
        int[] result = new int[Utils.ATTEMPTS];
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            result[i] = Utils.getRandom(Utils.MIN, Utils.VALUE_RANGE);
            question[i] = String.valueOf(result[i]);
            if (result[i] % 2 == 0) {
                response[i] = ("yes");
            } else {
                response[i] = ("no");
            }
        }
        Engine.flow(question, response, DESCRIPTION);
    }
}
