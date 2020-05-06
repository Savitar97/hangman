package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import result.GameResult;
import result.GameResultDao;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class RanglistController {
    @FXML
    private TableView<GameResult> ranglistTable;
    @FXML
    private TableColumn<GameResult, String> nickname;
    @FXML
    private TableColumn<GameResult, Integer> score;
    @FXML
    private TableColumn<GameResult, ZonedDateTime> created;

    private GameResultDao gameResultDao;


    public void setMainMenu(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/launcher.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void initialize(){
        gameResultDao = GameResultDao.getInstance();
        List<GameResult> rangList = gameResultDao.findAll();
        nickname.setCellValueFactory(new PropertyValueFactory<>("nickname"));
        score.setCellValueFactory(new PropertyValueFactory<>("score"));
        created.setCellValueFactory(new PropertyValueFactory<>("created"));

        created.setCellFactory(column -> {
            TableCell<GameResult, ZonedDateTime> cell = new TableCell<GameResult, ZonedDateTime>() {
                private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd - HH:mm:ss Z");

                @Override
                protected void updateItem(ZonedDateTime item, boolean empty) {
                    super.updateItem(item, empty);
                    if(empty) {
                        setText(null);
                    }
                    else {
                        setText(item.format(formatter));
                    }
                }
            };

            return cell;
        });
        ObservableList<GameResult> observableResult = FXCollections.observableArrayList();
        observableResult.addAll(rangList);

        ranglistTable.setItems(observableResult);

    }
}
