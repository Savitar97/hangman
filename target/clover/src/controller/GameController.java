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
public class GameController {public static class __CLR4_3_13l43l4k9t5unxh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006e\u0065\u006d\u0065\u0073\u0069\u0073\u002f\u0041\u0073\u007a\u0074\u0061\u006c\u002f\u0054\u0061\u006e\u0075\u006c\u0061\u0073\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0068\u0061\u006e\u0067\u006d\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1588637670165L,8589935092L,4742,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public void initialize() throws Exception {try{__CLR4_3_13l43l4k9t5unxh.R.inc(4648);
        __CLR4_3_13l43l4k9t5unxh.R.inc(4649);System.out.println("Initialize");
        __CLR4_3_13l43l4k9t5unxh.R.inc(4650);initializeImages();
        __CLR4_3_13l43l4k9t5unxh.R.inc(4651);Game.resetGame();
        __CLR4_3_13l43l4k9t5unxh.R.inc(4652);game=new Game();
        __CLR4_3_13l43l4k9t5unxh.R.inc(4653);setTheUI();
    }finally{__CLR4_3_13l43l4k9t5unxh.R.flushNeeded();}}

    private String viewEncrypted(String ve){try{__CLR4_3_13l43l4k9t5unxh.R.inc(4654);
        __CLR4_3_13l43l4k9t5unxh.R.inc(4655);StringBuilder sb= new StringBuilder();
        __CLR4_3_13l43l4k9t5unxh.R.inc(4656);for (int i = 0; (((i < ve.length())&&(__CLR4_3_13l43l4k9t5unxh.R.iget(4657)!=0|true))||(__CLR4_3_13l43l4k9t5unxh.R.iget(4658)==0&false)); i++) {{
            __CLR4_3_13l43l4k9t5unxh.R.inc(4659);sb.append(ve.charAt(i)).append(" ");
        }
        }__CLR4_3_13l43l4k9t5unxh.R.inc(4660);return sb.toString();
    }finally{__CLR4_3_13l43l4k9t5unxh.R.flushNeeded();}}
    public void setNickname(String nickName) {try{__CLR4_3_13l43l4k9t5unxh.R.inc(4661);
        __CLR4_3_13l43l4k9t5unxh.R.inc(4662);this.nickName=nickName;
        __CLR4_3_13l43l4k9t5unxh.R.inc(4663);nicknameLabel.setText("Hi,"+nickName+"!");
        __CLR4_3_13l43l4k9t5unxh.R.inc(4664);System.out.println(nickName);
    }finally{__CLR4_3_13l43l4k9t5unxh.R.flushNeeded();}}

    public void setChoice(Object value) {try{__CLR4_3_13l43l4k9t5unxh.R.inc(4665);
    __CLR4_3_13l43l4k9t5unxh.R.inc(4666);themeName=""+value;
    }finally{__CLR4_3_13l43l4k9t5unxh.R.flushNeeded();}}

    public void getChoice(ActionEvent actionEvent) throws Exception {try{__CLR4_3_13l43l4k9t5unxh.R.inc(4667);
        __CLR4_3_13l43l4k9t5unxh.R.inc(4668);Button btn=(Button)actionEvent.getSource();
        __CLR4_3_13l43l4k9t5unxh.R.inc(4669);game.makeGuess(btn.getText());
        __CLR4_3_13l43l4k9t5unxh.R.inc(4670);btn.setDisable(true);
        __CLR4_3_13l43l4k9t5unxh.R.inc(4671);btn.setVisible(false);
        __CLR4_3_13l43l4k9t5unxh.R.inc(4672);setTheUI();
        __CLR4_3_13l43l4k9t5unxh.R.inc(4673);if ((((Game.getGameState()==GameState.LOSE|| Game.getGameState()==GameState.WIN)&&(__CLR4_3_13l43l4k9t5unxh.R.iget(4674)!=0|true))||(__CLR4_3_13l43l4k9t5unxh.R.iget(4675)==0&false)))
        {{
            __CLR4_3_13l43l4k9t5unxh.R.inc(4676);disableAllButton();
            __CLR4_3_13l43l4k9t5unxh.R.inc(4677);Parent root = FXMLLoader.load(getClass().getResource("/fxml/ranglist.fxml"));
            __CLR4_3_13l43l4k9t5unxh.R.inc(4678);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            __CLR4_3_13l43l4k9t5unxh.R.inc(4679);stage.setScene(new Scene(root));
            __CLR4_3_13l43l4k9t5unxh.R.inc(4680);stage.show();
            __CLR4_3_13l43l4k9t5unxh.R.inc(4681);log.info("The game is ended.The gamestate now LOSE or WIN");
        }
        }else {__CLR4_3_13l43l4k9t5unxh.R.inc(4682);if ((((game.isSolvedWord()&& Game.getGameState()== GameState.RUNNING)&&(__CLR4_3_13l43l4k9t5unxh.R.iget(4683)!=0|true))||(__CLR4_3_13l43l4k9t5unxh.R.iget(4684)==0&false))){{
            __CLR4_3_13l43l4k9t5unxh.R.inc(4685);game=new Game();
            __CLR4_3_13l43l4k9t5unxh.R.inc(4686);resetButtonConfig();
            __CLR4_3_13l43l4k9t5unxh.R.inc(4687);setTheUI();
        }
    }}}finally{__CLR4_3_13l43l4k9t5unxh.R.flushNeeded();}}

    public void setGallowImages(int i){try{__CLR4_3_13l43l4k9t5unxh.R.inc(4688);
        boolean __CLB4_3_1_bool0=false;__CLR4_3_13l43l4k9t5unxh.R.inc(4689);switch (i){
            case 0:if (!__CLB4_3_1_bool0) {__CLR4_3_13l43l4k9t5unxh.R.inc(4690);__CLB4_3_1_bool0=true;}__CLR4_3_13l43l4k9t5unxh.R.inc(4691);gallows.setImage(gallowImages.get(0)); __CLR4_3_13l43l4k9t5unxh.R.inc(4692);break;
            case 1:if (!__CLB4_3_1_bool0) {__CLR4_3_13l43l4k9t5unxh.R.inc(4693);__CLB4_3_1_bool0=true;}__CLR4_3_13l43l4k9t5unxh.R.inc(4694);gallows.setImage(gallowImages.get(1)); __CLR4_3_13l43l4k9t5unxh.R.inc(4695);break;
            case 2:if (!__CLB4_3_1_bool0) {__CLR4_3_13l43l4k9t5unxh.R.inc(4696);__CLB4_3_1_bool0=true;}__CLR4_3_13l43l4k9t5unxh.R.inc(4697);gallows.setImage(gallowImages.get(2)); __CLR4_3_13l43l4k9t5unxh.R.inc(4698);break;
            case 3:if (!__CLB4_3_1_bool0) {__CLR4_3_13l43l4k9t5unxh.R.inc(4699);__CLB4_3_1_bool0=true;}__CLR4_3_13l43l4k9t5unxh.R.inc(4700);gallows.setImage(gallowImages.get(3)); __CLR4_3_13l43l4k9t5unxh.R.inc(4701);break;
            case 4:if (!__CLB4_3_1_bool0) {__CLR4_3_13l43l4k9t5unxh.R.inc(4702);__CLB4_3_1_bool0=true;}__CLR4_3_13l43l4k9t5unxh.R.inc(4703);gallows.setImage(gallowImages.get(4)); __CLR4_3_13l43l4k9t5unxh.R.inc(4704);break;
            case 5:if (!__CLB4_3_1_bool0) {__CLR4_3_13l43l4k9t5unxh.R.inc(4705);__CLB4_3_1_bool0=true;}__CLR4_3_13l43l4k9t5unxh.R.inc(4706);gallows.setImage(gallowImages.get(5)); __CLR4_3_13l43l4k9t5unxh.R.inc(4707);break;
            case 6:if (!__CLB4_3_1_bool0) {__CLR4_3_13l43l4k9t5unxh.R.inc(4708);__CLB4_3_1_bool0=true;}__CLR4_3_13l43l4k9t5unxh.R.inc(4709);gallows.setImage(gallowImages.get(6)); __CLR4_3_13l43l4k9t5unxh.R.inc(4710);break;
            case 7:if (!__CLB4_3_1_bool0) {__CLR4_3_13l43l4k9t5unxh.R.inc(4711);__CLB4_3_1_bool0=true;}__CLR4_3_13l43l4k9t5unxh.R.inc(4712);gallows.setImage(gallowImages.get(7)); __CLR4_3_13l43l4k9t5unxh.R.inc(4713);break;
            case 8:if (!__CLB4_3_1_bool0) {__CLR4_3_13l43l4k9t5unxh.R.inc(4714);__CLB4_3_1_bool0=true;}__CLR4_3_13l43l4k9t5unxh.R.inc(4715);gallows.setImage(gallowImages.get(8)); __CLR4_3_13l43l4k9t5unxh.R.inc(4716);break;
            case 9:if (!__CLB4_3_1_bool0) {__CLR4_3_13l43l4k9t5unxh.R.inc(4717);__CLB4_3_1_bool0=true;}__CLR4_3_13l43l4k9t5unxh.R.inc(4718);gallows.setImage(gallowImages.get(9)); __CLR4_3_13l43l4k9t5unxh.R.inc(4719);break;
        }
    }finally{__CLR4_3_13l43l4k9t5unxh.R.flushNeeded();}}

    public void disableAllButton(){try{__CLR4_3_13l43l4k9t5unxh.R.inc(4720);
        __CLR4_3_13l43l4k9t5unxh.R.inc(4721);for (Node btn:ButtonPane.getChildren()){{
            __CLR4_3_13l43l4k9t5unxh.R.inc(4722);Button bt=(Button)btn;
            __CLR4_3_13l43l4k9t5unxh.R.inc(4723);bt.setDisable(true);
            __CLR4_3_13l43l4k9t5unxh.R.inc(4724);bt.setVisible(false);
        }
    }}finally{__CLR4_3_13l43l4k9t5unxh.R.flushNeeded();}}

    public void setTheUI(){try{__CLR4_3_13l43l4k9t5unxh.R.inc(4725);
        __CLR4_3_13l43l4k9t5unxh.R.inc(4726);word.setText(viewEncrypted(game.getEncryptedWord()));
        __CLR4_3_13l43l4k9t5unxh.R.inc(4727);score.setText(""+ game.getScore());
        __CLR4_3_13l43l4k9t5unxh.R.inc(4728);setGallowImages(game.getCountFault());
    }finally{__CLR4_3_13l43l4k9t5unxh.R.flushNeeded();}}

    public void resetButtonConfig(){try{__CLR4_3_13l43l4k9t5unxh.R.inc(4729);
        __CLR4_3_13l43l4k9t5unxh.R.inc(4730);for (Node btn:ButtonPane.getChildren()){{
            __CLR4_3_13l43l4k9t5unxh.R.inc(4731);Button bt=(Button)btn;
            __CLR4_3_13l43l4k9t5unxh.R.inc(4732);bt.setDisable(false);
            __CLR4_3_13l43l4k9t5unxh.R.inc(4733);bt.setVisible(true);
        }
    }}finally{__CLR4_3_13l43l4k9t5unxh.R.flushNeeded();}}

    public void surrenderGame(ActionEvent actionEvent) throws IOException {try{__CLR4_3_13l43l4k9t5unxh.R.inc(4734);
        __CLR4_3_13l43l4k9t5unxh.R.inc(4735);Parent root = FXMLLoader.load(getClass().getResource("/fxml/ranglist.fxml"));
        __CLR4_3_13l43l4k9t5unxh.R.inc(4736);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_3_13l43l4k9t5unxh.R.inc(4737);stage.setScene(new Scene(root));
        __CLR4_3_13l43l4k9t5unxh.R.inc(4738);stage.show();
        __CLR4_3_13l43l4k9t5unxh.R.inc(4739);log.info("The game is surrender.");
    }finally{__CLR4_3_13l43l4k9t5unxh.R.flushNeeded();}}

    void initializeImages(){try{__CLR4_3_13l43l4k9t5unxh.R.inc(4740);
        __CLR4_3_13l43l4k9t5unxh.R.inc(4741);gallowImages=Arrays.asList(
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
    }finally{__CLR4_3_13l43l4k9t5unxh.R.flushNeeded();}}
}
