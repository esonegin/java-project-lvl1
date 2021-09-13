package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {

    public static void start() {
        Cli.start();
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void process() {
        int range = 100;
        int first = (int) (Math.random() * range);
        int second = (int) (Math.random() * range);
        //Большее число поделить на меньшее
        int result = surplusFinder(Math.max(first, second), Math.min(first, second));

        System.out.print("Question: " + first + " " + second + "\n" + "Your answer: ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (answer == result) {
            System.out.println("Correct!");
            Engine.setProcessCount(Engine.getProcessCount() + 1);
        } else {
            System.out.println("Incorrect");
            Engine.setProcessCount(-1);
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + result + "'. Let's try again, " + Cli.getName() + "!");
            return;
        }
    }

    public static int surplusFinder(int first, int second) {
        int surplus1 = first % second;
        //Если остаток 0, то НОД - меньшее число
        if (surplus1 == 0) {
            return second;
        }
        //Меньшее число поделить на остаток, который получается после деления.
        else {
            surplus1 = surplusFinder(second, surplus1);
        }
        return surplus1;
    }
}
