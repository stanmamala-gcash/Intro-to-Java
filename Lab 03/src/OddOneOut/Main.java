package OddOneOut;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Program
        Scanner input = new Scanner(System.in);
        boolean polling = true;
        String category = "";

        while(polling) {
            System.out.println("Choose a category. Type 'A' for Animals or 'B' for Things.");
            category = input.nextLine();
            if (Objects.equals(category, "A")) {
                Game game = new Animal();
                polling = game.play();
            }
            else if (Objects.equals(category, "B")) {
                Game game = new Thing();
                polling = game.play();
            }
            else {
                System.out.println("Invalid input!");
            }
        }
    }
}
