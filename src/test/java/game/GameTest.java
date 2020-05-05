package game;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    @Test
    void testEncryptedWord() throws Exception {
        Game game=new Game("Aron");
        assertEquals("____",game.getEncryptedWord());
        Game.resetGame();
    }

    @Test
    void testMadeACorrectGuess() throws Exception {
        Game game=new Game("anett");
        assertTrue(game.makeGuess("n"));
        assertEquals(100,game.getScore());
        assertEquals("_N___",game.getEncryptedWord());
        assertEquals(0,game.getCountFault());
        Game.resetGame();
    }

    @Test
    void testLetterAlreadyUsed() throws Exception {
        Game games=new Game("ANNA");
        assertTrue(games.makeGuess("A"));
        assertTrue(games.checkIsInAlphabet('A'));
        assertEquals(200,games.getScore());
        assertEquals("A__A",games.getEncryptedWord());
        assertEquals(0,games.getCountFault());
        assertThrows(Exception.class,()->games.makeGuess("A"));
        assertEquals(0,games.getCountFault());
        Game.resetGame();
    }

    @Test
    void testWrongGuess() throws Exception {
        Game game=new Game("Aron");
        assertFalse(game.makeGuess("l"));
        assertEquals(1,game.getCountFault());
        assertEquals(0,game.getScore());
        assertEquals("____",game.getEncryptedWord());
        Game.resetGame();
    }

    @Test
    void testSolvedWord() throws Exception {
        Game game=new Game("Pantheon");
        assertTrue(game.makeGuess("p"));
        assertTrue(game.makeGuess("A"));
        assertTrue(game.makeGuess("n"));
        assertTrue(game.makeGuess("h"));
        assertTrue(game.makeGuess("e"));
        assertTrue(game.makeGuess("t"));
        assertTrue(game.makeGuess("o"));
        assertTrue(game.isSolvedWord());
        assertEquals(0,game.getCountFault());
        assertEquals(800,game.getScore());
        Game.resetGame();
    }

    @Test
    void testUsedWord() throws Exception {
        Game game=new Game("Peter");
        assertEquals(Arrays.asList("Peter"),game.getUsedWords());
        Game.resetGame();
    }

    @Test
    void testLoseGame() throws Exception {
        Game game=new Game("Szabina");
        assertFalse(game.makeGuess("p"));
        assertFalse(game.makeGuess("k"));
        assertFalse(game.makeGuess("l"));
        assertFalse(game.makeGuess("m"));
        assertFalse(game.makeGuess("j"));
        assertFalse(game.makeGuess("o"));
        assertFalse(game.makeGuess("e"));
        assertFalse(game.makeGuess("q"));
        assertFalse(game.makeGuess("v"));
        assertEquals(9,game.getCountFault());
        assertEquals(GameState.LOSE,Game.getGameState());
        Game.resetGame();

    }

    @Test
    void testNotInAlphabet() throws Exception {
        Game game=new Game("Jozsi");
        assertThrows(IllegalArgumentException.class,()->game.makeGuess("ó"));
        Game.resetGame();
    }

}
