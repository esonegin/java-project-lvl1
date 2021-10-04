package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static String[] question = new String[Utils.ATTEMPTS];
    private static String[] response = new String[Utils.ATTEMPTS];
    private static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void process() {
        resultValue(questionIntArray());
        Engine.flow(question, response, DESCRIPTION);
    }

    //Формируем массив строк с правильными ответами
    public static void resultValue(int[] evenQuestionArray) {
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            if (evenQuestionArray[i] % 2 == 0) {
                response[i] = ("yes");
            } else {
                response[i] = ("no");
            }
        }
    }

    //Заполняем массив вопросов рандомными числами
    public static int[] questionIntArray() {
        int[] result = new int[Utils.ATTEMPTS];
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            result[i] = (int) (Math.random() * Utils.VALUERANGE);
            question[i] = String.valueOf(result[i]);
        }
        return result;
    }
}
