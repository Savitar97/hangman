package game;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Game {
    private static int score=0;
    private String word;
    private String encryptedWord;
    private static ArrayList<String> usedWords=new ArrayList<>();
    private ArrayList<Character> usedLetters;
    private final int MAX_FAULT=9;
    private boolean solvedWord=false;
    private int countFault=0;

    public Game() {
        word=wordSelector();
        usedLetters=new ArrayList<>();
        encryptedWord=setEncryptedWord(word);
    }

    private String wordSelector(){
        String temp=RandomWord.getWord().toUpperCase();
        if(!usedWords.contains(temp)){
            usedWords.add(temp);
            return temp;
        }
        else{
            return wordSelector();
        }
    }

    private boolean checkIsInAlphabet(char c){
        if(c >= 'A' && c <= 'Z'){
            return true;
        }
        else {
            throw new NoSuchElementException();
        }
    }
    
    private String setEncryptedWord(String w){
        String ew = "";
        for (int i = 0; i <word.length() ; i++) {
            ew+="_";
        }
        return ew;
    }

    public boolean makeGuess(String w) throws Exception {
        char searchHelp=w.toUpperCase().charAt(0);
        boolean correctGuess=false;
        if(checkIsInAlphabet(searchHelp)){
            if (!usedLetters.contains(searchHelp)){
                usedLetters.add(searchHelp);
                correctGuess=findTheWord(searchHelp);
                if (correctGuess==false){
                    countFault++;
                }
            }
            else {
                throw new Exception("LetterWasUsed");
            }
        }
        solvedWord=isSolvedWord(encryptedWord);
        return correctGuess;
    }

    private void incScore(){
        score+=100;
    }

    private boolean findTheWord(char ch){
        char[] wordArray=word.toCharArray();
        StringBuilder sb=new StringBuilder(encryptedWord);
        boolean find=false;
        for (int i = 0; i <wordArray.length ; i++) {
            if (wordArray[i]==ch){
                incScore();
                find=true;
                sb.setCharAt(i,ch);
            }
        }
        encryptedWord=sb.toString();
        return find;
    }

    private boolean isSolvedWord(String w){
        if(w.equals(word))
            return true;
        else return false;
    }

    public boolean isWin(){
        return usedWords.containsAll(RandomWord.words);
    }
    public String getWord() {
        return word;
    }
    public static int getScore() {
        return score;
    }
    public String getEncryptedWord() {
        return encryptedWord;
    }
    public int getCountFault() {
        return countFault;
    }

    public boolean isSolvedWord() {
        return solvedWord;
    }
}
