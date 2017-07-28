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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hadhiee
 */
public class SplashController implements Initializable {
    @FXML
    private StackPane rootPane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        new SplashScreen().start();
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
