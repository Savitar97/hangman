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
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

public class LauncherController {public static class __CLR4_3_12r2rkexbrujh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0069\u0066\u0072\u0069\u0074\u002f\u0068\u0061\u006e\u0067\u006d\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1599773393422L,8589935092L,114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ObservableList<String> themes=FXCollections.observableArrayList("names");
    @FXML
    public Button runButton;
    @FXML
    public ChoiceBox<String> choice;
    @FXML
    private Label errorLabel;
    @FXML
    private TextField nicknameTextfield;

    public void runAction(ActionEvent actionEvent) throws IOException {try{__CLR4_3_12r2rkexbrujh.R.inc(99);
        __CLR4_3_12r2rkexbrujh.R.inc(100);if ((((nicknameTextfield.getText().isEmpty())&&(__CLR4_3_12r2rkexbrujh.R.iget(101)!=0|true))||(__CLR4_3_12r2rkexbrujh.R.iget(102)==0&false))) {{
            __CLR4_3_12r2rkexbrujh.R.inc(103);errorLabel.setText("* Username is empty!");
        }
        }else {{
            __CLR4_3_12r2rkexbrujh.R.inc(104);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
            __CLR4_3_12r2rkexbrujh.R.inc(105);Parent root = fxmlLoader.load();
            __CLR4_3_12r2rkexbrujh.R.inc(106);fxmlLoader.<GameController>getController().setNickname(nicknameTextfield.getText());
            __CLR4_3_12r2rkexbrujh.R.inc(107);fxmlLoader.<GameController>getController().setChoice(choice.getValue());
            __CLR4_3_12r2rkexbrujh.R.inc(108);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            __CLR4_3_12r2rkexbrujh.R.inc(109);stage.setScene(new Scene(root));
            __CLR4_3_12r2rkexbrujh.R.inc(110);stage.show();
        }
    }}finally{__CLR4_3_12r2rkexbrujh.R.flushNeeded();}}

    @FXML
    private void initThemes(MouseEvent mouseEvent) {try{__CLR4_3_12r2rkexbrujh.R.inc(111);
        __CLR4_3_12r2rkexbrujh.R.inc(112);choice.setItems(themes);
        __CLR4_3_12r2rkexbrujh.R.inc(113);choice.setValue("names");
    }finally{__CLR4_3_12r2rkexbrujh.R.flushNeeded();}}
}
