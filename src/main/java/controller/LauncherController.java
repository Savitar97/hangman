package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

public class LauncherController {
    ObservableList themes=FXCollections.observableArrayList();
    @FXML
    public Button runButton;
    @FXML
    public ChoiceBox<String> choice;
    @FXML
    private Label errorLabel;
    @FXML
    private TextField nicknameTextfield;
    public void runAction(ActionEvent actionEvent) throws IOException {
        if (nicknameTextfield.getText().isEmpty()) {
            errorLabel.setText("* Username is empty!");
        }
        else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
            Parent root = fxmlLoader.load();
            fxmlLoader.<GameController>getController().setNickname(nicknameTextfield.getText());
            fxmlLoader.<GameController>getController().setChoice(choice.getValue());
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }
    }
    @FXML
    private void uploadData(){
        themes.removeAll(themes);
        themes.addAll("Names");
        choice.getItems().addAll(themes);
    }
}
