package controller;

import game.RandomWord;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.awt.*;
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
        String szo=RandomWord.getWord().toUpperCase();
        word.setText(szo);
    }

    public void setNickname(String nickName) {
    this.nickName=nickName;
        nicknameLabel.setText("Hi,"+nickName+"!");
        gallows.setImage(new Image(String.valueOf(getClass().getResource("/images/hangman1.jpg"))));
        System.out.println(this.nickName);
    }

    public void setChoice(Object value) {
    themeName=""+value;
    }

    public void getChoice(ActionEvent actionEvent) {
        Button btn=(Button)actionEvent.getSource();
        String choice=btn.getText();
        System.out.println(choice);
        btn.setVisible(false);
        btn.setDisable(true);
    }
}
