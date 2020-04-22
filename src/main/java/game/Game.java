package game;

import java.util.ArrayList;

/**
 * Simulating a gameplay.
 */
public class Game {
    private static int score=0;
    private String word;
    private String encryptedWord;
    private static ArrayList<String> usedWords=new ArrayList<>();
    private ArrayList<Character> usedLetters;
    private final int MAX_FAULT=9;
    private boolean solvedWord=false;
    private int countFault=0;
    private static GameState gameState=GameState.RUNNING;

    public Game() {

        usedLetters=new ArrayList<>();
        if(gameState==GameState.RUNNING) {
            word=wordSelector();
        }
            encryptedWord = setEncryptedWord(word);
    }

    /**
     * Select a word with {@link RandomWord#getWord()}.
     * Select a random word and add to the used words list,if the word has not been used yet else
     * select a new word.
     * @return The selected word.
     */
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

    /**
     * Check the guessed letter is in the English alphabet.
     * The guessed letter is {@param c}.
     * @return True, if the guessed letter is correct.
     * @throws IllegalArgumentException The letter not in the English alphabet.
     */
    private boolean checkIsInAlphabet(char c){
        if(c >= 'A' && c <= 'Z'){
            return true;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Making the encrypted word string.
     * The selected word is {@param w}.
     * @return The encrypted word.
     */
    private String setEncryptedWord(String w){
        return "_".repeat(word.length());
    }

    /**
     * Simulating the user guessing a letter in the world and modify the game state.
     * The guessed letter is {@param w}.
     * @return True if the guess is correct,false otherwise.
     * @throws Exception LetterWasUsed
     */
    public boolean makeGuess(String w) throws Exception {
        char searchHelp=w.toUpperCase().charAt(0);
        boolean correctGuess=false;
        if(checkIsInAlphabet(searchHelp)){
            if (!usedLetters.contains(searchHelp)){
                usedLetters.add(searchHelp);
                correctGuess=findTheLetter(searchHelp);
                if (!correctGuess){
                    countFault++;
                }
            }
            else {
                throw new Exception("LetterWasUsed");
            }
        }
        solvedWord=isSolvedWord(encryptedWord);
        if(countFault==MAX_FAULT){
            gameState=GameState.LOSE;
        }
        return correctGuess;
    }

    /**
     * Method that increase the score.
     */
    private void incScore(){
        score+=100;
    }

    /**
     * Find the letter in the word.
     * This method finding the letter in the world and modify the encrypted word
     * with the letters found.
     * The guessed letter is {@param ch}.
     * @return True if the word contains the letter,false otherwise.
     */
    private boolean findTheLetter(char ch){
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

    /**
     * Checks if the word matches the encrypted one.
     * The encrypted word is {@param w}.
     * @return True if the user hits the word.
     */
    private boolean isSolvedWord(String w){
        return w.equals(word);
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

    public static GameState getGameState() {
        return gameState;
    }
}
