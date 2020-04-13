package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


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
    public static String getWord() {
        if(words.isEmpty()){
            throw new UnsupportedOperationException();
        }
        return words.get((int) (Math.random() * words.size()));
    }

}
