/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.makery.address;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Dialogs;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.plaf.RootPaneUI;

/**
 * FXML Controller class
 *
 * @author hadhiee
 */
public class DialogFXMLController implements Initializable{
    @FXML
    private StackPane rootPane;
 private Stage dialogStage;
    /**
     * Initializes the controller class.
     */
     @Override
    public void initialize(URL location, ResourceBundle resources) {
        new SplashScreen().start();
    }
   public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
    @FXML
    private void handleButtonAction() {
		dialogStage.close();
	}
    @FXML
    private void close() {
		dialogStage.close();
	}

   
    class SplashScreen extends Thread{
        public void run()
        {
            try {
                Thread.sleep(5000);
                
                Platform.runLater(new Runnable() {

                    @Override
                    public void run() {
                        Parent root=null;
                        try{
                         root = FXMLLoader.load(getClass().getResource("RootLayout.fxml"));
                        }catch(IOException ex){
                            Logger.getLogger(DialogFXMLController.class.getName()).log(Level.SEVERE,null, ex);
                        }
                         Scene sc=new Scene(root);
                Stage stage = new Stage();
                stage.setScene(sc);
                stage.show();
                
                rootPane.getScene().getWindow().hide();
                    }
                });
                 
            } catch (InterruptedException ex) {
                Logger.getLogger(DialogFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
               
    }
}
