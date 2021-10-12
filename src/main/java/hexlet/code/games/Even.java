package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void process() {
        String[] question = new String[Utils.ATTEMPTS];
        String[] response = new String[Utils.ATTEMPTS];
        resultValue(questionIntArray(question), response);
        Engine.flow(question, response, DESCRIPTION);
    }

    //Формируем массив строк с правильными ответами
    public static void resultValue(int[] evenQuestionArray, String[] response) {
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            if (evenQuestionArray[i] % 2 == 0) {
                response[i] = ("yes");
            } else {
                response[i] = ("no");
            }
        }
    }

    //Заполняем массив вопросов рандомными числами
    public static int[] questionIntArray(String[] question) {
        int[] result = new int[Utils.ATTEMPTS];
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            result[i] = Utils.getRandom(Utils.MIN, Utils.VALUERANGE);
            question[i] = String.valueOf(result[i]);
        }
        return result;
    }
}
