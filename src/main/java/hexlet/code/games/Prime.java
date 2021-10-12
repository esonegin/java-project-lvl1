package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void process() {
        String[] question = new String[Utils.ATTEMPTS];
        String[] response = new String[Utils.ATTEMPTS];
        resultValue(questionIntArray(question), response);
        Engine.flow(question, response, DESCRIPTION);
    }

    //Формируем массив строк с правильными ответами
    public static void resultValue(int[] evenQuestionArray, String[] response) {
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            if (isPrime(evenQuestionArray[i])) {
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

    public static boolean isPrime(final int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return (n > 1);
    }
}
