package com.gc.fakeimagedetection.ui.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.gc.fakeimagedetection.ui.alert.CommonUtil;
import com.jfoenix.controls.JFXButton;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CopyMoveResultController implements Initializable {

	
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private JFXButton resultButton;
    
    private CopyMoveDisplayController copymove_display_controller;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		processResult();
		
	}

	public void processResult() {
		
	}
	
	void displayCopyMove() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/resources/fxml/copymovedisplay.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            copymove_display_controller = fxmlLoader.getController();
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.resizableProperty().set(false);
            stage.setTitle("Result Information");
            stage.setScene(new Scene(root1));
            CommonUtil.attachIcon(stage);
            stage.show();
        } catch (Exception e) {

        }
		
	}
    @FXML
    private void displayMoreInfo(ActionEvent event) {
    	displayCopyMove();
    }
}
