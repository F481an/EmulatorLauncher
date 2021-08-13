package com.fabian.emulatorlauncher.Controller;

import com.fabian.emulatorlauncher.Handler.LoadHandler;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class MenuBarController {

    @FXML
    public AnchorPane ListMenuPage;
    @FXML
    ListMenuPageController ListMenuPageController;
    @FXML
    public AnchorPane SettingsPage;
    @FXML
    private Button EmulatorListButton;
    @FXML
    private Button SettingsButton;
    @FXML
    private Button CloseButton;

    @FXML
    public void initialize() {
        ListMenuPageController.initList(new LoadHandler().getEmulatorModels());
        ListMenuPage.setVisible(true);
        SettingsPage.setVisible(false);
    }

    @FXML
    public void EmulatorList(MouseEvent mouseEvent) {
        ListMenuPage.setVisible(true);
        SettingsPage.setVisible(false);
    }

    @FXML
    public void Settings(MouseEvent mouseEvent) {
        ListMenuPage.setVisible(false);
        SettingsPage.setVisible(true);
    }

    @FXML
    public void Close(MouseEvent mouseEvent) {
        Platform.exit();
    }
}