package templatemethod;

import java.util.Random;

public class Monopoly extends Game {
    private Random noppaArvo;

    private int firstPlayerResult = 0;
    private int secondPlayerResult = 0;

    private int gameRounds = 0;
    public Monopoly() {

    }

    @Override
    void initializeGame() {
        System.out.println("Monopol game is starting");
    }

    @Override
    void makePlay(int player) throws InterruptedException {
        if (player == 0) {
            int result1 = heitaNoppa();
            firstPlayerResult += result1;
            System.out.println("Player1, noppa: " + result1);
            Thread.sleep(1000);

        } else if(player == 1) {
            int result2 = heitaNoppa();
            secondPlayerResult += result2;
            System.out.println("Player2, noppa: " + result2);
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
        System.out.println("Monopoly first player's result: " + firstPlayerResult);
        System.out.println("Mpnopoly second player's result: " + secondPlayerResult);
        System.out.println("----------------------------------------------");
        System.out.println("The Monopoly game winner is: " + winner());
    }

    public int heitaNoppa() {
        noppaArvo = new Random();
        return noppaArvo.nextInt(6) + 1;
    }

    public String winner() {
        String winner;
        if(firstPlayerResult > secondPlayerResult) {
            winner = "First player!";
        } else if(secondPlayerResult > firstPlayerResult) {
            winner = "Second player!";
        } else {
            winner = "Both are good!";
        }
        return winner;
    }

}
