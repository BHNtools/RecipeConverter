package com.bhntools.convertit;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
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
    
    
    /*__________________________TEMPRATURE _ BEGIN*/ 
    

    /*
    @FXML public void OnPutTxtChanged_Farenhit(){
        String TextCelsius;
        TextCelsius = txtIn_Celsius.getText();
        
        txtIn_Farenhit.clear();
        txtIn_Farenhit.setText(TextCelsius); 
    }
    */
    
    

    public boolean isDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }
        
    @FXML public void OnMouseClicked_Celsius(){
        // GET FARENHIT USER VALUE
        String TextFarenhit;
        TextFarenhit = txtIn_Farenhit.getText();

        //ADD A TEST TO CHECK IF IT S INTEGER OR DUBLE
        if (isDouble(TextFarenhit) == true){
            // CONVERT STRING TO DOUBLE
            double db_converted_value = Double.parseDouble(TextFarenhit.replace(",","."));
            
            // CONVERT FARENHIT TO CELSIUS FOUMULA     
            double convert_in_celsius = (db_converted_value - 32) / 1.8 ;
            
            BigDecimal bd = new BigDecimal(convert_in_celsius).setScale(3, RoundingMode.HALF_EVEN);
            convert_in_celsius = bd.doubleValue();

            // CONVERT DOUBLE TO STRING
            String str_converted_value =Double.toString(convert_in_celsius);

            // PRINT RESULT IN CELSIUS TEXTFIELD
            txtIn_Celsius.setText(str_converted_value);
        
        }else
        {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR DIALOG");
            alert.setHeaderText("Look, an Error Dialog :: Farenhit Value");
            alert.setContentText("Ooops, Please set a correct value of temprature!");
            alert.showAndWait();
        }
        
    }
    
        
    @FXML public void OnMouseClicked_Farenhit(){
        // GET FARENHIT USER VALUE
        String TextCelsius;
        TextCelsius = txtIn_Celsius.getText();
        
        //ADD A TEST TO CHECK IF IT S INTEGER OR DUBLE
        if (isDouble(TextCelsius) == true){
            // CONVERT STRING TO DOUBLE
            double db_converted_value = Double.parseDouble(TextCelsius.replace(",","."));
            
            // CONVERT FARENHIT TO CELSIUS FOUMULA     
            double convert_in_farenhit = db_converted_value * 1.8 + 32 ;

            BigDecimal bd = new BigDecimal(convert_in_farenhit).setScale(3, RoundingMode.HALF_EVEN);
            convert_in_farenhit = bd.doubleValue();
            
            // CONVERT DOUBLE TO STRING
            String str_converted_value = Double.toString(convert_in_farenhit);
            
            // PRINT RESULT IN CELSIUS TEXTFIELD
            txtIn_Farenhit.setText(str_converted_value);       
            
        }else
        {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR DIALOG");
            alert.setHeaderText("Look, an Error Dialog :: Celsius Value");
            alert.setContentText("Ooops, Please set a correct value of temprature!");
            alert.showAndWait();
        }
    }

    
    /*__________________________TEMPRATURE _ END*/
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //lbl_infosBulles_df.setText("Converter©2017 - V1.0.0");
        //lbl_infosBulles_df.setTextFill(Color.RED);
        
        final Tooltip tooltip = new Tooltip();
        
        tooltip.setText("Converter©2017 - V1.0.0");
        lbl_infosBulles_df.setTooltip(tooltip);

        
    }
    
}