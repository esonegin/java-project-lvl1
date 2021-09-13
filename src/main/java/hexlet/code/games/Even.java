package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;


public class Even {

    public static void start() {
        Cli.start();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public static void process() {
        String answer;
        String result;
        int range = Utils.VALUERANGE;
        int value = (int) (Math.random() * range);
        if (value % 2 == 0) {
            result = ("yes");
        } else {
            result = ("no");
        }
        System.out.print("Question: " + value + "\n" + "Your answer: ");
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();
        if (value % 2 == 0 && answer.equals("yes")) {
            System.out.println("Correct!");
            Engine.setProcessCount(Engine.getProcessCount() + 1);
        } else if (value % 2 != 0 && answer.equals("no")) {
            System.out.println("Correct!");
            Engine.setProcessCount(Engine.getProcessCount() + 1);
        } else {
            System.out.println("Incorrect");
            Engine.setProcessCount(-1);
            System.out.println("'" + answer
                    + "'" + " is wrong answer ;(. Correct answer was '"
                    + result + "'. Let's try again, " + Cli.getName() + "!");
            return;
        }
    }
}
