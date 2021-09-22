package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;


import java.util.Scanner;

public class App {

    private static final String[] GAMES = new String[]{"1", "2", "3", "4", "5", "6"};
    private static String choice;

    public static void main(String[] args) {
        //Выводим меню и записываем выбор в переменную
        choice = choice();
        //Валидируем выбор
        choiceValidator(choice);
        //Выводим приветствие
        Engine.greeting();
        //Запускаем игру
        startGame(choice);

    }

    public static void startGame(String str) {
        switch (str) {
            case ("1"):
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

    public static void choiceValidator(String str) {
        for (String gamenumber : GAMES) {
            if (str.equals(gamenumber)) {
                return;
            }
        }
        System.exit(0);
    }


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

    public static String getChoice() {
        return choice();
    }
}
