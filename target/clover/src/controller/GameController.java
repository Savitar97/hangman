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

import java.io.IOException;
import java.util.List;
import java.util.Arrays;

@java.lang.SuppressWarnings({"fallthrough"}) public class GameController {public static class __CLR4_3_16363k9q3gbgi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006e\u0065\u006d\u0065\u0073\u0069\u0073\u002f\u0041\u0073\u007a\u0074\u0061\u006c\u002f\u0054\u0061\u006e\u0075\u006c\u0061\u0073\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0068\u0061\u006e\u0067\u006d\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1588452243474L,8589935092L,310,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public Button surrenderGame;
    public Label word;
    public ImageView gallows;
    public Label score;
    public Pane ButtonPane;
    private String themeName;
    private List<Image> gallowImages;
    private Game game;


    @FXML
    private Label nicknameLabel;

    @FXML
    public void initialize(){try{__CLR4_3_16363k9q3gbgi.R.inc(219);
        __CLR4_3_16363k9q3gbgi.R.inc(220);System.out.println("Initialize");
        __CLR4_3_16363k9q3gbgi.R.inc(221);initializeImages();
        __CLR4_3_16363k9q3gbgi.R.inc(222);Game.startGame();
        __CLR4_3_16363k9q3gbgi.R.inc(223);game=new Game();
        __CLR4_3_16363k9q3gbgi.R.inc(224);setTheUI();
    }finally{__CLR4_3_16363k9q3gbgi.R.flushNeeded();}}

    private String viewEncrypted(String ve){try{__CLR4_3_16363k9q3gbgi.R.inc(225);
        __CLR4_3_16363k9q3gbgi.R.inc(226);StringBuilder sb= new StringBuilder();
        __CLR4_3_16363k9q3gbgi.R.inc(227);for (int i = 0; (((i < ve.length())&&(__CLR4_3_16363k9q3gbgi.R.iget(228)!=0|true))||(__CLR4_3_16363k9q3gbgi.R.iget(229)==0&false)); i++) {{
            __CLR4_3_16363k9q3gbgi.R.inc(230);sb.append(ve.charAt(i)).append(" ");
        }
        }__CLR4_3_16363k9q3gbgi.R.inc(231);return sb.toString();
    }finally{__CLR4_3_16363k9q3gbgi.R.flushNeeded();}}
    public void setNickname(String nickName) {try{__CLR4_3_16363k9q3gbgi.R.inc(232);
        __CLR4_3_16363k9q3gbgi.R.inc(233);nicknameLabel.setText("Hi,"+nickName+"!");
        __CLR4_3_16363k9q3gbgi.R.inc(234);System.out.println(nickName);
    }finally{__CLR4_3_16363k9q3gbgi.R.flushNeeded();}}

    public void setChoice(Object value) {try{__CLR4_3_16363k9q3gbgi.R.inc(235);
    __CLR4_3_16363k9q3gbgi.R.inc(236);themeName=""+value;
    }finally{__CLR4_3_16363k9q3gbgi.R.flushNeeded();}}

    public void getChoice(ActionEvent actionEvent) throws Exception {try{__CLR4_3_16363k9q3gbgi.R.inc(237);
        __CLR4_3_16363k9q3gbgi.R.inc(238);Button btn=(Button)actionEvent.getSource();
        __CLR4_3_16363k9q3gbgi.R.inc(239);game.makeGuess(btn.getText());
        __CLR4_3_16363k9q3gbgi.R.inc(240);btn.setDisable(true);
        __CLR4_3_16363k9q3gbgi.R.inc(241);btn.setVisible(false);
        __CLR4_3_16363k9q3gbgi.R.inc(242);setTheUI();
        __CLR4_3_16363k9q3gbgi.R.inc(243);if ((((Game.getGameState()==GameState.LOSE|| Game.getGameState()==GameState.WIN)&&(__CLR4_3_16363k9q3gbgi.R.iget(244)!=0|true))||(__CLR4_3_16363k9q3gbgi.R.iget(245)==0&false)))
        {{
            __CLR4_3_16363k9q3gbgi.R.inc(246);disableAllButton();
            __CLR4_3_16363k9q3gbgi.R.inc(247);Parent root = FXMLLoader.load(getClass().getResource("/fxml/ranglist.fxml"));
            __CLR4_3_16363k9q3gbgi.R.inc(248);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            __CLR4_3_16363k9q3gbgi.R.inc(249);stage.setScene(new Scene(root));
            __CLR4_3_16363k9q3gbgi.R.inc(250);stage.show();
        }
        }else {__CLR4_3_16363k9q3gbgi.R.inc(251);if ((((game.isSolvedWord()&& Game.getGameState()== GameState.RUNNING)&&(__CLR4_3_16363k9q3gbgi.R.iget(252)!=0|true))||(__CLR4_3_16363k9q3gbgi.R.iget(253)==0&false))){{
            __CLR4_3_16363k9q3gbgi.R.inc(254);game=new Game();
            __CLR4_3_16363k9q3gbgi.R.inc(255);resetButtonConfig();
            __CLR4_3_16363k9q3gbgi.R.inc(256);setTheUI();
        }
    }}}finally{__CLR4_3_16363k9q3gbgi.R.flushNeeded();}}

    public void setGallowImages(int i){try{__CLR4_3_16363k9q3gbgi.R.inc(257);
        boolean __CLB4_3_1_bool0=false;__CLR4_3_16363k9q3gbgi.R.inc(258);switch (i){
            case 0:if (!__CLB4_3_1_bool0) {__CLR4_3_16363k9q3gbgi.R.inc(259);__CLB4_3_1_bool0=true;}__CLR4_3_16363k9q3gbgi.R.inc(260);gallows.setImage(gallowImages.get(0)); __CLR4_3_16363k9q3gbgi.R.inc(261);break;
            case 1:if (!__CLB4_3_1_bool0) {__CLR4_3_16363k9q3gbgi.R.inc(262);__CLB4_3_1_bool0=true;}__CLR4_3_16363k9q3gbgi.R.inc(263);gallows.setImage(gallowImages.get(1)); __CLR4_3_16363k9q3gbgi.R.inc(264);break;
            case 2:if (!__CLB4_3_1_bool0) {__CLR4_3_16363k9q3gbgi.R.inc(265);__CLB4_3_1_bool0=true;}__CLR4_3_16363k9q3gbgi.R.inc(266);gallows.setImage(gallowImages.get(2)); __CLR4_3_16363k9q3gbgi.R.inc(267);break;
            case 3:if (!__CLB4_3_1_bool0) {__CLR4_3_16363k9q3gbgi.R.inc(268);__CLB4_3_1_bool0=true;}__CLR4_3_16363k9q3gbgi.R.inc(269);gallows.setImage(gallowImages.get(3)); __CLR4_3_16363k9q3gbgi.R.inc(270);break;
            case 4:if (!__CLB4_3_1_bool0) {__CLR4_3_16363k9q3gbgi.R.inc(271);__CLB4_3_1_bool0=true;}__CLR4_3_16363k9q3gbgi.R.inc(272);gallows.setImage(gallowImages.get(4)); __CLR4_3_16363k9q3gbgi.R.inc(273);break;
            case 5:if (!__CLB4_3_1_bool0) {__CLR4_3_16363k9q3gbgi.R.inc(274);__CLB4_3_1_bool0=true;}__CLR4_3_16363k9q3gbgi.R.inc(275);gallows.setImage(gallowImages.get(5)); __CLR4_3_16363k9q3gbgi.R.inc(276);break;
            case 6:if (!__CLB4_3_1_bool0) {__CLR4_3_16363k9q3gbgi.R.inc(277);__CLB4_3_1_bool0=true;}__CLR4_3_16363k9q3gbgi.R.inc(278);gallows.setImage(gallowImages.get(6)); __CLR4_3_16363k9q3gbgi.R.inc(279);break;
            case 7:if (!__CLB4_3_1_bool0) {__CLR4_3_16363k9q3gbgi.R.inc(280);__CLB4_3_1_bool0=true;}__CLR4_3_16363k9q3gbgi.R.inc(281);gallows.setImage(gallowImages.get(7)); __CLR4_3_16363k9q3gbgi.R.inc(282);break;
            case 8:if (!__CLB4_3_1_bool0) {__CLR4_3_16363k9q3gbgi.R.inc(283);__CLB4_3_1_bool0=true;}__CLR4_3_16363k9q3gbgi.R.inc(284);gallows.setImage(gallowImages.get(8)); __CLR4_3_16363k9q3gbgi.R.inc(285);break;
            case 9:if (!__CLB4_3_1_bool0) {__CLR4_3_16363k9q3gbgi.R.inc(286);__CLB4_3_1_bool0=true;}__CLR4_3_16363k9q3gbgi.R.inc(287);gallows.setImage(gallowImages.get(9)); __CLR4_3_16363k9q3gbgi.R.inc(288);break;
        }
    }finally{__CLR4_3_16363k9q3gbgi.R.flushNeeded();}}

    public void disableAllButton(){try{__CLR4_3_16363k9q3gbgi.R.inc(289);
        __CLR4_3_16363k9q3gbgi.R.inc(290);for (Node btn:ButtonPane.getChildren()){{
            __CLR4_3_16363k9q3gbgi.R.inc(291);Button bt=(Button)btn;
            __CLR4_3_16363k9q3gbgi.R.inc(292);bt.setDisable(true);
            __CLR4_3_16363k9q3gbgi.R.inc(293);bt.setVisible(false);
        }
    }}finally{__CLR4_3_16363k9q3gbgi.R.flushNeeded();}}

    public void setTheUI(){try{__CLR4_3_16363k9q3gbgi.R.inc(294);
        __CLR4_3_16363k9q3gbgi.R.inc(295);word.setText(viewEncrypted(game.getEncryptedWord()));
        __CLR4_3_16363k9q3gbgi.R.inc(296);score.setText(""+ Game.getScore());
        __CLR4_3_16363k9q3gbgi.R.inc(297);setGallowImages(game.getCountFault());
    }finally{__CLR4_3_16363k9q3gbgi.R.flushNeeded();}}

    public void resetButtonConfig(){try{__CLR4_3_16363k9q3gbgi.R.inc(298);
        __CLR4_3_16363k9q3gbgi.R.inc(299);for (Node btn:ButtonPane.getChildren()){{
            __CLR4_3_16363k9q3gbgi.R.inc(300);Button bt=(Button)btn;
            __CLR4_3_16363k9q3gbgi.R.inc(301);bt.setDisable(false);
            __CLR4_3_16363k9q3gbgi.R.inc(302);bt.setVisible(true);
        }
    }}finally{__CLR4_3_16363k9q3gbgi.R.flushNeeded();}}

    public void surrenderGame(ActionEvent actionEvent) throws IOException {try{__CLR4_3_16363k9q3gbgi.R.inc(303);
        __CLR4_3_16363k9q3gbgi.R.inc(304);Parent root = FXMLLoader.load(getClass().getResource("/fxml/ranglist.fxml"));
        __CLR4_3_16363k9q3gbgi.R.inc(305);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_3_16363k9q3gbgi.R.inc(306);stage.setScene(new Scene(root));
        __CLR4_3_16363k9q3gbgi.R.inc(307);stage.show();
    }finally{__CLR4_3_16363k9q3gbgi.R.flushNeeded();}}

    void initializeImages(){try{__CLR4_3_16363k9q3gbgi.R.inc(308);
        __CLR4_3_16363k9q3gbgi.R.inc(309);gallowImages=Arrays.asList(
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
    }finally{__CLR4_3_16363k9q3gbgi.R.flushNeeded();}}
}
