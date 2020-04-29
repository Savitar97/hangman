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

@java.lang.SuppressWarnings({"fallthrough"}) public class GameController {public static class __CLR4_3_13636k9kndloq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006e\u0065\u006d\u0065\u0073\u0069\u0073\u002f\u0041\u0073\u007a\u0074\u0061\u006c\u002f\u0054\u0061\u006e\u0075\u006c\u0061\u0073\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0068\u0061\u006e\u0067\u006d\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1588122912152L,8589935092L,193,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public void initialize(){try{__CLR4_3_13636k9kndloq.R.inc(114);
        __CLR4_3_13636k9kndloq.R.inc(115);System.out.println("Initialize");
        __CLR4_3_13636k9kndloq.R.inc(116);gallowImages=Arrays.asList(
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
        __CLR4_3_13636k9kndloq.R.inc(117);game=new Game();
        __CLR4_3_13636k9kndloq.R.inc(118);setTheUI();
    }finally{__CLR4_3_13636k9kndloq.R.flushNeeded();}}
    private String viewEncrypted(String ve){try{__CLR4_3_13636k9kndloq.R.inc(119);
        __CLR4_3_13636k9kndloq.R.inc(120);StringBuilder sb= new StringBuilder();
        __CLR4_3_13636k9kndloq.R.inc(121);for (int i = 0; (((i < ve.length())&&(__CLR4_3_13636k9kndloq.R.iget(122)!=0|true))||(__CLR4_3_13636k9kndloq.R.iget(123)==0&false)); i++) {{
            __CLR4_3_13636k9kndloq.R.inc(124);sb.append(ve.charAt(i)).append(" ");
        }
        }__CLR4_3_13636k9kndloq.R.inc(125);return sb.toString();
    }finally{__CLR4_3_13636k9kndloq.R.flushNeeded();}}
    public void setNickname(String nickName) {try{__CLR4_3_13636k9kndloq.R.inc(126);
        __CLR4_3_13636k9kndloq.R.inc(127);nicknameLabel.setText("Hi,"+nickName+"!");
        __CLR4_3_13636k9kndloq.R.inc(128);System.out.println(nickName);
    }finally{__CLR4_3_13636k9kndloq.R.flushNeeded();}}

    public void setChoice(Object value) {try{__CLR4_3_13636k9kndloq.R.inc(129);
    __CLR4_3_13636k9kndloq.R.inc(130);themeName=""+value;
    }finally{__CLR4_3_13636k9kndloq.R.flushNeeded();}}

    public void getChoice(ActionEvent actionEvent) throws Exception {try{__CLR4_3_13636k9kndloq.R.inc(131);
        __CLR4_3_13636k9kndloq.R.inc(132);Button btn=(Button)actionEvent.getSource();
        __CLR4_3_13636k9kndloq.R.inc(133);game.makeGuess(btn.getText());
        __CLR4_3_13636k9kndloq.R.inc(134);btn.setDisable(true);
        __CLR4_3_13636k9kndloq.R.inc(135);btn.setVisible(false);
        __CLR4_3_13636k9kndloq.R.inc(136);setTheUI();
        __CLR4_3_13636k9kndloq.R.inc(137);if ((((Game.getGameState()==GameState.LOSE|| Game.getGameState()==GameState.WIN)&&(__CLR4_3_13636k9kndloq.R.iget(138)!=0|true))||(__CLR4_3_13636k9kndloq.R.iget(139)==0&false)))
        {{
            __CLR4_3_13636k9kndloq.R.inc(140);disableAllButton();
        }
        }else {__CLR4_3_13636k9kndloq.R.inc(141);if ((((game.isSolvedWord()&& Game.getGameState()== GameState.RUNNING)&&(__CLR4_3_13636k9kndloq.R.iget(142)!=0|true))||(__CLR4_3_13636k9kndloq.R.iget(143)==0&false))){{
            __CLR4_3_13636k9kndloq.R.inc(144);game=new Game();
            __CLR4_3_13636k9kndloq.R.inc(145);resetButtonConfig();
            __CLR4_3_13636k9kndloq.R.inc(146);setTheUI();
        }


    }}}finally{__CLR4_3_13636k9kndloq.R.flushNeeded();}}
    public void setGallowImages(int i){try{__CLR4_3_13636k9kndloq.R.inc(147);
        boolean __CLB4_3_1_bool0=false;__CLR4_3_13636k9kndloq.R.inc(148);switch (i){
            case 0:if (!__CLB4_3_1_bool0) {__CLR4_3_13636k9kndloq.R.inc(149);__CLB4_3_1_bool0=true;}__CLR4_3_13636k9kndloq.R.inc(150);gallows.setImage(gallowImages.get(0)); __CLR4_3_13636k9kndloq.R.inc(151);break;
            case 1:if (!__CLB4_3_1_bool0) {__CLR4_3_13636k9kndloq.R.inc(152);__CLB4_3_1_bool0=true;}__CLR4_3_13636k9kndloq.R.inc(153);gallows.setImage(gallowImages.get(1)); __CLR4_3_13636k9kndloq.R.inc(154);break;
            case 2:if (!__CLB4_3_1_bool0) {__CLR4_3_13636k9kndloq.R.inc(155);__CLB4_3_1_bool0=true;}__CLR4_3_13636k9kndloq.R.inc(156);gallows.setImage(gallowImages.get(2)); __CLR4_3_13636k9kndloq.R.inc(157);break;
            case 3:if (!__CLB4_3_1_bool0) {__CLR4_3_13636k9kndloq.R.inc(158);__CLB4_3_1_bool0=true;}__CLR4_3_13636k9kndloq.R.inc(159);gallows.setImage(gallowImages.get(3)); __CLR4_3_13636k9kndloq.R.inc(160);break;
            case 4:if (!__CLB4_3_1_bool0) {__CLR4_3_13636k9kndloq.R.inc(161);__CLB4_3_1_bool0=true;}__CLR4_3_13636k9kndloq.R.inc(162);gallows.setImage(gallowImages.get(4)); __CLR4_3_13636k9kndloq.R.inc(163);break;
            case 5:if (!__CLB4_3_1_bool0) {__CLR4_3_13636k9kndloq.R.inc(164);__CLB4_3_1_bool0=true;}__CLR4_3_13636k9kndloq.R.inc(165);gallows.setImage(gallowImages.get(5)); __CLR4_3_13636k9kndloq.R.inc(166);break;
            case 6:if (!__CLB4_3_1_bool0) {__CLR4_3_13636k9kndloq.R.inc(167);__CLB4_3_1_bool0=true;}__CLR4_3_13636k9kndloq.R.inc(168);gallows.setImage(gallowImages.get(6)); __CLR4_3_13636k9kndloq.R.inc(169);break;
            case 7:if (!__CLB4_3_1_bool0) {__CLR4_3_13636k9kndloq.R.inc(170);__CLB4_3_1_bool0=true;}__CLR4_3_13636k9kndloq.R.inc(171);gallows.setImage(gallowImages.get(7)); __CLR4_3_13636k9kndloq.R.inc(172);break;
            case 8:if (!__CLB4_3_1_bool0) {__CLR4_3_13636k9kndloq.R.inc(173);__CLB4_3_1_bool0=true;}__CLR4_3_13636k9kndloq.R.inc(174);gallows.setImage(gallowImages.get(8)); __CLR4_3_13636k9kndloq.R.inc(175);break;
            case 9:if (!__CLB4_3_1_bool0) {__CLR4_3_13636k9kndloq.R.inc(176);__CLB4_3_1_bool0=true;}__CLR4_3_13636k9kndloq.R.inc(177);gallows.setImage(gallowImages.get(9)); __CLR4_3_13636k9kndloq.R.inc(178);break;
        }
    }finally{__CLR4_3_13636k9kndloq.R.flushNeeded();}}
    public void disableAllButton(){try{__CLR4_3_13636k9kndloq.R.inc(179);
        __CLR4_3_13636k9kndloq.R.inc(180);for (Node btn:ButtonPane.getChildren()){{
            __CLR4_3_13636k9kndloq.R.inc(181);Button bt=(Button)btn;
            __CLR4_3_13636k9kndloq.R.inc(182);bt.setDisable(true);
            __CLR4_3_13636k9kndloq.R.inc(183);bt.setVisible(false);
        }
    }}finally{__CLR4_3_13636k9kndloq.R.flushNeeded();}}
    public void setTheUI(){try{__CLR4_3_13636k9kndloq.R.inc(184);
        __CLR4_3_13636k9kndloq.R.inc(185);word.setText(viewEncrypted(game.getEncryptedWord()));
        __CLR4_3_13636k9kndloq.R.inc(186);score.setText(""+ Game.getScore());
        __CLR4_3_13636k9kndloq.R.inc(187);setGallowImages(game.getCountFault());
    }finally{__CLR4_3_13636k9kndloq.R.flushNeeded();}}
    public void resetButtonConfig(){try{__CLR4_3_13636k9kndloq.R.inc(188);
        __CLR4_3_13636k9kndloq.R.inc(189);for (Node btn:ButtonPane.getChildren()){{
            __CLR4_3_13636k9kndloq.R.inc(190);Button bt=(Button)btn;
            __CLR4_3_13636k9kndloq.R.inc(191);bt.setDisable(false);
            __CLR4_3_13636k9kndloq.R.inc(192);bt.setVisible(true);
        }
    }}finally{__CLR4_3_13636k9kndloq.R.flushNeeded();}}
}
