package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String name = "";

    public static void start() {
        System.out.print("Welcome to the Brain Games!" + "\n" + "May I have your name? ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
