package me.loule.navigation.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class MainController implements Initializable {
    @FXML
    private VBox frameCommode;

    @FXML
    private VBox frameFauteuil;

    @FXML
    private AnchorPane pageCentre;

    @FXML
    private Button btnCommode;

    @FXML
    private Button btnFauteuil;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        clearPageCentre();

        btnCommode.setOnMouseClicked(btnCommodeAction -> {
            clearPageCentre();
            pageCentre.getChildren().addAll(frameCommode);
        });

        btnFauteuil.setOnMouseClicked(btnFauteuilAction -> {
            clearPageCentre();
            pageCentre.getChildren().addAll(frameFauteuil);
        });
    }

    public void clearPageCentre() {
        pageCentre.getChildren().removeAll(frameCommode);
        pageCentre.getChildren().removeAll(frameFauteuil);
    }
}