package OddOneOut;

import java.util.Objects;
import java.util.Scanner;

public class Animal extends Game {
    Scanner input = new Scanner(System.in);

    @Override
    void gameStart() {
        Expression lion = new TerminalExpression("Aardvark");
        Expression dog = new TerminalExpression("Eland");
        Expression chicken = new TerminalExpression("Eider");

        String answer = "";

        System.out.println("Game Start!");
        System.out.println("Which of the following are Animals? Choose three.");
        System.out.println(" ");
        System.out.println("Aardvark");
        System.out.println("Eland");
        System.out.println("Tatami");
        System.out.println("Eider");
        System.out.println(" ");

        Expression isAnimal = new AndExpression(lion, dog, chicken);

        while (answer.isEmpty()) {
            answer = input.nextLine();
            Boolean isCorrect = isAnimal.interpret(answer);
            if (isCorrect) {
                System.out.println("You are CORRECT! Aardvark, Eider and Eland are Animals. The odd one out is Tatami.");
                System.out.println(" ");
            }
            else {
                System.out.println("You are INCORRECT. Please try again.");
                System.out.println(" ");
                answer = "";
            }
        }

    }

    @Override
    Boolean gameEnd() {
        String gameStatus = "";

        while (gameStatus.isEmpty()) {
            System.out.println("Game Over. Do you want to play again?");
            System.out.println("Type 'Y' is yes and 'N' if no.");
            gameStatus = input.nextLine();

            if (Objects.equals(gameStatus, "Y")) {
                System.out.println("Game will reinitialize. Enjoy!");
                System.out.println(" ");
                return true;
            }
            else if (Objects.equals(gameStatus, "N")) {
                System.out.println("Game Over. Thank you for playing!");
                System.out.println(" ");
                return false;
            }
            else {
                System.out.println("Invalid input!");
                gameStatus = "";
            }
        }
        return false;
    }
}
