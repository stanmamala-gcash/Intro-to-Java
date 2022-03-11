package OddOneOut;

import java.util.Objects;
import java.util.Scanner;

public class Thing extends Game {
    Scanner input = new Scanner(System.in);

    @Override
    void gameStart() {
        Expression lion = new TerminalExpression("Larimar");
        Expression dog = new TerminalExpression("Pith");
        Expression chicken = new TerminalExpression("Aglet");

        String answer = "";

        System.out.println("Game Start!");
        System.out.println("Which of the following are Things? Choose three.");
        System.out.println(" ");
        System.out.println("Cyclopteridae");
        System.out.println("Larimar");
        System.out.println("Pith");
        System.out.println("Aglet");
        System.out.println(" ");

        Expression isThing = new AndExpression(lion, dog, chicken);

        while (answer.isEmpty()) {
            answer = input.nextLine();
            Boolean isCorrect = isThing.interpret(answer);
            if (isCorrect) {
                System.out.println("You are CORRECT! Aglet, Larimar and Pith are Things. The odd one out is Cyclopteridae.");
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
