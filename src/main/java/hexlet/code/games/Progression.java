package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int PROGRESSIONLENGTH = 10;
    private static final String[] QuestionArray = new String[Utils.ATTEMPTS];
    private static final String[] expectedResponse = new String[Utils.ATTEMPTS];
    private static final String description = "What number is missing in the progression?";

    public static void process() {
        questionStringArray();
        Engine.flow(QuestionArray, expectedResponse, description);
    }

    //Заполняем массив вопросов рандомными примерами
    public static void questionStringArray() {
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            //Заполняем массив рандомными значениями
            String[] progression = pullProgressionArray();
            //Удаляем значение по рандомному индексу и записываем его в массив ответов
            expectedResponse[i] = String.valueOf(removeRandomIndex(progression));
            //Добавляем строку с прогрессией в массив вопросов
            QuestionArray[i] = addStringProgression(progression);
        }
    }

    //Наполняем массив
    public static String[] pullProgressionArray() {
        int[] progression = new int[PROGRESSIONLENGTH];
        String[] result = new String[progression.length];
        //Рандомизируем разницу прогрессии
        int difference = (int) (Math.random() * Utils.VALUERANGE);
        //Рандомизируем начальное значение прогрессии (0 - 100)
        int value = (int) (Math.random() * Utils.VALUERANGE);
        progression[0] = value;
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + difference;
        }
        for (int i = 0; i < progression.length; i++) {
            result[i] = String.valueOf(progression[i]);
        }
        return result;
    }

    public static String removeRandomIndex(String[] array) {
        //Заменяем рандомное значение
        int randomIndex = (int) (Math.random() * array.length);
        String result = array[randomIndex];
        array[randomIndex] = "..";
        return result;
    }

    public static String addStringProgression(String[] progression) {
        //Добавляем начальное значение в строку результата
        StringBuilder prog = new StringBuilder();
        for (String s : progression) {
            prog.append(" ").append(s);
        }
        return String.valueOf(prog);
    }
}
