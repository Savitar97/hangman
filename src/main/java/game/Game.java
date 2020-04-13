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
    private int countFault=0;
    public Game() {
        word=wordSelector();
        encryptedWord=setEncryptedWord(word);
        usedLetters=new ArrayList<>();
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
        if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z')){
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

    public void makeGuess(String w) throws Exception {
        char searchHelp=w.toUpperCase().charAt(0);
        char[] wordArray=word.toCharArray();
        StringBuilder sb=new StringBuilder(encryptedWord);
        if(checkIsInAlphabet(searchHelp)){
            if (!usedLetters.contains(searchHelp)){
                usedLetters.add(searchHelp);
                boolean find=false;
                for (int i = 0; i <wordArray.length ; i++) {
                    if (wordArray[i]==searchHelp){
                        score+=100;
                        sb.setCharAt(i,searchHelp);
                        find=true;
                    }
                }
                if (find==false){
                    countFault++;
                }

            }
            else {
                throw new Exception("LetterWasUsed");
            }
        }
        encryptedWord=sb.toString();
        System.out.println(encryptedWord);
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
}
