package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int PROGRESSION_LENGTH = 10;

    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void process() {
        String[] questions = new String[Engine.ATTEMPTS];
        String[] answers = new String[Engine.ATTEMPTS];
        for (int i = 0; i < Engine.ATTEMPTS; i++) {
            int difference = Utils.getRandom(Utils.MIN, Utils.MAX);
            //Рандомизируем начальное значение прогрессии (0 - 100)
            int value = Utils.getRandom(Utils.MIN, Utils.MAX);
            String[] progression = progressionGenerator(value, difference);

            //Удаляем значение по рандомному индексу и записываем его в массив ответов
            int randomIndex = Utils.getRandom(Utils.MIN, progression.length - 1);
            answers[i] = progression[randomIndex];
            buildQuestion(progression, randomIndex);

            //Добавляем строку с прогрессией в массив вопросов
            StringBuilder progstr = new StringBuilder();
            for (String s : progression) {
                progstr.append(" ").append(s);
            }
            questions[i] = String.valueOf(progstr).trim();
        }
        Engine.flow(questions, answers, DESCRIPTION);
    }

    public static String[] progressionGenerator(int value, int difference) {
        String[] progression = new String[PROGRESSION_LENGTH];
        //Заполняем массив рандомными значениями
        int[] prog = new int[PROGRESSION_LENGTH];
        prog[0] = value;
        for (int j = 1; j < prog.length; j++) {
            prog[j] = prog[j - 1] + difference;
        }
        for (int k = 0; k < prog.length; k++) {
            progression[k] = String.valueOf(prog[k]);
        }
        return progression;
    }

    public static void buildQuestion(String[] progression, int index) {
        progression[index] = "..";
    }
}
