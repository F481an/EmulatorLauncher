package com.fabian.emulatorlauncher.Controller;

import com.fabian.emulatorlauncher.Datamodel.EmulatorModel;
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
    public void initialize() {
    }

    @FXML
    public void LaunchButton(MouseEvent mouseEvent) throws IOException {
        ListOfEmulators.getSelectionModel().getSelectedItem();
        Runtime runTime = Runtime.getRuntime();
        Process process = runTime.exec(emulatorModels.get(ListOfEmulators.getSelectionModel().getSelectedIndex()).getExeFilePath());
    }

    public void initList(List<EmulatorModel> emulatorModels) {
        this.emulatorModels = emulatorModels;
        for (EmulatorModel emulatorModel : emulatorModels) {
            ListOfEmulators.getItems().add(emulatorModel);
        }
    }
}
