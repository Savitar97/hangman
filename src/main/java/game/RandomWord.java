package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 *A class for read the themes and select random words.
 */
public class RandomWord {
    static ArrayList<String> words;

    /**
     * Reading words from a file.
     */
    static {
        ClassLoader classLoader = new RandomWord().getClass().getClassLoader();
        //Path path = new File(RandomWord.class.getResource("/themes/names.txt").getFile()).toPath();
        //words= (ArrayList<String>) Files.readAllLines(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(RandomWord.class.getResourceAsStream("/themes/names.txt")));
        words = (ArrayList<String>) reader.lines().collect(Collectors.toList());
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
