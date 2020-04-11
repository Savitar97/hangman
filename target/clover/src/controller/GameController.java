/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package controller;

import game.RandomWord;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.awt.*;
import java.util.List;
import java.util.Arrays;

public class GameController {public static class __CLR4_3_1qqk8v1o2j7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006e\u0065\u006d\u0065\u0073\u0069\u0073\u002f\u0041\u0073\u007a\u0074\u0061\u006c\u002f\u0054\u0061\u006e\u0075\u006c\u0061\u0073\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0068\u0061\u006e\u0067\u006d\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1586574794535L,8589935092L,44,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public Button surrenderGame;
    public Label word;
    public ImageView gallows;
    public Label score;
    private String nickName;
    private String themeName;
    private List<Image> gallowImages;


    @FXML
    private Label nicknameLabel;

    @FXML
    public void initialize(){try{__CLR4_3_1qqk8v1o2j7.R.inc(26);
        __CLR4_3_1qqk8v1o2j7.R.inc(27);System.out.println("Initialize");
        __CLR4_3_1qqk8v1o2j7.R.inc(28);gallowImages=Arrays.asList(
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
        __CLR4_3_1qqk8v1o2j7.R.inc(29);String szo=RandomWord.getWord().toUpperCase();
        __CLR4_3_1qqk8v1o2j7.R.inc(30);word.setText(szo);
    }finally{__CLR4_3_1qqk8v1o2j7.R.flushNeeded();}}

    public void setNickname(String nickName) {try{__CLR4_3_1qqk8v1o2j7.R.inc(31);
    __CLR4_3_1qqk8v1o2j7.R.inc(32);this.nickName=nickName;
        __CLR4_3_1qqk8v1o2j7.R.inc(33);nicknameLabel.setText("Hi,"+nickName+"!");
        __CLR4_3_1qqk8v1o2j7.R.inc(34);gallows.setImage(new Image(String.valueOf(getClass().getResource("/images/hangman1.jpg"))));
        __CLR4_3_1qqk8v1o2j7.R.inc(35);System.out.println(this.nickName);
    }finally{__CLR4_3_1qqk8v1o2j7.R.flushNeeded();}}

    public void setChoice(Object value) {try{__CLR4_3_1qqk8v1o2j7.R.inc(36);
    __CLR4_3_1qqk8v1o2j7.R.inc(37);themeName=""+value;
    }finally{__CLR4_3_1qqk8v1o2j7.R.flushNeeded();}}

    public void getChoice(ActionEvent actionEvent) {try{__CLR4_3_1qqk8v1o2j7.R.inc(38);
        __CLR4_3_1qqk8v1o2j7.R.inc(39);Button btn=(Button)actionEvent.getSource();
        __CLR4_3_1qqk8v1o2j7.R.inc(40);String choice=btn.getText();
        __CLR4_3_1qqk8v1o2j7.R.inc(41);System.out.println(choice);
        __CLR4_3_1qqk8v1o2j7.R.inc(42);btn.setVisible(false);
        __CLR4_3_1qqk8v1o2j7.R.inc(43);btn.setDisable(true);
    }finally{__CLR4_3_1qqk8v1o2j7.R.flushNeeded();}}
}
