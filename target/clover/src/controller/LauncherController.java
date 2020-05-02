/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LauncherController {public static class __CLR4_3_18m8mk9q3gbj6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u006e\u0065\u006d\u0065\u0073\u0069\u0073\u002f\u0041\u0073\u007a\u0074\u0061\u006c\u002f\u0054\u0061\u006e\u0075\u006c\u0061\u0073\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u002f\u0068\u0061\u006e\u0067\u006d\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1588452243474L,8589935092L,325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ObservableList<String> themes=FXCollections.observableArrayList("names");
    @FXML
    public Button runButton;
    @FXML
    public ChoiceBox<String> choice;
    @FXML
    private Label errorLabel;
    @FXML
    private TextField nicknameTextfield;

    public void runAction(ActionEvent actionEvent) throws IOException {try{__CLR4_3_18m8mk9q3gbj6.R.inc(310);
        __CLR4_3_18m8mk9q3gbj6.R.inc(311);if ((((nicknameTextfield.getText().isEmpty())&&(__CLR4_3_18m8mk9q3gbj6.R.iget(312)!=0|true))||(__CLR4_3_18m8mk9q3gbj6.R.iget(313)==0&false))) {{
            __CLR4_3_18m8mk9q3gbj6.R.inc(314);errorLabel.setText("* Username is empty!");
        }
        }else {{
            __CLR4_3_18m8mk9q3gbj6.R.inc(315);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
            __CLR4_3_18m8mk9q3gbj6.R.inc(316);Parent root = fxmlLoader.load();
            __CLR4_3_18m8mk9q3gbj6.R.inc(317);fxmlLoader.<GameController>getController().setNickname(nicknameTextfield.getText());
            __CLR4_3_18m8mk9q3gbj6.R.inc(318);fxmlLoader.<GameController>getController().setChoice(choice.getValue());
            __CLR4_3_18m8mk9q3gbj6.R.inc(319);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            __CLR4_3_18m8mk9q3gbj6.R.inc(320);stage.setScene(new Scene(root));
            __CLR4_3_18m8mk9q3gbj6.R.inc(321);stage.show();
        }
    }}finally{__CLR4_3_18m8mk9q3gbj6.R.flushNeeded();}}

    public void initThemes(MouseEvent mouseEvent) {try{__CLR4_3_18m8mk9q3gbj6.R.inc(322);
        __CLR4_3_18m8mk9q3gbj6.R.inc(323);choice.setItems(themes);
        __CLR4_3_18m8mk9q3gbj6.R.inc(324);choice.setValue("names");
    }finally{__CLR4_3_18m8mk9q3gbj6.R.flushNeeded();}}
}
