package com.fabian.emulatorlauncher.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class ListMenuPageController {


    @FXML
    private ListView<String> ListOfEmulators;

    @FXML
    public void initialize() {
        ListOfEmulators.getItems().add("sd");
        ListOfEmulators.getItems().add("sd");
        ListOfEmulators.getItems().add("sd");
        ListOfEmulators.getItems().add("sd");
    }
}
