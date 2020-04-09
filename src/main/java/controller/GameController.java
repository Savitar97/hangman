package controller;

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
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.awt.*;

public class GameController {
    private String nickName;
    private String themeName;
    @FXML
    private Label nicknameLabel;

    public void setNickname(String nickName) {
    this.nickName=nickName;
        nicknameLabel.setText("Hi,"+nickName+"!");
        System.out.println(this.nickName);
    }

    public void setChoice(Object value) {
    themeName=""+value;
    }
}
