package hexlet.code;

import hexlet.code.games.*;

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
            case ("0") -> Engine.setProcessCount(-2);
            case ("1") -> Engine.setProcessCount(-2);
            case ("2") -> {
                Even.start();
                while (processCount < 3 && processCount != -1) {
                    Even.process();
                }
            }
            case ("3") -> {
                Calc.start();
                while (processCount < 3 && processCount != -1) {
                    Calc.process();
                }
            }
            case ("4") -> {
                GCD.start();
                while (processCount < 3 && processCount != -1) {
                    GCD.process();
                }
            }
            case ("5") -> {
                Progression.start();
                while (processCount < 3 && processCount != -1) {
                    Progression.process();
                }
            }
            case ("6") -> {
                Prime.start();
                while (processCount < 3 && processCount != -1) {
                    Prime.process();
                }
            }


        }
        if (processCount == -2) {
            return;
        } else if (processCount != -1) {
            System.out.println("Congratulations, " + Cli.name + "!");
        }

    }

    public static int getProcessCount() {
        return processCount;
    }

    public static void setProcessCount(int processCount) {
        Engine.processCount = processCount;
    }
}
