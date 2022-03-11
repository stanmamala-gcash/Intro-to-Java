package OddOneOut;

public abstract class Game {
    abstract void gameStart();
    abstract Boolean gameEnd();

    public final Boolean play() {
        boolean playAgain = true;

        gameStart();

        playAgain = gameEnd();
        return playAgain;

    }
}
