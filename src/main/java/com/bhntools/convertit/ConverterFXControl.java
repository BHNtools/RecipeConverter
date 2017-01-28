package com.bhntools.convertit;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.InputEvent;
import javafx.stage.Stage;



public class ConverterFXControl implements Initializable {
    
    @FXML
    private Label lbl_infosBulles_df;

    @FXML
    private MenuItem menuItem_Close;
    
   
    @FXML
    private MenuItem menuItem_Reset;
             
    @FXML
    private TextField txtIn_Farenhit;
    
    @FXML
    private TextField txtIn_Celsius;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */

    
    //_Menu_File :: MenuItem Close
    @FXML public void OnClicMenuItem_Close(ActionEvent event) {
        Platform.exit();
        System.exit(0);
      }
    
    //_Menu_File :: MenuItem Reset/clear 
    @FXML  public void OnClicMenuItem_Reset(ActionEvent t) {
        txtIn_Celsius.setText("");
        txtIn_Farenhit.setText("");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //lbl_infosBulles_df.setText("Converter©2017 - V1.0.0");
        //lbl_infosBulles_df.setTextFill(Color.RED);
        
        final Tooltip tooltip = new Tooltip();
        
        tooltip.setText("Converter©2017 - V1.0.0");
        lbl_infosBulles_df.setTooltip(tooltip);
    }
    
 
}
