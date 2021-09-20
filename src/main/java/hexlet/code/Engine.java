package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    private static int processCount;

    public static void flow(String gameNumber) {
        switch (gameNumber) {
            case ("0") -> {
                return;
            }
            case ("1") -> App.greeting();
            case ("2") -> {
                Even.start();
                while (processCount < Utils.ATTEMPTS && processCount != -1) {
                    Even.process();
                }
            }
            case ("3") -> {
                Calc.start();
                while (processCount < Utils.ATTEMPTS && processCount != -1) {
                    Calc.process();
                }
            }
            case ("4") -> {
                GCD.start();
                while (processCount < Utils.ATTEMPTS && processCount != -1) {
                    GCD.process();
                }
            }
            case ("5") -> {
                Progression.start();
                while (processCount < Utils.ATTEMPTS && processCount != -1) {
                    Progression.process();
                }
            }
            case ("6") -> {
                Prime.start();
                while (processCount < Utils.ATTEMPTS && processCount != -1) {
                    Prime.process();
                }
            }

            default -> {
                return;
            }
        }
        if (processCount != -1) {
            System.out.println("Congratulations, " + App.getName() + "!");
        }

    }

    public static int getProcessCount() {
        return processCount;
    }

    public static void setProcessCount(int value) {
        Engine.processCount = value;
    }

    public static String question(String value) {
        System.out.print("Question: " + value + "\n" + "Your answer: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
