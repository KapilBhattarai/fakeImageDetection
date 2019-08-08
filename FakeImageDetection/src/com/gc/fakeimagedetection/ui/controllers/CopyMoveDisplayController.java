package com.gc.fakeimagedetection.ui.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.gc.fakeimagedetection.core.metadata.MetadataProcessor;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public class CopyMoveDisplayController implements Initializable {

	
    @FXML
    private JFXTextArea displayField;
    @FXML
    private JFXButton closeButton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
        displayField.setText(MetadataProcessor.extracted_data);
    }

    @FXML
    private void closeWindow(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
    
}
