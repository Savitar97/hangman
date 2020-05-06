/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package controller;

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

import java.io.IOException;
import java.util.List;
import java.util.Arrays;

@java.lang.SuppressWarnings({"fallthrough"}) @Slf4j
public class GameController {public static class __CLR4_3_140p40pk9vi8rbd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006e\u0065\u006d\u0065\u0073\u0069\u0073\u002f\u0041\u0073\u007a\u0074\u0061\u006c\u002f\u0054\u0061\u006e\u0075\u006c\u0061\u0073\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0068\u0061\u006e\u0067\u006d\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1588779416007L,8589935092L,5303,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    @FXML
    private Label nicknameLabel;
    private String nickName;

    @FXML
    public void initialize() throws Exception {try{__CLR4_3_140p40pk9vi8rbd.R.inc(5209);
        __CLR4_3_140p40pk9vi8rbd.R.inc(5210);log.info("The game started!");
        __CLR4_3_140p40pk9vi8rbd.R.inc(5211);initializeImages();
        __CLR4_3_140p40pk9vi8rbd.R.inc(5212);Game.resetGame();
        __CLR4_3_140p40pk9vi8rbd.R.inc(5213);game=new Game();
        __CLR4_3_140p40pk9vi8rbd.R.inc(5214);setTheUI();
    }finally{__CLR4_3_140p40pk9vi8rbd.R.flushNeeded();}}

    private String viewEncrypted(String ve){try{__CLR4_3_140p40pk9vi8rbd.R.inc(5215);
        __CLR4_3_140p40pk9vi8rbd.R.inc(5216);StringBuilder sb= new StringBuilder();
        __CLR4_3_140p40pk9vi8rbd.R.inc(5217);for (int i = 0; (((i < ve.length())&&(__CLR4_3_140p40pk9vi8rbd.R.iget(5218)!=0|true))||(__CLR4_3_140p40pk9vi8rbd.R.iget(5219)==0&false)); i++) {{
            __CLR4_3_140p40pk9vi8rbd.R.inc(5220);sb.append(ve.charAt(i)).append(" ");
        }
        }__CLR4_3_140p40pk9vi8rbd.R.inc(5221);return sb.toString();
    }finally{__CLR4_3_140p40pk9vi8rbd.R.flushNeeded();}}
    public void setNickname(String nickName) {try{__CLR4_3_140p40pk9vi8rbd.R.inc(5222);
        __CLR4_3_140p40pk9vi8rbd.R.inc(5223);this.nickName=nickName;
        __CLR4_3_140p40pk9vi8rbd.R.inc(5224);nicknameLabel.setText("Hi,"+nickName+"!");
        __CLR4_3_140p40pk9vi8rbd.R.inc(5225);System.out.println(nickName);
    }finally{__CLR4_3_140p40pk9vi8rbd.R.flushNeeded();}}

    public void setChoice(Object value) {try{__CLR4_3_140p40pk9vi8rbd.R.inc(5226);
    __CLR4_3_140p40pk9vi8rbd.R.inc(5227);themeName=""+value;
    }finally{__CLR4_3_140p40pk9vi8rbd.R.flushNeeded();}}

    public void getChoice(ActionEvent actionEvent) throws Exception {try{__CLR4_3_140p40pk9vi8rbd.R.inc(5228);
        __CLR4_3_140p40pk9vi8rbd.R.inc(5229);Button btn=(Button)actionEvent.getSource();
        __CLR4_3_140p40pk9vi8rbd.R.inc(5230);game.makeGuess(btn.getText());
        __CLR4_3_140p40pk9vi8rbd.R.inc(5231);btn.setDisable(true);
        __CLR4_3_140p40pk9vi8rbd.R.inc(5232);btn.setVisible(false);
        __CLR4_3_140p40pk9vi8rbd.R.inc(5233);setTheUI();
        __CLR4_3_140p40pk9vi8rbd.R.inc(5234);if ((((Game.getGameState()==GameState.LOSE|| Game.getGameState()==GameState.WIN)&&(__CLR4_3_140p40pk9vi8rbd.R.iget(5235)!=0|true))||(__CLR4_3_140p40pk9vi8rbd.R.iget(5236)==0&false)))
        {{
            __CLR4_3_140p40pk9vi8rbd.R.inc(5237);disableAllButton();
            __CLR4_3_140p40pk9vi8rbd.R.inc(5238);Parent root = FXMLLoader.load(getClass().getResource("/fxml/ranglist.fxml"));
            __CLR4_3_140p40pk9vi8rbd.R.inc(5239);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            __CLR4_3_140p40pk9vi8rbd.R.inc(5240);stage.setScene(new Scene(root));
            __CLR4_3_140p40pk9vi8rbd.R.inc(5241);stage.show();
            __CLR4_3_140p40pk9vi8rbd.R.inc(5242);log.info("The game is ended.The gamestate now LOSE or WIN");
        }
        }else {__CLR4_3_140p40pk9vi8rbd.R.inc(5243);if ((((game.isSolvedWord()&& Game.getGameState()== GameState.RUNNING)&&(__CLR4_3_140p40pk9vi8rbd.R.iget(5244)!=0|true))||(__CLR4_3_140p40pk9vi8rbd.R.iget(5245)==0&false))){{
            __CLR4_3_140p40pk9vi8rbd.R.inc(5246);game=new Game();
            __CLR4_3_140p40pk9vi8rbd.R.inc(5247);resetButtonConfig();
            __CLR4_3_140p40pk9vi8rbd.R.inc(5248);setTheUI();
        }
    }}}finally{__CLR4_3_140p40pk9vi8rbd.R.flushNeeded();}}

    public void setGallowImages(int i){try{__CLR4_3_140p40pk9vi8rbd.R.inc(5249);
        boolean __CLB4_3_1_bool0=false;__CLR4_3_140p40pk9vi8rbd.R.inc(5250);switch (i){
            case 0:if (!__CLB4_3_1_bool0) {__CLR4_3_140p40pk9vi8rbd.R.inc(5251);__CLB4_3_1_bool0=true;}__CLR4_3_140p40pk9vi8rbd.R.inc(5252);gallows.setImage(gallowImages.get(0)); __CLR4_3_140p40pk9vi8rbd.R.inc(5253);break;
            case 1:if (!__CLB4_3_1_bool0) {__CLR4_3_140p40pk9vi8rbd.R.inc(5254);__CLB4_3_1_bool0=true;}__CLR4_3_140p40pk9vi8rbd.R.inc(5255);gallows.setImage(gallowImages.get(1)); __CLR4_3_140p40pk9vi8rbd.R.inc(5256);break;
            case 2:if (!__CLB4_3_1_bool0) {__CLR4_3_140p40pk9vi8rbd.R.inc(5257);__CLB4_3_1_bool0=true;}__CLR4_3_140p40pk9vi8rbd.R.inc(5258);gallows.setImage(gallowImages.get(2)); __CLR4_3_140p40pk9vi8rbd.R.inc(5259);break;
            case 3:if (!__CLB4_3_1_bool0) {__CLR4_3_140p40pk9vi8rbd.R.inc(5260);__CLB4_3_1_bool0=true;}__CLR4_3_140p40pk9vi8rbd.R.inc(5261);gallows.setImage(gallowImages.get(3)); __CLR4_3_140p40pk9vi8rbd.R.inc(5262);break;
            case 4:if (!__CLB4_3_1_bool0) {__CLR4_3_140p40pk9vi8rbd.R.inc(5263);__CLB4_3_1_bool0=true;}__CLR4_3_140p40pk9vi8rbd.R.inc(5264);gallows.setImage(gallowImages.get(4)); __CLR4_3_140p40pk9vi8rbd.R.inc(5265);break;
            case 5:if (!__CLB4_3_1_bool0) {__CLR4_3_140p40pk9vi8rbd.R.inc(5266);__CLB4_3_1_bool0=true;}__CLR4_3_140p40pk9vi8rbd.R.inc(5267);gallows.setImage(gallowImages.get(5)); __CLR4_3_140p40pk9vi8rbd.R.inc(5268);break;
            case 6:if (!__CLB4_3_1_bool0) {__CLR4_3_140p40pk9vi8rbd.R.inc(5269);__CLB4_3_1_bool0=true;}__CLR4_3_140p40pk9vi8rbd.R.inc(5270);gallows.setImage(gallowImages.get(6)); __CLR4_3_140p40pk9vi8rbd.R.inc(5271);break;
            case 7:if (!__CLB4_3_1_bool0) {__CLR4_3_140p40pk9vi8rbd.R.inc(5272);__CLB4_3_1_bool0=true;}__CLR4_3_140p40pk9vi8rbd.R.inc(5273);gallows.setImage(gallowImages.get(7)); __CLR4_3_140p40pk9vi8rbd.R.inc(5274);break;
            case 8:if (!__CLB4_3_1_bool0) {__CLR4_3_140p40pk9vi8rbd.R.inc(5275);__CLB4_3_1_bool0=true;}__CLR4_3_140p40pk9vi8rbd.R.inc(5276);gallows.setImage(gallowImages.get(8)); __CLR4_3_140p40pk9vi8rbd.R.inc(5277);break;
            case 9:if (!__CLB4_3_1_bool0) {__CLR4_3_140p40pk9vi8rbd.R.inc(5278);__CLB4_3_1_bool0=true;}__CLR4_3_140p40pk9vi8rbd.R.inc(5279);gallows.setImage(gallowImages.get(9)); __CLR4_3_140p40pk9vi8rbd.R.inc(5280);break;
        }
    }finally{__CLR4_3_140p40pk9vi8rbd.R.flushNeeded();}}

    public void disableAllButton(){try{__CLR4_3_140p40pk9vi8rbd.R.inc(5281);
        __CLR4_3_140p40pk9vi8rbd.R.inc(5282);for (Node btn:ButtonPane.getChildren()){{
            __CLR4_3_140p40pk9vi8rbd.R.inc(5283);Button bt=(Button)btn;
            __CLR4_3_140p40pk9vi8rbd.R.inc(5284);bt.setDisable(true);
            __CLR4_3_140p40pk9vi8rbd.R.inc(5285);bt.setVisible(false);
        }
    }}finally{__CLR4_3_140p40pk9vi8rbd.R.flushNeeded();}}

    public void setTheUI(){try{__CLR4_3_140p40pk9vi8rbd.R.inc(5286);
        __CLR4_3_140p40pk9vi8rbd.R.inc(5287);word.setText(viewEncrypted(game.getEncryptedWord()));
        __CLR4_3_140p40pk9vi8rbd.R.inc(5288);score.setText(""+ game.getScore());
        __CLR4_3_140p40pk9vi8rbd.R.inc(5289);setGallowImages(game.getCountFault());
    }finally{__CLR4_3_140p40pk9vi8rbd.R.flushNeeded();}}

    public void resetButtonConfig(){try{__CLR4_3_140p40pk9vi8rbd.R.inc(5290);
        __CLR4_3_140p40pk9vi8rbd.R.inc(5291);for (Node btn:ButtonPane.getChildren()){{
            __CLR4_3_140p40pk9vi8rbd.R.inc(5292);Button bt=(Button)btn;
            __CLR4_3_140p40pk9vi8rbd.R.inc(5293);bt.setDisable(false);
            __CLR4_3_140p40pk9vi8rbd.R.inc(5294);bt.setVisible(true);
        }
    }}finally{__CLR4_3_140p40pk9vi8rbd.R.flushNeeded();}}

    public void surrenderGame(ActionEvent actionEvent) throws IOException {try{__CLR4_3_140p40pk9vi8rbd.R.inc(5295);
        __CLR4_3_140p40pk9vi8rbd.R.inc(5296);Parent root = FXMLLoader.load(getClass().getResource("/fxml/ranglist.fxml"));
        __CLR4_3_140p40pk9vi8rbd.R.inc(5297);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_3_140p40pk9vi8rbd.R.inc(5298);stage.setScene(new Scene(root));
        __CLR4_3_140p40pk9vi8rbd.R.inc(5299);stage.show();
        __CLR4_3_140p40pk9vi8rbd.R.inc(5300);log.info("The game is surrender.");
    }finally{__CLR4_3_140p40pk9vi8rbd.R.flushNeeded();}}

    void initializeImages(){try{__CLR4_3_140p40pk9vi8rbd.R.inc(5301);
        __CLR4_3_140p40pk9vi8rbd.R.inc(5302);gallowImages=Arrays.asList(
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
    }finally{__CLR4_3_140p40pk9vi8rbd.R.flushNeeded();}}
}
