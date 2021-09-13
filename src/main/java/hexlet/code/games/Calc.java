package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {

    public static void start() {
        Cli.start();
        System.out.println("What is the result of the expression?");
    }

    public static void process() {
        int first = (int) (Math.random() * 100);
        int second = (int) (Math.random() * 100);
        char[] operations = {'+', '-', '*'};
        int result = 0;
        int index = (int) (Math.random() * 3);

        System.out.print("Question: " + first + " " + operations[index] + " " + second + "\n" + "Your answer: ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        switch (operations[index]) {
            case '+' -> result = first + second;
            case '-' -> result = first - second;
            case '*' -> result = first * second;
        }
        if (answer == result) {
            System.out.println("Correct!");
            Engine.setProcessCount(Engine.getProcessCount() + 1);
        } else {
            System.out.println("Incorrect");
            Engine.setProcessCount(-1);
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + result + "'. Let's try again, " + Cli.name + "!");
            return;
        }
    }
}
