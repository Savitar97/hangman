package game;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class RandomWord {
    static ArrayList<String> words;

    static {
        try {
            ClassLoader classLoader = new RandomWord().getClass().getClassLoader();
            words= (ArrayList<String>) Files.readAllLines(Paths.get(classLoader.getResource("themes/names.txt").getPath()));
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
