package com.fabian.emulatorlauncher.Controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class MenuBarController {

    @FXML
    public AnchorPane ListMenuPage;
    @FXML
    private Button EmulatorListButton;
    @FXML
    private Button SettingsButton;
    @FXML
    private Button CloseButton;

    @FXML
    public void initialize() {
    }

    public void EmulatorList(MouseEvent mouseEvent) {
    }

    public void Settings(MouseEvent mouseEvent) {
    }

    public void Close(MouseEvent mouseEvent) {
        Platform.exit();
    }
}