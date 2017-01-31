package com.bhntools.convertit;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javax.swing.ImageIcon;


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
    
    
    //_Menu_Help :: MenuItem About
    @FXML public void On_Action_menuItem_How(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText("Hey, Interested :)");
        alert.setContentText("Ooops, This part is under construction. "
                + "Please Contact the developer if you wante it soon.!");
        alert.showAndWait();
    }
   
    //_Menu_Help :: MenuItem About
    @FXML public void On_Action_menuItem_About(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About RecipeConverter");
        
        Image imageViewTools = new LocatedImage("images/RecepiesIcons.png");
        ImageView imageViewTool = new ImageView(imageViewTools);
        alert.setGraphic(imageViewTool);
        alert.setHeaderText("Recipe Converter");
        alert.setHeaderText("RecipeConverter-V.1.0.0");
        alert.setContentText("BHNtools-Copyright©2017.");
        alert.showAndWait(); 
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
    
    
    
    /* ONGLET TODO */
    @FXML public void OnSelection_Onglet() { 
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information DIALOG");
            alert.setHeaderText("Hey, Interested :)");
            alert.setContentText("Ooops, This part is under construction. "
                    + "Please Contact the developer if you wante it soon.!");
            alert.showAndWait();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final Tooltip tooltip = new Tooltip();
        
        tooltip.setText("Converter©2017 - V1.0.0");
        lbl_infosBulles_df.setTooltip(tooltip);
    }
    
}