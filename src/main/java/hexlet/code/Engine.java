package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;


public class Engine {

    private static int processCount;

    public static String choice() {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void flow(String gameNumber) {
        switch (gameNumber) {
            case ("0") -> {
                return;
            }
            case ("1") -> Cli.start();
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
                break;
            }


        }
        if (processCount != -1) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }

    }

    public static int getProcessCount() {
        return processCount;
    }


    public static void setProcessCount(int value) {
        Engine.processCount = value;
    }
}
