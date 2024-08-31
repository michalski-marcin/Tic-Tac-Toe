import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PlayerTest {
    private Player player;
    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
        player = new Player("Test Player", "X", board, null);
    }

    @Test
    void testHorizontalWin() {
        board.setField("A1", "X");
        board.setField("A2", "X");
        board.setField("A3", "X");
        assertTrue(player.checkWin(), "Player should have a horizontal win");
    }

    @Test
    void testVerticalWin() {
        board.setField("A1", "X");
        board.setField("B1", "X");
        board.setField("C1", "X");
        assertTrue(player.checkWin(), "Player should have a vertical win");
    }

    @Test
    void testDiagonalWin() {
        board.setField("A1", "X");
        board.setField("B2", "X");
        board.setField("C3", "X");
        assertTrue(player.checkWin(), "Player should have a diagonal win");
    }

    @Test
    void testNoWin() {
        board.setField("A1", "X");
        board.setField("A2", "0");
        board.setField("A3", "X");
        assertFalse(player.checkWin(), "There should be no win");
    }

}

