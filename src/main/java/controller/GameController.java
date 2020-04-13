package controller;

import game.Game;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.List;
import java.util.Arrays;

public class GameController {
    public Button surrenderGame;
    public Label word;
    public ImageView gallows;
    public Label score;
    private String nickName;
    private String themeName;
    private List<Image> gallowImages;
    private Game game;


    @FXML
    private Label nicknameLabel;

    @FXML
    public void initialize(){
        System.out.println("Initialize");
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
        game=new Game();
        word.setText(viewEncrypted(game.getEncryptedWord()));
        gallows.setImage(gallowImages.get(0));
    }
    private String viewEncrypted(String ve){
        String sb="";
        for (int i = 0; i < ve.length(); i++) {
            sb+=ve.charAt(i)+" ";
        }
        return sb;
    }
    public void setNickname(String nickName) {
    this.nickName=nickName;
        nicknameLabel.setText("Hi,"+nickName+"!");
        System.out.println(this.nickName);
    }

    public void setChoice(Object value) {
    themeName=""+value;
    }

    public void getChoice(ActionEvent actionEvent) throws Exception {
        Button btn=(Button)actionEvent.getSource();
        String choice=btn.getText();
        game.makeaGuess(btn.getText());
        btn.setVisible(false);
        word.setText(viewEncrypted(game.getEncryptedWord()));
        score.setText(""+game.getScore());
        setGallowImages(game.getCountFault());

    }
    public void setGallowImages(int i){
        switch (game.getCountFault()){
            case 1:gallows.setImage(gallowImages.get(1)); break;
            case 2:gallows.setImage(gallowImages.get(2)); break;
            case 3:gallows.setImage(gallowImages.get(3)); break;
            case 4:gallows.setImage(gallowImages.get(4)); break;
            case 5:gallows.setImage(gallowImages.get(5)); break;
            case 6:gallows.setImage(gallowImages.get(6)); break;
            case 7:gallows.setImage(gallowImages.get(7)); break;
            case 8:gallows.setImage(gallowImages.get(8)); break;
            case 9:gallows.setImage(gallowImages.get(9)); break;
            default:throw new StackOverflowError();
        }
    }
}
