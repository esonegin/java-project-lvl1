package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final String[] QuestionArray = new String[Utils.ATTEMPTS];
    private static final String[] expectedResponse = new String[Utils.ATTEMPTS];
    private static final String description = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void process() {
        resultValue(questionIntArray());
        Engine.flow(QuestionArray, expectedResponse, description);
    }

    //Формируем массив строк с правильными ответами
    public static void resultValue(int[] evenQuestionArray) {
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            if (evenQuestionArray[i] % 2 == 0) {
                expectedResponse[i] = ("yes");
            } else {
                expectedResponse[i] = ("no");
            }
        }
    }

    //Заполняем массив вопросов рандомными числами
    public static int[] questionIntArray() {
        int[] result = new int[3];
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            result[i] = (int) (Math.random() * Utils.VALUERANGE);
            QuestionArray[i] = String.valueOf(result[i]);
        }
        return result;
    }
}
