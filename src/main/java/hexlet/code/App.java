package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Выводим меню
        printMenu();
        //Запускаем игру
        Scanner sc = new Scanner(System.in);
        startGame(sc.nextLine());

    }

    public static void startGame(String str) {
        switch (str) {
            case ("1"):
                Cli.greeting();
                break;
            case ("2"):
                Even.process();
                break;
            case ("3"):
                Calc.process();
                break;
            case ("4"):
                GCD.process();
                break;
            case ("5"):
                Progression.process();
                break;
            case ("6"):
                Prime.process();
                break;
            default:
                break;
        }
    }

    public static void printMenu() {
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
    }
}
