package game;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

/**
 *A class for read the themes and select random words.
 */
public class RandomWord {
    static List<String> themeWords;


    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(RandomWord.class.getResourceAsStream("/themes/words.json")));
        themeWords = reader.lines().collect(Collectors.toList());
        //Gson gson = new Gson();
        //Type stringStringMap = new TypeToken<Map<String, List<String>>>(){}.getType();
        //Map<String,List<String>> map = gson.fromJson(reader, stringStringMap);
        //System.out.println(map);

    }

    /**
     * Select a random word.
     * @return The selected word.
     */
    public static String getWord() {
        if(themeWords.isEmpty()){
             throw new NoSuchElementException();
        }
        return themeWords.get((int) (Math.random() * themeWords.size()));
    }

}
