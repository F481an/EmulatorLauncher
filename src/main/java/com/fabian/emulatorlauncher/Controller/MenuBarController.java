package com.fabian.emulatorlauncher.Controller;

import com.fabian.emulatorlauncher.Handler.LoadHandler;
import javafx.animation.RotateTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class MenuBarController {

    @FXML
    public AnchorPane ListMenuPage;
    @FXML
    ListMenuPageController ListMenuPageController;
    @FXML
    private AnchorPane SettingsPage;
    @FXML
    SettingsPageController settingsPageController;
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
        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(180);
        rotate.setDuration(Duration.millis(300));
        rotate.setAutoReverse(true);
        rotate.setNode(CloseButton);
        rotate.play();
        rotate.setOnFinished(e -> exit());
    }

    private void exit() {
        Platform.exit();
    }
}