package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Prime {

    public static void start() {
        Cli.start();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static void process() {
        int range = Utils.VALUERANGE;
        int first = (int) (Math.random() * range);
        System.out.print("Question: " + first + " " + "\n" + "Your answer: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        String result;
        if (isPrime(first)) {
            result = "yes";
        } else {
            result = "no";
        }

        if (answer.equals(result)) {
            System.out.println("Correct!");
            Engine.setProcessCount(Engine.getProcessCount() + 1);
        } else {
            System.out.println("Incorrect");
            Engine.setProcessCount(-1);
            System.out.println("'" + answer + "'"
                    + " is wrong answer ;(. Correct answer was '"
                    + result + "'. Let's try again, "
                    + Cli.getName() + "!");
        }

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
