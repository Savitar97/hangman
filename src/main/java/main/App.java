package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/launcher.fxml"));
        stage.setTitle("HangMan");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }
}
