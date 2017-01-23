package com.bhntools.convertit;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

public class ConverterFXControl implements Initializable {
    
    @FXML
    private Label lbl_infosBulles_df;

   
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //lbl_infosBulles_df.setText("Converter©2017 - V1.0.0");
        //lbl_infosBulles_df.setTextFill(Color.RED);
        
        final Tooltip tooltip = new Tooltip();
        
        tooltip.setText("Converter©2017 - V1.0.0 ");
        lbl_infosBulles_df.setTooltip(tooltip);

    }
}
