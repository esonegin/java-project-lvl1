package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int PROGRESSION_LENGTH = 10;

    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void process() {
        String[] question = new String[Utils.ATTEMPTS];
        String[] response = new String[Utils.ATTEMPTS];
        questionStringArray(question, response);
        Engine.flow(question, response, DESCRIPTION);
    }

    //Заполняем массив вопросов рандомными примерами
    public static void questionStringArray(String[] question, String[] response) {
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            //Заполняем массив рандомными значениями
            String[] progression = pullProgressionArray();
            //Удаляем значение по рандомному индексу и записываем его в массив ответов
            response[i] = String.valueOf(removeRandomIndex(progression));
            //Добавляем строку с прогрессией в массив вопросов
            question[i] = addStringProgression(progression);
        }
    }

    //Наполняем массив
    public static String[] pullProgressionArray() {
        int[] progression = new int[PROGRESSION_LENGTH];
        String[] result = new String[progression.length];
        //Рандомизируем разницу прогрессии
        int difference = Utils.getRandom(Utils.MIN, Utils.VALUERANGE);
        //Рандомизируем начальное значение прогрессии (0 - 100)
        int value = Utils.getRandom(Utils.MIN, Utils.VALUERANGE);
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
        int randomIndex = Utils.getRandom(Utils.MIN, array.length);
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
        return String.valueOf(prog).trim();
    }
}
