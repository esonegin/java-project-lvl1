package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ATTEMPTS = 3;

    public static void flow(String[] questions, String[] correctAnswers, String description) {
        System.out.print("Welcome to the Brain Games!" + "\n" + "May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(description);
        for (int i = 0; i < ATTEMPTS; i++) {
            System.out.print("Question: " + questions[i] + "\n" + "Your answer: ");
            String actualResponse = sc.nextLine();
            if (actualResponse.equals(correctAnswers[i])) {
                System.out.println("Correct!");

            } else {
                System.out.println("Incorrect");
                System.out.println("'" + actualResponse
                        + "'" + " is wrong answer ;(. Correct answer was '"
                        + correctAnswers[i] + "'. Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
