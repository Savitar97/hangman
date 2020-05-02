package game;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;


/**
 * Simulating a gameplay.
 */
@Slf4j
public class Game {
    private static int score=0;
    private String word;
    private String encryptedWord;
    private static final ArrayList<String> usedWords=new ArrayList<>();
    private  ArrayList<Character> usedLetters;
    private final int MAX_FAULT=9;
    private boolean solvedWord=false;
    private int countFault=0;
    private static GameState gameState=GameState.RUNNING;

    public Game() {
        System.out.println(gameState);

        if (gameState==GameState.RUNNING){
            word=wordSelector();
            encryptedWord = setEncryptedWord();
        }
    }
    public Game(String w) throws Exception {
        usedLetters=new ArrayList<>();
        w.toUpperCase();
        if(!usedWords.contains(w)){
        setWord(w);
        encryptedWord = setEncryptedWord();
        }
        else throw new Exception("Already used word!");

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
     * @throws IllegalArgumentException if the letter not in the English alphabet.
     */
    public boolean checkIsInAlphabet(char c){
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
    private String setEncryptedWord(){
        return "_".repeat(word.length());
    }

    /**
     * Simulating the user guessing a letter in the world.
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
                log.info("Letter:{} already used!");
                throw new Exception("Already used letter!");
            }
        }
        solvedWord=isSolvedWord(encryptedWord);
        log.info("Now the encryptedWord state: {}",encryptedWord);
        return correctGuess;
    }
    
    /**
     * Checks if the user has lost.
     * @return True if the user has lost else return false.
     */
    private boolean isGameLose(int n){
        if (n==MAX_FAULT){
            setGameState(GameState.LOSE);
            log.info("GameState set:{}",GameState.LOSE);
            return true;
        }
        else
            return false;
    }

    /**
     * Checks if the user has won.
     * @return True if the user has won else return false.
     */
    private boolean isGameWin(){
        if (usedWords.size()==RandomWord.themeWords.size()){
            log.info("GameState set:{}",GameState.WIN);
            return true;
        }else
            return false;
    }

    /**
     * Method that increases the score.
     */
    private void incScore(){
        score+=100;
        log.info("Score increased. Now the current score is:{}",score);
    }

    /**
     * Find the letter in the word.
     * This method finds the letter in the world and modifies the encrypted word
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
                log.info("Char {} was found in the word!",ch);
                sb.setCharAt(i,ch);
            }
        }
        encryptedWord=sb.toString();
        return find;
    }

    /**
     * Checks if the word matches the encrypted one and modifying the game state.
     * The encrypted word is {@param w}.
     * @return True if the user hits the word.
     */
    private boolean isSolvedWord(String w){
        if (w.equals(word)){
            log.info("Solved the word {}",w);
            isGameWin();
            return true;
        }
        else {
            isGameLose(countFault);
            return false;
        }
    }

    /**
     * Initialize the game.
     */
    public static void startGame(){
        setGameState(GameState.RUNNING);
        setScore(0);
        RandomWord.inicializeWords();
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

    public static void setGameState(GameState gameState) {
        Game.gameState = gameState;
    }

    public static void setScore(int score) {
        Game.score = score;
    }

    public void setWord(String word) {
        this.word = word.toUpperCase();
    }

    public ArrayList<Character> getUsedLetters() {
        return usedLetters;
    }

    public String getWord() {
        return word;
    }
}
