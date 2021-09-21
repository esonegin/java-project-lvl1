package hexlet.code;

import java.util.Scanner;

public class App {

    private static String name = "";
    private static final String[] GAMES = new String[]{"1", "2", "3", "4", "5", "6"};

    public static void main(String[] args) {

        //Выводим меню
        String choice = choice();
        choiceValidator(choice);
        Engine.flow(choice);
        greeting();


    }

    public static void choiceValidator(String choice) {
        for (String gamenumber : GAMES) {
            if (choice.equals(gamenumber)) {
                return;
            }
        }
        System.exit(0);
    }

    public static void greeting() {
        System.out.print("Welcome to the Brain Games!" + "\n" + "May I have your name? ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
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

    public static String getName() {
        return name;
    }
}
