/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package controller;

import game.Game;
import game.GameState;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.List;
import java.util.Arrays;

@java.lang.SuppressWarnings({"fallthrough"}) public class GameController {public static class __CLR4_3_100k9lin9hh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006e\u0065\u006d\u0065\u0073\u0069\u0073\u002f\u0041\u0073\u007a\u0074\u0061\u006c\u002f\u0054\u0061\u006e\u0075\u006c\u0061\u0073\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0068\u0061\u006e\u0067\u006d\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1588175431025L,8589935092L,79,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public void initialize(){try{__CLR4_3_100k9lin9hh.R.inc(0);
        __CLR4_3_100k9lin9hh.R.inc(1);System.out.println("Initialize");
        __CLR4_3_100k9lin9hh.R.inc(2);gallowImages=Arrays.asList(
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
        __CLR4_3_100k9lin9hh.R.inc(3);game=new Game();
        __CLR4_3_100k9lin9hh.R.inc(4);setTheUI();
    }finally{__CLR4_3_100k9lin9hh.R.flushNeeded();}}
    private String viewEncrypted(String ve){try{__CLR4_3_100k9lin9hh.R.inc(5);
        __CLR4_3_100k9lin9hh.R.inc(6);StringBuilder sb= new StringBuilder();
        __CLR4_3_100k9lin9hh.R.inc(7);for (int i = 0; (((i < ve.length())&&(__CLR4_3_100k9lin9hh.R.iget(8)!=0|true))||(__CLR4_3_100k9lin9hh.R.iget(9)==0&false)); i++) {{
            __CLR4_3_100k9lin9hh.R.inc(10);sb.append(ve.charAt(i)).append(" ");
        }
        }__CLR4_3_100k9lin9hh.R.inc(11);return sb.toString();
    }finally{__CLR4_3_100k9lin9hh.R.flushNeeded();}}
    public void setNickname(String nickName) {try{__CLR4_3_100k9lin9hh.R.inc(12);
        __CLR4_3_100k9lin9hh.R.inc(13);nicknameLabel.setText("Hi,"+nickName+"!");
        __CLR4_3_100k9lin9hh.R.inc(14);System.out.println(nickName);
    }finally{__CLR4_3_100k9lin9hh.R.flushNeeded();}}

    public void setChoice(Object value) {try{__CLR4_3_100k9lin9hh.R.inc(15);
    __CLR4_3_100k9lin9hh.R.inc(16);themeName=""+value;
    }finally{__CLR4_3_100k9lin9hh.R.flushNeeded();}}

    public void getChoice(ActionEvent actionEvent) throws Exception {try{__CLR4_3_100k9lin9hh.R.inc(17);
        __CLR4_3_100k9lin9hh.R.inc(18);Button btn=(Button)actionEvent.getSource();
        __CLR4_3_100k9lin9hh.R.inc(19);game.makeGuess(btn.getText());
        __CLR4_3_100k9lin9hh.R.inc(20);btn.setDisable(true);
        __CLR4_3_100k9lin9hh.R.inc(21);btn.setVisible(false);
        __CLR4_3_100k9lin9hh.R.inc(22);setTheUI();
        __CLR4_3_100k9lin9hh.R.inc(23);if ((((Game.getGameState()==GameState.LOSE|| Game.getGameState()==GameState.WIN)&&(__CLR4_3_100k9lin9hh.R.iget(24)!=0|true))||(__CLR4_3_100k9lin9hh.R.iget(25)==0&false)))
        {{
            __CLR4_3_100k9lin9hh.R.inc(26);disableAllButton();
        }
        }else {__CLR4_3_100k9lin9hh.R.inc(27);if ((((game.isSolvedWord()&& Game.getGameState()== GameState.RUNNING)&&(__CLR4_3_100k9lin9hh.R.iget(28)!=0|true))||(__CLR4_3_100k9lin9hh.R.iget(29)==0&false))){{
            __CLR4_3_100k9lin9hh.R.inc(30);game=new Game();
            __CLR4_3_100k9lin9hh.R.inc(31);resetButtonConfig();
            __CLR4_3_100k9lin9hh.R.inc(32);setTheUI();
        }


    }}}finally{__CLR4_3_100k9lin9hh.R.flushNeeded();}}
    public void setGallowImages(int i){try{__CLR4_3_100k9lin9hh.R.inc(33);
        boolean __CLB4_3_1_bool0=false;__CLR4_3_100k9lin9hh.R.inc(34);switch (i){
            case 0:if (!__CLB4_3_1_bool0) {__CLR4_3_100k9lin9hh.R.inc(35);__CLB4_3_1_bool0=true;}__CLR4_3_100k9lin9hh.R.inc(36);gallows.setImage(gallowImages.get(0)); __CLR4_3_100k9lin9hh.R.inc(37);break;
            case 1:if (!__CLB4_3_1_bool0) {__CLR4_3_100k9lin9hh.R.inc(38);__CLB4_3_1_bool0=true;}__CLR4_3_100k9lin9hh.R.inc(39);gallows.setImage(gallowImages.get(1)); __CLR4_3_100k9lin9hh.R.inc(40);break;
            case 2:if (!__CLB4_3_1_bool0) {__CLR4_3_100k9lin9hh.R.inc(41);__CLB4_3_1_bool0=true;}__CLR4_3_100k9lin9hh.R.inc(42);gallows.setImage(gallowImages.get(2)); __CLR4_3_100k9lin9hh.R.inc(43);break;
            case 3:if (!__CLB4_3_1_bool0) {__CLR4_3_100k9lin9hh.R.inc(44);__CLB4_3_1_bool0=true;}__CLR4_3_100k9lin9hh.R.inc(45);gallows.setImage(gallowImages.get(3)); __CLR4_3_100k9lin9hh.R.inc(46);break;
            case 4:if (!__CLB4_3_1_bool0) {__CLR4_3_100k9lin9hh.R.inc(47);__CLB4_3_1_bool0=true;}__CLR4_3_100k9lin9hh.R.inc(48);gallows.setImage(gallowImages.get(4)); __CLR4_3_100k9lin9hh.R.inc(49);break;
            case 5:if (!__CLB4_3_1_bool0) {__CLR4_3_100k9lin9hh.R.inc(50);__CLB4_3_1_bool0=true;}__CLR4_3_100k9lin9hh.R.inc(51);gallows.setImage(gallowImages.get(5)); __CLR4_3_100k9lin9hh.R.inc(52);break;
            case 6:if (!__CLB4_3_1_bool0) {__CLR4_3_100k9lin9hh.R.inc(53);__CLB4_3_1_bool0=true;}__CLR4_3_100k9lin9hh.R.inc(54);gallows.setImage(gallowImages.get(6)); __CLR4_3_100k9lin9hh.R.inc(55);break;
            case 7:if (!__CLB4_3_1_bool0) {__CLR4_3_100k9lin9hh.R.inc(56);__CLB4_3_1_bool0=true;}__CLR4_3_100k9lin9hh.R.inc(57);gallows.setImage(gallowImages.get(7)); __CLR4_3_100k9lin9hh.R.inc(58);break;
            case 8:if (!__CLB4_3_1_bool0) {__CLR4_3_100k9lin9hh.R.inc(59);__CLB4_3_1_bool0=true;}__CLR4_3_100k9lin9hh.R.inc(60);gallows.setImage(gallowImages.get(8)); __CLR4_3_100k9lin9hh.R.inc(61);break;
            case 9:if (!__CLB4_3_1_bool0) {__CLR4_3_100k9lin9hh.R.inc(62);__CLB4_3_1_bool0=true;}__CLR4_3_100k9lin9hh.R.inc(63);gallows.setImage(gallowImages.get(9)); __CLR4_3_100k9lin9hh.R.inc(64);break;
        }
    }finally{__CLR4_3_100k9lin9hh.R.flushNeeded();}}
    public void disableAllButton(){try{__CLR4_3_100k9lin9hh.R.inc(65);
        __CLR4_3_100k9lin9hh.R.inc(66);for (Node btn:ButtonPane.getChildren()){{
            __CLR4_3_100k9lin9hh.R.inc(67);Button bt=(Button)btn;
            __CLR4_3_100k9lin9hh.R.inc(68);bt.setDisable(true);
            __CLR4_3_100k9lin9hh.R.inc(69);bt.setVisible(false);
        }
    }}finally{__CLR4_3_100k9lin9hh.R.flushNeeded();}}
    public void setTheUI(){try{__CLR4_3_100k9lin9hh.R.inc(70);
        __CLR4_3_100k9lin9hh.R.inc(71);word.setText(viewEncrypted(game.getEncryptedWord()));
        __CLR4_3_100k9lin9hh.R.inc(72);score.setText(""+ Game.getScore());
        __CLR4_3_100k9lin9hh.R.inc(73);setGallowImages(game.getCountFault());
    }finally{__CLR4_3_100k9lin9hh.R.flushNeeded();}}
    public void resetButtonConfig(){try{__CLR4_3_100k9lin9hh.R.inc(74);
        __CLR4_3_100k9lin9hh.R.inc(75);for (Node btn:ButtonPane.getChildren()){{
            __CLR4_3_100k9lin9hh.R.inc(76);Button bt=(Button)btn;
            __CLR4_3_100k9lin9hh.R.inc(77);bt.setDisable(false);
            __CLR4_3_100k9lin9hh.R.inc(78);bt.setVisible(true);
        }
    }}finally{__CLR4_3_100k9lin9hh.R.flushNeeded();}}
}
