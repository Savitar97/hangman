package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *A class for read the themes and select random words.
 */
public class RandomWord {
    static ArrayList<String> words;

    static {
        try {
            ClassLoader classLoader = new RandomWord().getClass().getClassLoader();
            Path path = new File(RandomWord.class.getResource("/themes/names.txt").getFile()).toPath();
            words= (ArrayList<String>) Files.readAllLines(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Select a random word.
     * @return The selected word.
     */
    public static String getWord() {
        if(words.isEmpty()){
            throw new NoSuchElementException();
        }
        return words.get((int) (Math.random() * words.size()));
    }

}
