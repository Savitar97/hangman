package controller;

import game.Game;
import game.GameState;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import result.GameResult;
import result.GameResultDao;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Arrays;

@Slf4j
public class GameController {
    @FXML
    public Button surrenderGame;
    @FXML
    public Label word;
    @FXML
    public ImageView gallows;
    @FXML
    public Label score;
    @FXML
    public Pane ButtonPane;
    private String themeName;
    private List<Image> gallowImages;
    private Game game;
    private GameResultDao gameResultDao;

    @FXML
    private Label nicknameLabel;
    private String nickName;

    @FXML
    public void initialize() throws Exception {
        log.info("The game started!");
        initializeImages();
        gameResultDao = GameResultDao.getInstance();
        Game.resetGame();
        game=new Game();
        setTheUI();
    }

    private String viewEncrypted(String ve){
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < ve.length(); i++) {
            sb.append(ve.charAt(i)).append(" ");
        }
        return sb.toString();
    }
    public void setNickname(String nickName) {
        this.nickName=nickName;
        nicknameLabel.setText("Hi,"+nickName+"!");
        System.out.println(nickName);
    }

    public void setChoice(Object value) {
    themeName=""+value;
    }

    public void getChoice(ActionEvent actionEvent) throws Exception {
        Button btn=(Button)actionEvent.getSource();
        game.makeGuess(btn.getText());
        btn.setDisable(true);
        btn.setVisible(false);
        setTheUI();
        if (Game.getGameState()==GameState.LOSE|| Game.getGameState()==GameState.WIN)
        {
            disableAllButton();
            gameResultDao.persist(getResult());
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/ranglist.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
            log.info("The game is ended.The gamestate now LOSE or WIN");
        }
        else if (game.isSolvedWord()&& Game.getGameState()== GameState.RUNNING){
            game=new Game();
            resetButtonConfig();
            setTheUI();
        }
    }

    public void setGallowImages(int i){
        switch (i){
            case 0:gallows.setImage(gallowImages.get(0)); break;
            case 1:gallows.setImage(gallowImages.get(1)); break;
            case 2:gallows.setImage(gallowImages.get(2)); break;
            case 3:gallows.setImage(gallowImages.get(3)); break;
            case 4:gallows.setImage(gallowImages.get(4)); break;
            case 5:gallows.setImage(gallowImages.get(5)); break;
            case 6:gallows.setImage(gallowImages.get(6)); break;
            case 7:gallows.setImage(gallowImages.get(7)); break;
            case 8:gallows.setImage(gallowImages.get(8)); break;
            case 9:gallows.setImage(gallowImages.get(9)); break;
        }
    }

    public void disableAllButton(){
        for (Node btn:ButtonPane.getChildren()){
            Button bt=(Button)btn;
            bt.setDisable(true);
            bt.setVisible(false);
        }
    }

    public void setTheUI(){
        word.setText(viewEncrypted(game.getEncryptedWord()));
        score.setText(""+ game.getScore());
        setGallowImages(game.getCountFault());
    }

    public void resetButtonConfig(){
        for (Node btn:ButtonPane.getChildren()){
            Button bt=(Button)btn;
            bt.setDisable(false);
            bt.setVisible(true);
        }
    }

    public void surrenderGame(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/ranglist.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        log.info("The game is surrender.");
    }

    void initializeImages(){
        gallowImages=Arrays.asList(
                new Image(getClass().getResource("/images/hangman1.jpg").toExternalForm()),
                new Image(getClass().getResource("/images/hangman2.jpg").toExternalForm()),
                new Image(getClass().getResource("/images/hangman3.jpg").toExternalForm()),
                new Image(getClass().getResource("/images/hangman4.jpg").toExternalForm()),
                new Image(getClass().getResource("/images/hangman5.jpg").toExternalForm()),
                new Image(getClass().getResource("/images/hangman6.jpg").toExternalForm()),
                new Image(getClass().getResource("/images/hangman7.jpg").toExternalForm()),
                new Image(getClass().getResource("/images/hangman8.jpg").toExternalForm()),
                new Image(getClass().getResource("/images/hangman9.jpg").toExternalForm()),
                new Image(getClass().getResource("/images/hangman10.jpg").toExternalForm())
        );
    }

    private GameResult getResult() {

        GameResult result = GameResult.builder()
                .nickname(nickName)
                .score(game.getScore())
                .build();
        return result;
    }
}
