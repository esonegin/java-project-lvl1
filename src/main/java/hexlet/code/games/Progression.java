package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {
    public static void start() {
        Cli.start();
        System.out.println("What number is missing in the progression?");
    }

    public static void process() {
        //Рандомизируем разницу прогрессии
        int difference = (int) (Math.random() * 100);
        //Рандомизируем начальное значение прогрессии (0 - 100)
        int value = (int) (Math.random() * 100);
        //Добавляем начальное значение в строку результата
        StringBuilder prog = new StringBuilder(String.valueOf(value));
        //Создаем массив значений
        String[] progression = new String[10];
        progression[0] = String.valueOf(value);
        //Рандомизируем индекс для замены значения
        int randomIndex = (int) (Math.random() * 10);

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

        System.out.print("Question: " + finalresult + "\n" + "Your answer: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        if (answer.equals(question)) {
            System.out.println("Correct!");
            Engine.setProcessCount(Engine.getProcessCount() + 1);
        } else {
            System.out.println("Incorrect");
            Engine.setProcessCount(-1);
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + question + "'. Let's try again, " + Cli.name + "!");
        }
    }
}
