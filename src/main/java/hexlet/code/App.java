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
        System.out.println("Please enter the game number and press Enter.");
        printMenu();
        System.out.print("Your choice:\s");
        //Запускаем игру
        Scanner sc = new Scanner(System.in);
        startGame(sc.nextLine());

    }

    public static void startGame(String str) {
        switch (str) {
            case ("1") -> Cli.greeting();
            case ("2") -> Even.process();
            case ("3") -> Calc.process();
            case ("4") -> GCD.process();
            case ("5") -> Progression.process();
            case ("6") -> Prime.process();
            default -> {
            }
        }
    }

    public static void printMenu() {
        System.out.print("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
    }
}
