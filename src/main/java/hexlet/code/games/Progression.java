package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int PROGRESSION_LENGTH = 10;

    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void process() {
        String[] question = new String[Utils.ATTEMPTS];
        String[] response = new String[Utils.ATTEMPTS];
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            //Заполняем массив рандомными значениями
            int[] prog = new int[PROGRESSION_LENGTH];
            String[] progression = new String[prog.length];
            int difference = Utils.getRandom(Utils.MIN, Utils.VALUE_RANGE);
            //Рандомизируем начальное значение прогрессии (0 - 100)
            int value = Utils.getRandom(Utils.MIN, Utils.VALUE_RANGE);
            prog[0] = value;
            for (int j = 1; j < prog.length; j++) {
                prog[j] = prog[j - 1] + difference;
            }
            for (int k = 0; k < prog.length; k++) {
                progression[k] = String.valueOf(prog[k]);
            }
            //Удаляем значение по рандомному индексу и записываем его в массив ответов
            int randomIndex = Utils.getRandom(Utils.MIN, progression.length - 1);
            response[i] = progression[randomIndex];
            progression[randomIndex] = "..";
            //Добавляем строку с прогрессией в массив вопросов
            StringBuilder progstr = new StringBuilder();
            for (String s : progression) {
                progstr.append(" ").append(s);
            }
            question[i] = String.valueOf(progstr).trim();
        }
        Engine.flow(question, response, DESCRIPTION);
    }
}
