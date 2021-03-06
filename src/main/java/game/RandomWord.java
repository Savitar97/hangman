package game;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.*;


/**
 *A class for read the themes and select random words.
 */
public class RandomWord {
    static List<String> themeWords;

    /**
     * Initialize the list of words.
     */
     static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(RandomWord.class.getResourceAsStream("/themes/names.json")));
        //themeWords = reader.lines().collect(Collectors.toList());
        Gson gson = new Gson();
        themeWords = gson.fromJson(reader, new TypeToken<List<String>>(){}.getType());
    }

    /**
     * Select a random word.
     * @return The selected word.
     */
    public static String getWord() throws Exception {
        try {
            return themeWords.get((int) (Math.random() * themeWords.size()));
        } catch (NullPointerException e){
            throw new Exception("Missing or empty file!");
        }
    }

}
