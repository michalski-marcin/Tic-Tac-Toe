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

        System.out.println("\n" + this.name + "'s turn" + "\nSelect field: (i.e. A2, c3 etc..)");


        while (true) {

            // Prompt the player to select a field on the board
            String selectedField = Main.scanner.nextLine().toUpperCase();

            if (board.getField(selectedField) == null) {
                System.out.println("Invalid format.");

            } else if (board.getField(selectedField).isBlank()) {
                board.setField(selectedField, mark);
                break;

            } else {
                System.out.println("Field " + selectedField + " is not empty.");
            }
        }

        board.printBoard();

//         Check if the current player has won
        if (this.checkWin()) {
            System.out.println("\n" + this.name + " won the game!\n\n");

            game.askForNewGame();
        }
    }


    public boolean checkWin() {

        // Create a string that represents a winning line (three of the player's marks in a row)
        String line = mark.repeat(3);

        // Check all possible winning combinations on the board
        if ((board.getField("A1") + board.getField("A2") + board.getField("A3")).equals(line)
                || (board.getField("B1") + board.getField("B2") + board.getField("B3")).equals(line)
                || (board.getField("C1") + board.getField("C2") + board.getField("C3")).equals(line)
                || (board.getField("A1") + board.getField("B1") + board.getField("C1")).equals(line)
                || (board.getField("A2") + board.getField("B2") + board.getField("C2")).equals(line)
                || (board.getField("A3") + board.getField("B3") + board.getField("C3")).equals(line)
                || (board.getField("A1") + board.getField("B2") + board.getField("C3")).equals(line)
                || (board.getField("A3") + board.getField("B2") + board.getField("C1")).equals(line)
        ) {
            return true;
        }
        return false;
    }
}
