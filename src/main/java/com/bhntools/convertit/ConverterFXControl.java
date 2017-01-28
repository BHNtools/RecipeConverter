package com.bhntools.convertit;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;

import com.bhntools.convertit.TmpConvertion;

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

        
    //_Menu_File :: MenuItem Reset/clear 
    @FXML  public void OnClicMenuItem_Reset(ActionEvent t) {
        txtIn_Celsius.setText("0");
        txtIn_Farenhit.setText("32");
    }
    

    //_Menu_File :: MenuItem Close
    @FXML public void OnClicMenuItem_Close(ActionEvent event) {
        Platform.exit();
        System.exit(0);
      }
    
    
    /*__________________________TEMPRATURE _ BEGIN*/ 
    @FXML public void OnMouseClicked_Celsius(){
        // GET FARENHIT USER VALUE
        String TextFarenhit;
        TextFarenhit = txtIn_Farenhit.getText();
        
        String str_converted_value;
        TmpConvertion convertToCelsius = new TmpConvertion();
        str_converted_value = convertToCelsius.ConvertTO_CelsiusValue(TextFarenhit);                
       // PRINT RESULT IN CELSIUS TEXTFIELD
        txtIn_Celsius.setText(str_converted_value);  
    }
    
    @FXML public void OnMouseClicked_Farenhit(){                
        // GET FARENHIT USER VALUE
        String TextCelsius;
        TextCelsius = txtIn_Celsius.getText();
    
        String str_converted_value;
        TmpConvertion convertToFarenhit = new TmpConvertion();
        str_converted_value = convertToFarenhit.ConvertTO_FarenhitValue(TextCelsius);    
       // PRINT RESULT IN CELSIUS TEXTFIELD
        txtIn_Farenhit.setText(str_converted_value);  
    }
    /*__________________________TEMPRATURE _ END*/
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final Tooltip tooltip = new Tooltip();
        
        tooltip.setText("Converter©2017 - V1.0.0");
        lbl_infosBulles_df.setTooltip(tooltip);
    }
    
}