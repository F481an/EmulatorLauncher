package com.fabian.emulatorlauncher.Controller;

import com.fabian.emulatorlauncher.Datamodel.EmulatorModel;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class ListMenuPageController {


    @FXML
    private ListView<String> ListOfEmulators;

    @FXML
    public void initialize() {
        ListOfEmulators.getItems().add(new EmulatorModel().toString());

    }
}
