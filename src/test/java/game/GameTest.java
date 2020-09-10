package game;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    private  Game game;
    @BeforeEach
    void initializeGame() throws Exception {
        game=new Game();
    }

    @AfterEach
    void resetGame(){
        Game.resetGame();
    }
    @Test
    void testEncryptedWord() throws Exception {
        game.setWord("Aron");
        assertEquals("____",game.getEncryptedWord());
    }

    @Test
    void testMadeACorrectGuess() throws Exception {
        game.setWord("Anett");
        System.out.println(game.getWord());
        assertTrue(game.makeGuess("N"));
        assertEquals(100,game.getScore());
        assertEquals("_N___",game.getEncryptedWord());
        assertEquals(0,game.getCountFault());
    }

    @Test
    void testLetterAlreadyUsed() throws Exception {
        game.setWord("ANNA");
        assertTrue(game.makeGuess("A"));
        assertTrue(game.checkIsInAlphabet('A'));
        assertEquals(200,game.getScore());
        assertEquals("A__A",game.getEncryptedWord());
        assertEquals(0,game.getCountFault());
        assertThrows(Exception.class,()->game.makeGuess("A"));
        assertEquals(0,game.getCountFault());
    }

    @Test
    void testWrongGuess() throws Exception {
        game.setWord("Aron");
        assertFalse(game.makeGuess("l"));
        assertEquals(1,game.getCountFault());
        assertEquals(0,game.getScore());
        assertEquals("____",game.getEncryptedWord());
    }

    @Test
    void testSolvedWord() throws Exception {
        game.setWord("Pantheon");
        assertAll(
                ()->assertTrue(game.makeGuess("p")),
                ()->assertTrue(game.makeGuess("A")),
                ()->assertTrue(game.makeGuess("n")),
                ()->assertTrue(game.makeGuess("h")),
                ()->assertTrue(game.makeGuess("e")),
                ()->assertTrue(game.makeGuess("t")),
                ()->assertTrue(game.makeGuess("o")),
                ()->assertTrue(game.isSolvedWord()),
                ()->assertEquals(0,game.getCountFault()),
                ()->assertEquals(800,game.getScore())
        );
    }

    @Test
    void testUsedWord() throws Exception {
        game.setWord("Peter");
        assertEquals(Collections.singletonList("PETER"), Game.getUsedWords());
    }

    @Test
    void testLoseGame() throws Exception {
        game.setWord("Szabina");
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

    }

    @Test
    void testNotInAlphabet() throws Exception {
        game.setWord("Jozsi");
        assertThrows(IllegalArgumentException.class,()->game.makeGuess("ó"));
    }

}
