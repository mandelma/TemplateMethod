package templatemethod;

public abstract class Game {
    protected int playersCount;
    abstract void initializeGame();
    abstract void makePlay(int player) throws InterruptedException;
    abstract boolean endOfGame();
    abstract void printWinner();

    public final void PlayOneGame(int playersCount) throws InterruptedException {
        this.playersCount = playersCount;
        initializeGame();
        int j = 0;
        while(!endOfGame()) {
            makePlay(j);
            j = (j + 1) % playersCount;
        }
        printWinner();
    }
}
