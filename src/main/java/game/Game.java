package game;

import java.util.ArrayList;

public class Game {
    private static final int score=0;
    private String word;
    private static ArrayList<String> usedWords=new ArrayList<>();
    private ArrayList<Character> usedLetters;

    public Game() {
        word=wordSelector();
        usedLetters=new ArrayList<>();
    }
    private String wordSelector(){
        String temp=RandomWord.getWord();
        if(!usedWords.contains(temp)){
            usedWords.add(temp);
            return temp;
        }
        else return wordSelector();
    }
    public String getWord() {
        return word;
    }

    public static int getScore() {
        return score;
    }
}
