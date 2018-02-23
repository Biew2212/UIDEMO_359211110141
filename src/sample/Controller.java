package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private loginModel loginModel = new loginModel();

    @FXML
    private JFXTextField username;

    @FXML
    private JFXTextField passwoeg;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private Label loginStatus;

    @FXML
    private Label dbstatus;




    @Override
    public void initialize(URL location, ResourceBundle resources) {
    if (this.loginModel.isDatabaseConnection()){
        this.dbstatus.setText("Connected to DB.");
    }else {
        this.dbstatus.setText("Not Connect to DB.");
    }
    }//initialize

    @FXML
    public void Login (ActionEvent event){
     try {
         if (this.loginModel.isLogin(username.getText(),p)
     }el{
    }//


}//class
