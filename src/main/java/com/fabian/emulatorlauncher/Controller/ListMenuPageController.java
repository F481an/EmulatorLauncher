package com.fabian.emulatorlauncher.Controller;

import com.fabian.emulatorlauncher.Datamodel.EmulatorModel;
import com.fabian.emulatorlauncher.Handler.BackupHandler;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ListMenuPageController {

    @FXML
    private ListView<EmulatorModel> ListOfEmulators;

    List<EmulatorModel> emulatorModels = new LinkedList<>();

    @FXML
    public void LaunchButton(MouseEvent mouseEvent) throws IOException {
        ListOfEmulators.getSelectionModel().getSelectedItem();
        Runtime runTime = Runtime.getRuntime();
        runTime.exec(emulatorModels.get(ListOfEmulators.getSelectionModel().getSelectedIndex()).getExeFilePath());
        Platform.exit();
    }

    @FXML
    public void BackupButton(MouseEvent mouseEvent) {
    new BackupHandler(emulatorModels);
    }

    public void initList(List<EmulatorModel> emulatorModels) {
        this.emulatorModels = emulatorModels;
        for (EmulatorModel emulatorModel : emulatorModels) {
            ListOfEmulators.getItems().add(emulatorModel);
        }
    }
}
