
public class Game {

    public void askForNewGame() {

        String startGame;
        do {
            System.out.println("Do you want to start new game? Y/N");
            startGame = Main.scanner.nextLine().toLowerCase();
        } while (!startGame.equals("y") && (!startGame.equals("n")));

        if (startGame.equals("y")) {
            newGame();
        } else {
            System.exit(0);
        }
    }

    public void newGame() {

        int turn = 1;
        Board board = new Board();

        System.out.println("Player's one name:");
        Player playerOne = new Player(Main.scanner.nextLine(), "O", board, this);

        System.out.println("Second player's name:");
        Player playerTwo = new Player(Main.scanner.nextLine(), "X", board, this);

        board.printBoard();

        while (turn < 9) {
            playerOne.turn();
            playerTwo.turn();
            turn++;
        }
        if (turn == 9) {
            System.out.println("\nDraw\n\n");
            newGame();
        }
    }
}
