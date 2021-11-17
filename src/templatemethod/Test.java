package templatemethod;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Game monopoly = new Monopoly();
        monopoly.PlayOneGame(2);

        System.out.println("---------------------------------------------");
        Game chess = new Chess();
        chess.PlayOneGame(2);

    }
}
