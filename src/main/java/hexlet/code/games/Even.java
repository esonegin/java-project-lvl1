package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;


public class Even {

    private static String answer;
    private static String result;

    public static void start() {
        Cli.start();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    public static void process() {
        int value = (int) (Math.random() * 100);
        if(value % 2 == 0){
            setResult("yes");
        }
        else {
            setResult("no");
        }
        System.out.print("Question: " + value + "\n" + "Your answer: ");
        Scanner sc = new Scanner(System.in);
        setAnswer(sc.nextLine());
        if (value % 2 == 0 && answer.equals("yes")) {
            System.out.println("Correct!");
            Engine.setProcessCount(Engine.getProcessCount() + 1);
        } else if (value % 2 != 0 && answer.equals("no")) {
            System.out.println("Correct!");
            Engine.setProcessCount(Engine.getProcessCount() + 1);
        } else {
            System.out.println("Incorrect");
            Engine.setProcessCount(-1);
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + result + "'. Let's try again, " + Cli.name + "!");
            return;
        }
    }

    public static void setAnswer(String answer) {
        Even.answer = answer;
    }
    public static void setResult(String result) {
        Even.result = result;
    }
}
