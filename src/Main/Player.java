public class Player {
    private Board board;
    private String name;
    private String mark;
    private Game game;

    public Player(String name, String mark, Board board, Game game) {
        this.name = name;
        this.mark = mark;
        this.board = board;
        this.game = game;
    }

    // Method representing the player's turn
    public void turn() {

        // Prompt the player to select a field on the board
        System.out.println("\n" + this.name + "'s turn" + "\n Select field: (i.e. A2, c3 etc..)");
        String selectedField = Main.scanner.nextLine().toLowerCase();

        // Call method to update the board with the selected field
        selectedField(selectedField);
        board.printBoard();

        // Check if the current player has won
        if (this.checkWin()) {
            System.out.println("\n" + this.name + " won the game!\n\n");

            game.askForNewGame();
        }
    }
    public boolean checkWin() {

        // Create a string that represents a winning line (three of the player's marks in a row)
        String line = mark.repeat(3);

        // Check all possible winning combinations on the board
        if ((board.getField(0) + board.getField(1) + board.getField(2)).equals(line)
                || (board.getField(3) + board.getField(4) + board.getField(5)).equals(line)
                || (board.getField(6) + board.getField(7) + board.getField(8)).equals(line)
                || (board.getField(0) + board.getField(3) + board.getField(6)).equals(line)
                || (board.getField(1) + board.getField(4) + board.getField(7)).equals(line)
                || (board.getField(2) + board.getField(5) + board.getField(8)).equals(line)
                || (board.getField(0) + board.getField(4) + board.getField(8)).equals(line)
                || (board.getField(2) + board.getField(4) + board.getField(6)).equals(line)
        ) {
            return true;
        }
        return false;
    }

    // Private method to update the board based on the player's selected field
    private void selectedField(String field) {
        switch (field) {
            case "a1":
                board.setField(mark, 0);
                break;
            case "a2":
                board.setField(mark, 1);
                break;
            case "a3":
                board.setField(mark, 2);
                break;
            case "b1":
                board.setField(mark, 3);
                break;
            case "b2":
                board.setField(mark, 4);
                break;
            case "b3":
                board.setField(mark, 5);
                break;
            case "c1":
                board.setField(mark, 6);
                break;
            case "c2":
                board.setField(mark, 7);
                break;
            case "c3":
                board.setField(mark, 8);
                break;
        }
    }
}
