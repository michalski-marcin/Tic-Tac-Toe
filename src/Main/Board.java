import java.util.Arrays;

public class Board {

    private final String[] board;

    public Board() {    // Constructor to initialize the board with 9 empty spaces
        this.board = new String[9];
        Arrays.fill(board, " ");
    }

    public void setField(String mark, int index) {
        this.board[index] = mark;
    }

    public String getField(int index) {
        return board[index];
    }

    // Method to print the current state of the board
    public void printBoard()
    {
        System.out.println(
                "   1   2   3 \n" +
                        "A  "+board[0]+" | "+board[1]+" | "+board[2]+" \n" +
                        "  ---|---|---\n" +
                        "B  "+board[3]+" | "+board[4]+" | "+board[5]+" \n" +
                        "  ---|---|---\n" +
                        "C  "+board[6]+" | "+board[7]+" | "+board[8]+" "
        );
    }
}
