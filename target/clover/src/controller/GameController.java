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

@java.lang.SuppressWarnings({"fallthrough"}) public class GameController {public static class __CLR4_3_12vp2vpk9qd40x8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006e\u0065\u006d\u0065\u0073\u0069\u0073\u002f\u0041\u0073\u007a\u0074\u0061\u006c\u002f\u0054\u0061\u006e\u0075\u006c\u0061\u0073\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0068\u0061\u006e\u0067\u006d\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1588468466271L,8589935092L,3824,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public void initialize() throws Exception {try{__CLR4_3_12vp2vpk9qd40x8.R.inc(3733);
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3734);System.out.println("Initialize");
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3735);initializeImages();
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3736);Game.resetGame();
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3737);game=new Game();
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3738);setTheUI();
    }finally{__CLR4_3_12vp2vpk9qd40x8.R.flushNeeded();}}

    private String viewEncrypted(String ve){try{__CLR4_3_12vp2vpk9qd40x8.R.inc(3739);
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3740);StringBuilder sb= new StringBuilder();
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3741);for (int i = 0; (((i < ve.length())&&(__CLR4_3_12vp2vpk9qd40x8.R.iget(3742)!=0|true))||(__CLR4_3_12vp2vpk9qd40x8.R.iget(3743)==0&false)); i++) {{
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3744);sb.append(ve.charAt(i)).append(" ");
        }
        }__CLR4_3_12vp2vpk9qd40x8.R.inc(3745);return sb.toString();
    }finally{__CLR4_3_12vp2vpk9qd40x8.R.flushNeeded();}}
    public void setNickname(String nickName) {try{__CLR4_3_12vp2vpk9qd40x8.R.inc(3746);
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3747);nicknameLabel.setText("Hi,"+nickName+"!");
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3748);System.out.println(nickName);
    }finally{__CLR4_3_12vp2vpk9qd40x8.R.flushNeeded();}}

    public void setChoice(Object value) {try{__CLR4_3_12vp2vpk9qd40x8.R.inc(3749);
    __CLR4_3_12vp2vpk9qd40x8.R.inc(3750);themeName=""+value;
    }finally{__CLR4_3_12vp2vpk9qd40x8.R.flushNeeded();}}

    public void getChoice(ActionEvent actionEvent) throws Exception {try{__CLR4_3_12vp2vpk9qd40x8.R.inc(3751);
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3752);Button btn=(Button)actionEvent.getSource();
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3753);game.makeGuess(btn.getText());
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3754);btn.setDisable(true);
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3755);btn.setVisible(false);
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3756);setTheUI();
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3757);if ((((Game.getGameState()==GameState.LOSE|| Game.getGameState()==GameState.WIN)&&(__CLR4_3_12vp2vpk9qd40x8.R.iget(3758)!=0|true))||(__CLR4_3_12vp2vpk9qd40x8.R.iget(3759)==0&false)))
        {{
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3760);disableAllButton();
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3761);Parent root = FXMLLoader.load(getClass().getResource("/fxml/ranglist.fxml"));
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3762);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3763);stage.setScene(new Scene(root));
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3764);stage.show();
        }
        }else {__CLR4_3_12vp2vpk9qd40x8.R.inc(3765);if ((((game.isSolvedWord()&& Game.getGameState()== GameState.RUNNING)&&(__CLR4_3_12vp2vpk9qd40x8.R.iget(3766)!=0|true))||(__CLR4_3_12vp2vpk9qd40x8.R.iget(3767)==0&false))){{
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3768);game=new Game();
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3769);resetButtonConfig();
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3770);setTheUI();
        }
    }}}finally{__CLR4_3_12vp2vpk9qd40x8.R.flushNeeded();}}

    public void setGallowImages(int i){try{__CLR4_3_12vp2vpk9qd40x8.R.inc(3771);
        boolean __CLB4_3_1_bool0=false;__CLR4_3_12vp2vpk9qd40x8.R.inc(3772);switch (i){
            case 0:if (!__CLB4_3_1_bool0) {__CLR4_3_12vp2vpk9qd40x8.R.inc(3773);__CLB4_3_1_bool0=true;}__CLR4_3_12vp2vpk9qd40x8.R.inc(3774);gallows.setImage(gallowImages.get(0)); __CLR4_3_12vp2vpk9qd40x8.R.inc(3775);break;
            case 1:if (!__CLB4_3_1_bool0) {__CLR4_3_12vp2vpk9qd40x8.R.inc(3776);__CLB4_3_1_bool0=true;}__CLR4_3_12vp2vpk9qd40x8.R.inc(3777);gallows.setImage(gallowImages.get(1)); __CLR4_3_12vp2vpk9qd40x8.R.inc(3778);break;
            case 2:if (!__CLB4_3_1_bool0) {__CLR4_3_12vp2vpk9qd40x8.R.inc(3779);__CLB4_3_1_bool0=true;}__CLR4_3_12vp2vpk9qd40x8.R.inc(3780);gallows.setImage(gallowImages.get(2)); __CLR4_3_12vp2vpk9qd40x8.R.inc(3781);break;
            case 3:if (!__CLB4_3_1_bool0) {__CLR4_3_12vp2vpk9qd40x8.R.inc(3782);__CLB4_3_1_bool0=true;}__CLR4_3_12vp2vpk9qd40x8.R.inc(3783);gallows.setImage(gallowImages.get(3)); __CLR4_3_12vp2vpk9qd40x8.R.inc(3784);break;
            case 4:if (!__CLB4_3_1_bool0) {__CLR4_3_12vp2vpk9qd40x8.R.inc(3785);__CLB4_3_1_bool0=true;}__CLR4_3_12vp2vpk9qd40x8.R.inc(3786);gallows.setImage(gallowImages.get(4)); __CLR4_3_12vp2vpk9qd40x8.R.inc(3787);break;
            case 5:if (!__CLB4_3_1_bool0) {__CLR4_3_12vp2vpk9qd40x8.R.inc(3788);__CLB4_3_1_bool0=true;}__CLR4_3_12vp2vpk9qd40x8.R.inc(3789);gallows.setImage(gallowImages.get(5)); __CLR4_3_12vp2vpk9qd40x8.R.inc(3790);break;
            case 6:if (!__CLB4_3_1_bool0) {__CLR4_3_12vp2vpk9qd40x8.R.inc(3791);__CLB4_3_1_bool0=true;}__CLR4_3_12vp2vpk9qd40x8.R.inc(3792);gallows.setImage(gallowImages.get(6)); __CLR4_3_12vp2vpk9qd40x8.R.inc(3793);break;
            case 7:if (!__CLB4_3_1_bool0) {__CLR4_3_12vp2vpk9qd40x8.R.inc(3794);__CLB4_3_1_bool0=true;}__CLR4_3_12vp2vpk9qd40x8.R.inc(3795);gallows.setImage(gallowImages.get(7)); __CLR4_3_12vp2vpk9qd40x8.R.inc(3796);break;
            case 8:if (!__CLB4_3_1_bool0) {__CLR4_3_12vp2vpk9qd40x8.R.inc(3797);__CLB4_3_1_bool0=true;}__CLR4_3_12vp2vpk9qd40x8.R.inc(3798);gallows.setImage(gallowImages.get(8)); __CLR4_3_12vp2vpk9qd40x8.R.inc(3799);break;
            case 9:if (!__CLB4_3_1_bool0) {__CLR4_3_12vp2vpk9qd40x8.R.inc(3800);__CLB4_3_1_bool0=true;}__CLR4_3_12vp2vpk9qd40x8.R.inc(3801);gallows.setImage(gallowImages.get(9)); __CLR4_3_12vp2vpk9qd40x8.R.inc(3802);break;
        }
    }finally{__CLR4_3_12vp2vpk9qd40x8.R.flushNeeded();}}

    public void disableAllButton(){try{__CLR4_3_12vp2vpk9qd40x8.R.inc(3803);
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3804);for (Node btn:ButtonPane.getChildren()){{
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3805);Button bt=(Button)btn;
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3806);bt.setDisable(true);
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3807);bt.setVisible(false);
        }
    }}finally{__CLR4_3_12vp2vpk9qd40x8.R.flushNeeded();}}

    public void setTheUI(){try{__CLR4_3_12vp2vpk9qd40x8.R.inc(3808);
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3809);word.setText(viewEncrypted(game.getEncryptedWord()));
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3810);score.setText(""+ game.getScore());
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3811);setGallowImages(game.getCountFault());
    }finally{__CLR4_3_12vp2vpk9qd40x8.R.flushNeeded();}}

    public void resetButtonConfig(){try{__CLR4_3_12vp2vpk9qd40x8.R.inc(3812);
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3813);for (Node btn:ButtonPane.getChildren()){{
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3814);Button bt=(Button)btn;
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3815);bt.setDisable(false);
            __CLR4_3_12vp2vpk9qd40x8.R.inc(3816);bt.setVisible(true);
        }
    }}finally{__CLR4_3_12vp2vpk9qd40x8.R.flushNeeded();}}

    public void surrenderGame(ActionEvent actionEvent) throws IOException {try{__CLR4_3_12vp2vpk9qd40x8.R.inc(3817);
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3818);Parent root = FXMLLoader.load(getClass().getResource("/fxml/ranglist.fxml"));
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3819);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3820);stage.setScene(new Scene(root));
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3821);stage.show();
    }finally{__CLR4_3_12vp2vpk9qd40x8.R.flushNeeded();}}

    void initializeImages(){try{__CLR4_3_12vp2vpk9qd40x8.R.inc(3822);
        __CLR4_3_12vp2vpk9qd40x8.R.inc(3823);gallowImages=Arrays.asList(
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
    }finally{__CLR4_3_12vp2vpk9qd40x8.R.flushNeeded();}}
}
