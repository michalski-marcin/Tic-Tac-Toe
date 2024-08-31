
import java.util.HashMap;

public class Board {

    private final HashMap<String, String> board;

    public Board() {    // Constructor to initialize the board with 9 empty spaces

        this.board = new HashMap<>();
        board.put("A1", " ");
        board.put("A2", " ");
        board.put("A3", " ");
        board.put("C1", " ");
        board.put("C2", " ");
        board.put("C3", " ");
        board.put("B1", " ");
        board.put("B2", " ");
        board.put("B3", " ");
    }


    public void setField(String key, String value) {
        this.board.put(key, value);
    }

    public String getField(String key) {
        return board.get(key);
    }

    // Method to print the current state of the board
    public void printBoard()
    {
        System.out.println(
                "   1   2   3 \n" +
                        "A  "+board.get("A1")+" | "+board.get("A2")+" | "+board.get("A3")+" \n" +
                        "  ---|---|---\n" +
                        "B  "+board.get("B1")+" | "+board.get("B2")+" | "+board.get("B3")+" \n" +
                        "  ---|---|---\n" +
                        "C  "+board.get("C1")+" | "+board.get("C2")+" | "+board.get("C3")+" "
        );
    }

}
