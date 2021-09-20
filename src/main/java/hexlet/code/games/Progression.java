package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int PROGRESSIONLENGTH = 10;

    public static void start() {
        System.out.println("What number is missing in the progression?");
    }

    public static void process() {
        int range = Utils.VALUERANGE;
        //Рандомизируем разницу прогрессии
        int difference = (int) (Math.random() * range);
        //Рандомизируем начальное значение прогрессии (0 - 100)
        int value = (int) (Math.random() * range);
        //Добавляем начальное значение в строку результата
        StringBuilder prog = new StringBuilder(String.valueOf(value));
        //Создаем массив значений
        String[] progression = new String[PROGRESSIONLENGTH];
        progression[0] = String.valueOf(value);
        //Рандомизируем индекс для замены значения
        int randomIndex = (int) (Math.random() * progression.length);

        //Наполняем массив
        for (int i = 1; i < progression.length; i++) {
            progression[i] = String.valueOf(Integer.parseInt(progression[i - 1]) + difference);
            prog.append(" ").append(progression[i]);
        }
        //Заменяем рандомное значение
        String question = progression[randomIndex];
        progression[randomIndex] = "..";
        StringBuilder finalresult = new StringBuilder();
        for (String str : progression) {
            finalresult.append(str).append(" ");
        }
        String answer = Engine.question(String.valueOf(finalresult));
        if (answer.equals(question)) {
            System.out.println("Correct!");
            Engine.setProcessCount(Engine.getProcessCount() + 1);
        } else {
            System.out.println("Incorrect");
            Engine.setProcessCount(-1);
            System.out.println("'" + answer + "'"
                    + " is wrong answer ;(. Correct answer was '"
                    + question + "'. Let's try again, "
                    + App.getName() + "!");
        }
    }
}
