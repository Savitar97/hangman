package game;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    @Test
    void testEncryptedWord() throws Exception {
        Game game=new Game("Aron");
        assertEquals("____",game.getEncryptedWord());
    }

    @Test
    void testMakeAGuessTwoCorrectGuess() throws Exception {
        Game games=new Game("ANNA");
        assertEquals(true,games.makeGuess("A"));
        assertEquals(true,games.checkIsInAlphabet('A'));
        assertEquals(200,games.getScore());
        assertEquals("A__A",games.getEncryptedWord());
        assertEquals(0,games.getCountFault());
        assertThrows(Exception.class,()->games.makeGuess("A"));
        assertEquals(0,games.getCountFault());

    }

}
