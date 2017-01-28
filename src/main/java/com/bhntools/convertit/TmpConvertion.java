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


public class TmpConvertion{
    
    //@FXML
    //private TextField txtIn_Farenhit;
    
    @FXML
    private TextField txtIn_Celsius;

    /*__________________________TEMPRATURE _ BEGIN*/ 
    public boolean isDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    
    public  String ConvertTO_CelsiusValue(String TextFarenhit){
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
            return str_converted_value;
            
        }else
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR DIALOG");
            alert.setHeaderText("Look, an Error Dialog :: Farenhit Value");
            alert.setContentText("Ooops, Please set a correct value of temprature!");
            alert.showAndWait();
            return "ERROR";
        }
        
    }
    
     public  String ConvertTO_FarenhitValue(String TextCelsius){                       
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
            return str_converted_value;
            
        }else
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR DIALOG");
            alert.setHeaderText("Look, an Error Dialog :: Celsius Value");
            alert.setContentText("Ooops, Please set a correct value of temprature!");
            alert.showAndWait();
            
            return "ERROR";
        }
    }
    /*__________________________TEMPRATURE _ END*/

}