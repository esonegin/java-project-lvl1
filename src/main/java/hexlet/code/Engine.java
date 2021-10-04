package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String name = "";

    private static void greeting() {
        System.out.print("Welcome to the Brain Games!" + "\n" + "May I have your name? ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void flow(String[] questionArray, String[] expectedResponse, String description) {
        greeting();
        int processCount = 0;
        System.out.println(description);
        for (int i = 0; i < Utils.ATTEMPTS; i++) {
            String actualResponse = question(questionArray[i]);
            if (actualResponse.equals(expectedResponse[i])) {
                System.out.println("Correct!");

            } else {
                System.out.println("Incorrect");
                System.out.println("'" + actualResponse
                        + "'" + " is wrong answer ;(. Correct answer was '"
                        + expectedResponse[i] + "'. Let's try again, " + Engine.getName() + "!");
                processCount = -1;
                break;
            }
        }
        if (processCount != -1) {
            System.out.println("Congratulations, " + Engine.getName() + "!");
        }
    }

    public static String question(String value) {
        System.out.print("Question: " + value + "\n" + "Your answer: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String getName() {
        return name;
    }
}
