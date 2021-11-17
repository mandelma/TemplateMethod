package templatemethod;

public class Chess extends Game {
    private int gameRounds = 0;
    @Override
    void initializeGame() {
        System.out.println("Chess game is starting!");
    }

    @Override
    void makePlay(int player) throws InterruptedException {
        if (player == 0) {
            System.out.println("Player1 is playing...");
            Thread.sleep(1000);

        } else if(player == 1) {
            System.out.println("Player2 is playing...");
            Thread.sleep(1000);
            gameRounds++;
        }
    }

    @Override
    boolean endOfGame() {
        // three times for every player
        if(gameRounds < 3) {
            return false;
        }
        return true;
    }

    @Override
    void printWinner() {
        System.out.println("Rounds are finally: " + gameRounds);
        System.out.println("------------------------------------");
        System.out.println("The Chess game winner is... ");
    }
}
