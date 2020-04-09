package controller;

import javafx.event.ActionEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

public class LauncherController {
    @FXML
    private Label errorLabel;
    @FXML
    private TextField nicknameTextfield;
    public void runAction(ActionEvent actionEvent) {
        if (nicknameTextfield.getText().isEmpty()) {
            errorLabel.setText("* Username is empty!");
        }
    }
}
